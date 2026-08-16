package nadiendev.ultimateponderadditions.api;

import net.createmod.ponder.api.registration.MultiSceneBuilder;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.StoryBoardEntry;
import net.createmod.ponder.api.scene.PonderStoryBoard;
import net.minecraft.resources.ResourceLocation;

public interface SceneRegistration {
    String namespace();

    PonderSceneRegistrationHelper<ResourceLocation> raw();

    ResourceLocation asLocation(String path);

    StoryBoardEntry scene(ResourceLocation component, String schematicPath, PonderStoryBoard storyBoard,
                          ResourceLocation... tags);

    StoryBoardEntry scene(String componentId, String schematicPath, PonderStoryBoard storyBoard, String... tags);

    MultiSceneBuilder forComponents(ResourceLocation... components);

    MultiSceneBuilder forComponents(String... componentIds);

    boolean isModLoaded(String modId);
}
