package nadiendev.ultimateponderadditions.internal.ponder;

import java.util.Comparator;
import java.util.List;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.PonderAddon;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.createmod.ponder.foundation.PonderIndex;

public final class PonderIntegration {
    private static boolean initialised;

    private PonderIntegration() {
    }

    public static synchronized void init() {
        if (initialised) {
            return;
        }
        initialised = true;

        List<PonderAddon> addons = List.copyOf(AddonManager.ponderAddons())
                .stream()
                .sorted(Comparator.comparingInt(PonderAddon::priority).thenComparing(PonderAddon::id))
                .toList();

        for (PonderAddon addon : addons) {
            PonderIndex.addPlugin(new AddonPonderPlugin(addon));
            UltimatePonderAdditions.LOGGER.debug("Registered Ponder plugin for addon '{}' (namespace '{}')",
                    addon.id(), addon.namespace());
        }
    }
}
