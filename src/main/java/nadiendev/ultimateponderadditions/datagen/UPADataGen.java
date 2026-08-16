package nadiendev.ultimateponderadditions.datagen;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = UltimatePonderAdditions.MODID)
public class UPADataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        AddonManager.setDataGeneration(true);

        generator.addProvider(event.includeClient(), new SchematicProvider(output));
        generator.addProvider(event.includeClient(), new UPALangProvider(output, "en_us", UPALang::english));
        generator.addProvider(event.includeClient(), new UPALangProvider(output, "es_es", UPALang::spanish));
    }
}
