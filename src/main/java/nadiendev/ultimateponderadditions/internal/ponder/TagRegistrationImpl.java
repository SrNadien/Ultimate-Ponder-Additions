package nadiendev.ultimateponderadditions.internal.ponder;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.util.RegistryLookup;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.registration.TagBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public final class TagRegistrationImpl implements TagRegistration {
    private final String namespace;
    private final PonderTagRegistrationHelper<ResourceLocation> helper;

    public TagRegistrationImpl(String namespace, PonderTagRegistrationHelper<ResourceLocation> helper) {
        this.namespace = namespace;
        this.helper = helper;
    }

    @Override
    public String namespace() {
        return namespace;
    }

    @Override
    public PonderTagRegistrationHelper<ResourceLocation> raw() {
        return helper;
    }

    @Override
    public ResourceLocation asLocation(String path) {
        return ResourceLocation.fromNamespaceAndPath(namespace, path);
    }

    @Override
    public TagBuilder tag(String path) {
        return helper.registerTag(asLocation(path));
    }

    @Override
    public TagBuilder tag(String path, String iconItemId) {
        TagBuilder builder = tag(path);
        Item icon = RegistryLookup.item(iconItemId);
        if (icon != Items.AIR) {
            builder.item(icon, true, true);
        }
        return builder;
    }

    @Override
    public void addToTag(ResourceLocation tag, ResourceLocation... components) {
        for (ResourceLocation component : components) {
            helper.addTagToComponent(component, tag);
        }
    }

    @Override
    public void addToTag(String tagPath, String... componentIds) {
        ResourceLocation tag = resolve(tagPath);
        for (String componentId : componentIds) {
            helper.addTagToComponent(resolve(componentId), tag);
        }
    }

    @Override
    public boolean isModLoaded(String modId) {
        return UltimatePonderAdditions.isLoaded(modId);
    }

    private ResourceLocation resolve(String id) {
        return id.indexOf(':') < 0 ? asLocation(id) : ResourceLocation.parse(id);
    }
}
