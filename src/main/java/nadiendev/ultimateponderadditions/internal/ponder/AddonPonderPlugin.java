package nadiendev.ultimateponderadditions.internal.ponder;

import nadiendev.ultimateponderadditions.UPAConfig;
import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.PonderAddon;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.createmod.ponder.api.registration.IndexExclusionHelper;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.registration.SharedTextRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public final class AddonPonderPlugin implements PonderPlugin {
    private final PonderAddon addon;

    public AddonPonderPlugin(PonderAddon addon) {
        this.addon = addon;
    }

    @Override
    public String getModId() {
        return addon.namespace();
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        if (!enabled()) {
            return;
        }
        run("scenes", () -> addon.registerScenes(new SceneRegistrationImpl(addon.namespace(), helper)));
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        if (!enabled()) {
            return;
        }
        run("tags", () -> addon.registerTags(new TagRegistrationImpl(addon.namespace(), helper)));
    }

    @Override
    public void registerSharedText(SharedTextRegistrationHelper helper) {
        if (!enabled()) {
            return;
        }
        run("shared text", () -> addon.registerSharedText(helper));
    }

    @Override
    public void indexExclusions(IndexExclusionHelper helper) {
        if (!enabled()) {
            return;
        }
        run("index exclusions", () -> addon.excludeFromIndex(helper));
    }

    private boolean enabled() {
        return UPAConfig.ponderScenesEnabled() && AddonManager.isActive(addon.id());
    }

    private void run(String what, Runnable action) {
        try {
            action.run();
        } catch (RuntimeException | LinkageError e) {
            UltimatePonderAdditions.LOGGER.error("Addon '{}' failed while registering {}", addon.id(), what, e);
        }
    }
}
