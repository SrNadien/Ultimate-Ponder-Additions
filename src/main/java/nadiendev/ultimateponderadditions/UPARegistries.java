package nadiendev.ultimateponderadditions;

import nadiendev.ultimateponderadditions.internal.guide.GuideItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class UPARegistries {
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UltimatePonderAdditions.MODID);

    private UPARegistries() {
    }

    public static void register(IEventBus modEventBus) {
        TABS.register("main", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup." + UltimatePonderAdditions.MODID))
                .icon(GuideItems::guideStack)
                .displayItems((params, output) -> output.accept(GuideItems.guideStack()))
                .build());

        TABS.register(modEventBus);
    }
}
