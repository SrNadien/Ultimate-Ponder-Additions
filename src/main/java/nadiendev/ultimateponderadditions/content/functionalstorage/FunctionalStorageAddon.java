package nadiendev.ultimateponderadditions.content.functionalstorage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class FunctionalStorageAddon extends BuiltInAddon {
    private static final String FS = FSSchematics.FS;

    private static final List<String> WOODS = List.of(
            "acacia", "birch", "cherry", "crimson", "dark_oak", "framed", "jungle",
            "mangrove", "oak", "spruce", "warped");

    @Override
    public String id() {
        return "functionalstorage";
    }

    @Override
    public int priority() {
        return 200;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.FUNCTIONAL_STORAGE, FS + "oak_1")
                .title("Functional Storage")
                .description("Drawers, controllers and the cabinets that hold what drawers will not.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.FUNCTIONAL_STORAGE;

        reg.forComponents(drawerVariants().toArray(String[]::new))
                .addStoryBoard(FSSchematics.DRAWERS.path(), FSScenes::drawers, reg.asLocation(tag));

        reg.scene(FS + "storage_controller", FSSchematics.CONTROLLER.path(), FSScenes::controller, tag)
                .highlightAllTags();
        reg.scene(FS + "framed_storage_controller", FSSchematics.CONTROLLER.path(), FSScenes::controller, tag)
                .highlightAllTags();
        reg.scene(FS + "controller_extension", FSSchematics.CONTROLLER.path(), FSScenes::controller, tag)
                .highlightAllTags();
        reg.scene(FS + "framed_controller_extension", FSSchematics.CONTROLLER.path(), FSScenes::controller, tag)
                .highlightAllTags();

        reg.forComponents(
                        FS + "compacting_drawer",
                        FS + "compacting_framed_drawer",
                        FS + "simple_compacting_drawer",
                        FS + "framed_simple_compacting_drawer")
                .addStoryBoard(FSSchematics.COMPACTING.path(), FSScenes::compacting, reg.asLocation(tag));

        reg.scene(FS + "ender_drawer", FSSchematics.ENDER.path(), FSScenes::enderDrawer, tag)
                .highlightAllTags();

        reg.scene(FS + "armory_cabinet", FSSchematics.ARMORY.path(), FSScenes::armoryCabinet, tag)
                .highlightAllTags();
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return FSSchematics.all();
    }

    private static List<String> drawerVariants() {
        List<String> variants = new ArrayList<>();
        for (String wood : WOODS) {
            variants.add(FS + wood + "_1");
            variants.add(FS + wood + "_2");
            variants.add(FS + wood + "_4");
        }
        return variants;
    }
}
