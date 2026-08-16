package nadiendev.ultimateponderadditions.internal;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import nadiendev.ultimateponderadditions.UPAConfig;
import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.PonderAddon;
import nadiendev.ultimateponderadditions.api.UPAAddon;
import nadiendev.ultimateponderadditions.api.guide.GuideAddon;
import nadiendev.ultimateponderadditions.content.BuiltInAddons;
import net.neoforged.fml.ModList;
import net.neoforged.neoforgespi.language.ModFileScanData;
import org.objectweb.asm.Type;

public final class AddonManager {
    private static final Type ADDON_ANNOTATION = Type.getType(UPAAddon.class);

    private static final Map<String, PonderAddon> PONDER_ADDONS = new LinkedHashMap<>();
    private static final Map<String, GuideAddon> GUIDE_ADDONS = new LinkedHashMap<>();

    private static boolean discovered;

    private static volatile boolean dataGeneration;

    private AddonManager() {
    }

    public static void setDataGeneration(boolean enabled) {
        dataGeneration = enabled;
    }

    public static synchronized void discover() {
        if (discovered) {
            return;
        }
        discovered = true;

        BuiltInAddons.registerAll();
        scanAnnotations();

        UltimatePonderAdditions.LOGGER.info("Discovered {} Ponder addon(s) and {} guide addon(s)",
                PONDER_ADDONS.size(), GUIDE_ADDONS.size());
    }

    public static synchronized void register(PonderAddon addon) {
        PonderAddon previous = PONDER_ADDONS.putIfAbsent(addon.id(), addon);
        if (previous != null && previous != addon) {
            throw new IllegalStateException("Two Ponder addons claim the id '" + addon.id() + "': "
                    + previous.getClass().getName() + " and " + addon.getClass().getName());
        }
    }

    public static synchronized void register(GuideAddon addon) {
        GuideAddon previous = GUIDE_ADDONS.putIfAbsent(addon.id(), addon);
        if (previous != null && previous != addon) {
            throw new IllegalStateException("Two guide addons claim the id '" + addon.id() + "': "
                    + previous.getClass().getName() + " and " + addon.getClass().getName());
        }
    }

    public static Collection<PonderAddon> ponderAddons() {
        return List.copyOf(PONDER_ADDONS.values());
    }

    public static Collection<GuideAddon> guideAddons() {
        return List.copyOf(GUIDE_ADDONS.values());
    }

    public static List<PonderAddon> activePonderAddons() {
        List<PonderAddon> active = new ArrayList<>();
        for (PonderAddon addon : PONDER_ADDONS.values()) {
            if (isActive(addon.id(), addon.requiredMods())) {
                active.add(addon);
            }
        }
        active.sort(Comparator.comparingInt(PonderAddon::priority).thenComparing(PonderAddon::id));
        return active;
    }

    public static List<GuideAddon> activeGuideAddons() {
        List<GuideAddon> active = new ArrayList<>();
        for (GuideAddon addon : GUIDE_ADDONS.values()) {
            if (isActive(addon.id(), addon.requiredMods())) {
                active.add(addon);
            }
        }
        return active;
    }

    public static boolean isActive(String addonId) {
        PonderAddon ponder = PONDER_ADDONS.get(addonId);
        if (ponder != null) {
            return isActive(addonId, ponder.requiredMods());
        }
        GuideAddon guide = GUIDE_ADDONS.get(addonId);
        return guide != null && isActive(addonId, guide.requiredMods());
    }

    private static boolean isActive(String addonId, Collection<String> requiredMods) {
        if (UPAConfig.isAddonDisabled(addonId)) {
            return false;
        }
        return allLoaded(requiredMods);
    }

    private static boolean allLoaded(Collection<String> modIds) {
        if (dataGeneration) {
            return true;
        }
        for (String modId : modIds) {
            if (!UltimatePonderAdditions.isLoaded(modId)) {
                return false;
            }
        }
        return true;
    }

    private static void scanAnnotations() {
        for (ModFileScanData scanData : ModList.get().getAllScanData()) {
            for (ModFileScanData.AnnotationData annotation : scanData.getAnnotations()) {
                if (annotation.targetType() != ElementType.TYPE
                        || !ADDON_ANNOTATION.equals(annotation.annotationType())) {
                    continue;
                }
                instantiate(annotation);
            }
        }
    }

    private static void instantiate(ModFileScanData.AnnotationData annotation) {
        String className = annotation.clazz().getClassName();

        List<String> required = readRequiredMods(annotation);
        if (!allLoaded(required)) {
            UltimatePonderAdditions.LOGGER.debug("Skipping addon {}: requires {}", className, required);
            return;
        }

        try {
            Class<?> clazz = Class.forName(className, false, AddonManager.class.getClassLoader());
            Object instance = null;

            if (PonderAddon.class.isAssignableFrom(clazz)) {
                instance = clazz.getDeclaredConstructor().newInstance();
                register((PonderAddon) instance);
            }

            if (UltimatePonderAdditions.isLoaded("guideme") && GuideAddon.class.isAssignableFrom(clazz)) {
                if (instance == null) {
                    instance = clazz.getDeclaredConstructor().newInstance();
                }
                register((GuideAddon) instance);
            }

            if (instance == null) {
                UltimatePonderAdditions.LOGGER.warn(
                        "{} is annotated with @UPAAddon but implements neither PonderAddon nor GuideAddon",
                        className);
            }
        } catch (ReflectiveOperationException | LinkageError e) {
            UltimatePonderAdditions.LOGGER.error("Failed to instantiate Ponder addon {}", className, e);
        }
    }

    @SuppressWarnings("unchecked")
    private static List<String> readRequiredMods(ModFileScanData.AnnotationData annotation) {
        Object value = annotation.annotationData().get("requiredMods");
        if (value instanceof List<?> list) {
            return (List<String>) list;
        }
        return List.of();
    }
}
