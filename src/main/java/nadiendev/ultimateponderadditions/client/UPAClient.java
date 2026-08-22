package nadiendev.ultimateponderadditions.client;

import nadiendev.ultimateponderadditions.UPAConfig;
import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.internal.guide.UPAGuide;
import nadiendev.ultimateponderadditions.internal.ponder.PonderIntegration;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = UltimatePonderAdditions.MODID, dist = Dist.CLIENT)
public class UPAClient {
    public UPAClient(IEventBus modEventBus) {
        if (UPAConfig.guidebookEnabled()) {
            UPAGuide.build();
        }

        modEventBus.addListener(UPAClient::onClientSetup);
    }

    private static void onClientSetup(FMLClientSetupEvent event) {
        if (UltimatePonderAdditions.ponderLoaded()) {
            PonderIntegration.init();
        } else {
            UltimatePonderAdditions.LOGGER.info(
                    "Ponder is not installed - scenes are disabled, the guidebook still works.");
        }
    }
}
