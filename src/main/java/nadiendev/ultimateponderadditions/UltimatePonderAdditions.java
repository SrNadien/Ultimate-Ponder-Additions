package nadiendev.ultimateponderadditions;

import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(UltimatePonderAdditions.MODID)
public class UltimatePonderAdditions {
    public static final String MODID = "ultimateponderadditions";
    public static final String NAME = "Ultimate Ponder Additions";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static final ResourceLocation GUIDE_ID = ResourceLocation.fromNamespaceAndPath(MODID, "guide");

    public UltimatePonderAdditions(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, UPAConfig.SPEC);

        AddonManager.discover();

        UPARegistries.register(modEventBus);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    public static boolean ponderLoaded() {
        return isLoaded("ponder");
    }

    public static boolean isLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}
