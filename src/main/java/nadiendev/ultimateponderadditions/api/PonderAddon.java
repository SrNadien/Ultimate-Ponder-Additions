package nadiendev.ultimateponderadditions.api;

import java.util.Collection;
import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import net.createmod.ponder.api.registration.IndexExclusionHelper;
import net.createmod.ponder.api.registration.SharedTextRegistrationHelper;

public interface PonderAddon {
    String id();

    default String namespace() {
        return id();
    }

    default Collection<String> requiredMods() {
        return List.of(id());
    }

    default int priority() {
        return 1000;
    }

    void registerScenes(SceneRegistration reg);

    default void registerTags(TagRegistration reg) {
    }

    default void registerSharedText(SharedTextRegistrationHelper helper) {
    }

    default void excludeFromIndex(IndexExclusionHelper helper) {
    }

    default Collection<SchematicTemplate> schematics() {
        return List.of();
    }
}
