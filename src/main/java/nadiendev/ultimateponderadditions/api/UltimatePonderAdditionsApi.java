package nadiendev.ultimateponderadditions.api;

import java.util.Collection;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.guide.GuideAddon;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.minecraft.resources.ResourceLocation;

public final class UltimatePonderAdditionsApi {
    private UltimatePonderAdditionsApi() {
    }

    public static String modId() {
        return UltimatePonderAdditions.MODID;
    }

    public static ResourceLocation guideId() {
        return UltimatePonderAdditions.GUIDE_ID;
    }

    public static void register(PonderAddon addon) {
        AddonManager.register(addon);
    }

    public static void register(GuideAddon addon) {
        AddonManager.register(addon);
    }

    public static Collection<PonderAddon> ponderAddons() {
        return AddonManager.ponderAddons();
    }

    public static Collection<GuideAddon> guideAddons() {
        return AddonManager.guideAddons();
    }

    public static boolean isAddonActive(String addonId) {
        return AddonManager.isActive(addonId);
    }
}
