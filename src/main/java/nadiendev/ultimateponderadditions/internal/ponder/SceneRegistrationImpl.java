package nadiendev.ultimateponderadditions.internal.ponder;

import java.util.Arrays;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.createmod.ponder.api.registration.MultiSceneBuilder;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.StoryBoardEntry;
import net.createmod.ponder.api.scene.PonderStoryBoard;
import net.minecraft.resources.ResourceLocation;

public final class SceneRegistrationImpl implements SceneRegistration {
    private final String namespace;
    private final PonderSceneRegistrationHelper<ResourceLocation> helper;

    public SceneRegistrationImpl(String namespace, PonderSceneRegistrationHelper<ResourceLocation> helper) {
        this.namespace = namespace;
        this.helper = helper;
    }

    @Override
    public String namespace() {
        return namespace;
    }

    @Override
    public PonderSceneRegistrationHelper<ResourceLocation> raw() {
        return helper;
    }

    @Override
    public ResourceLocation asLocation(String path) {
        return ResourceLocation.fromNamespaceAndPath(namespace, path);
    }

    @Override
    public StoryBoardEntry scene(ResourceLocation component, String schematicPath, PonderStoryBoard storyBoard,
                                 ResourceLocation... tags) {
        return helper.addStoryBoard(component, schematicPath, storyBoard, tags);
    }

    @Override
    public StoryBoardEntry scene(String componentId, String schematicPath, PonderStoryBoard storyBoard,
                                 String... tags) {
        ResourceLocation[] resolved = Arrays.stream(tags).map(this::resolve).toArray(ResourceLocation[]::new);
        return scene(resolve(componentId), schematicPath, storyBoard, resolved);
    }

    @Override
    public MultiSceneBuilder forComponents(ResourceLocation... components) {
        return helper.forComponents(components);
    }

    @Override
    public MultiSceneBuilder forComponents(String... componentIds) {
        return forComponents(Arrays.stream(componentIds).map(this::resolve).toArray(ResourceLocation[]::new));
    }

    @Override
    public boolean isModLoaded(String modId) {
        return AddonManager.isDataGeneration() || UltimatePonderAdditions.isLoaded(modId);
    }

    private ResourceLocation resolve(String id) {
        return id.indexOf(':') < 0 ? asLocation(id) : ResourceLocation.parse(id);
    }
}
