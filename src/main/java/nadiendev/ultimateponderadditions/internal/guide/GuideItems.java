package nadiendev.ultimateponderadditions.internal.guide;

import guideme.Guides;
import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import net.minecraft.world.item.ItemStack;

public final class GuideItems {
    private GuideItems() {
    }

    public static ItemStack guideStack() {
        return Guides.createGuideItem(UltimatePonderAdditions.GUIDE_ID);
    }
}
