package nadiendev.ultimateponderadditions.api.guide;

import java.util.Collection;
import java.util.List;

import guideme.GuideBuilder;

public interface GuideAddon {
    String id();

    default Collection<String> requiredMods() {
        return List.of(id());
    }

    void configureGuide(GuideBuilder builder);
}
