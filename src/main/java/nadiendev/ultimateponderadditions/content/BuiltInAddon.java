package nadiendev.ultimateponderadditions.content;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.PonderAddon;

public abstract class BuiltInAddon implements PonderAddon {
    @Override
    public String namespace() {
        return UltimatePonderAdditions.MODID;
    }
}
