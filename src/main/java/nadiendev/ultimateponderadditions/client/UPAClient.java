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
        modEventBus.addListener(UPAClient::onClientSetup);
    }

    private static void onClientSetup(FMLClientSetupEvent event) {
        PonderIntegration.init();

        if (UPAConfig.ENABLE_GUIDEBOOK.get()) {
            UPAGuide.build();
        }
    }
}
