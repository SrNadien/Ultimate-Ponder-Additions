package nadiendev.ultimateponderadditions.content;

import nadiendev.ultimateponderadditions.content.ae2.AppliedEnergisticsAddon;
import nadiendev.ultimateponderadditions.content.functionalstorage.FunctionalStorageAddon;
import nadiendev.ultimateponderadditions.content.industrialforegoing.IndustrialForegoingAddon;
import nadiendev.ultimateponderadditions.content.modernchickens.ModernChickensAddon;
import nadiendev.ultimateponderadditions.internal.AddonManager;

public final class BuiltInAddons {
    private BuiltInAddons() {
    }

    public static void registerAll() {
        AddonManager.register(new IndustrialForegoingAddon());
        AddonManager.register(new FunctionalStorageAddon());
        AddonManager.register(new ModernChickensAddon());
        AddonManager.register(new AppliedEnergisticsAddon());
    }
}
