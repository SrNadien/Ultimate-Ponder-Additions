package nadiendev.ultimateponderadditions.internal.guide;

import java.util.List;
import java.util.Optional;

import guideme.Guide;
import guideme.GuideBuilder;
import guideme.GuideItemSettings;
import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.guide.GuideAddon;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.Nullable;

public final class UPAGuide {
    @Nullable
    private static Guide guide;

    private UPAGuide() {
    }

    public static void build() {
        AddonManager.discover();

        if (guide != null) {
            return;
        }

        GuideBuilder builder = Guide.builder(UltimatePonderAdditions.GUIDE_ID)
                .itemSettings(new GuideItemSettings(
                        Optional.of(Component.translatable("item.ultimateponderadditions.guide")),
                        List.of(Component.translatable("item.ultimateponderadditions.guide.tooltip")
                                .withStyle(ChatFormatting.GRAY)),
                        Optional.empty()));

        for (GuideAddon addon : AddonManager.activeGuideAddons()) {
            try {
                addon.configureGuide(builder);
            } catch (RuntimeException | LinkageError e) {
                UltimatePonderAdditions.LOGGER.error("Guide addon '{}' failed to configure the guidebook",
                        addon.id(), e);
            }
        }

        guide = builder.build();
        UltimatePonderAdditions.LOGGER.info("Built guidebook {}", UltimatePonderAdditions.GUIDE_ID);
    }

    @Nullable
    public static Guide get() {
        return guide;
    }
}
