package nadiendev.ultimateponderadditions.api;

import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.registration.TagBuilder;
import net.minecraft.resources.ResourceLocation;

public interface TagRegistration {
    String namespace();

    PonderTagRegistrationHelper<ResourceLocation> raw();

    ResourceLocation asLocation(String path);

    TagBuilder tag(String path);

    TagBuilder tag(String path, String iconItemId);

    void addToTag(ResourceLocation tag, ResourceLocation... components);

    void addToTag(String tagPath, String... componentIds);

    boolean isModLoaded(String modId);
}
