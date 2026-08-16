package nadiendev.ultimateponderadditions;

import java.util.List;
import java.util.Locale;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class UPAConfig {
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.BooleanValue ENABLE_GUIDEBOOK;
    public static final ModConfigSpec.BooleanValue ENABLE_PONDER_SCENES;
    public static final ModConfigSpec.ConfigValue<List<? extends String>> DISABLED_ADDONS;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("Ultimate Ponder Additions").push("general");

        ENABLE_PONDER_SCENES = builder
                .comment("Register the Ponder scenes shipped by this mod and its addons.",
                        "Turning this off leaves Ponder installed but removes every scene added here.")
                .define("enablePonderScenes", true);

        ENABLE_GUIDEBOOK = builder
                .comment("Build the GuideME guidebook. Requires GuideME to be installed.")
                .define("enableGuidebook", true);

        DISABLED_ADDONS = builder
                .comment("Ids of addons that should not be loaded, for example [\"industrialforegoing\"].",
                        "Built-in ids: industrialforegoing, functionalstorage, chickens, ae2.")
                .defineListAllowEmpty("disabledAddons", List.of(), () -> "", o -> o instanceof String);

        builder.pop();

        SPEC = builder.build();
    }

    private UPAConfig() {
    }

    public static boolean isAddonDisabled(String addonId) {
        List<? extends String> disabledAddons;
        try {
            disabledAddons = DISABLED_ADDONS.get();
        } catch (IllegalStateException e) {
            return false;
        }

        String normalized = addonId.toLowerCase(Locale.ROOT);
        for (String disabled : disabledAddons) {
            if (disabled.toLowerCase(Locale.ROOT).equals(normalized)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ponderScenesEnabled() {
        try {
            return ENABLE_PONDER_SCENES.get();
        } catch (IllegalStateException e) {
            return true;
        }
    }
}
