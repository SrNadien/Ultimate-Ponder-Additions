package nadiendev.ultimateponderadditions.content.functionalstorage;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class FSSchematics {
    public static final String FS = "functionalstorage:";

    public static final SchematicTemplate DRAWERS = SchematicTemplate
            .builder("functionalstorage/drawers", 5, 4, 5)
            .basePlate("minecraft:oak_planks")
            .set(1, 1, 2, FS + "oak_1")
            .set(2, 1, 2, FS + "oak_2")
            .set(3, 1, 2, FS + "oak_4")
            .build();

    public static final SchematicTemplate CONTROLLER = SchematicTemplate
            .builder("functionalstorage/controller", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .set(2, 1, 2, FS + "storage_controller")
            .set(1, 1, 2, FS + "oak_1")
            .set(3, 1, 2, FS + "oak_2")
            .set(2, 1, 1, FS + "oak_4")
            .set(2, 1, 3, FS + "oak_2")
            .set(2, 2, 2, FS + "controller_extension")
            .set(2, 3, 2, FS + "oak_4")
            .build();

    public static final SchematicTemplate COMPACTING = SchematicTemplate
            .builder("functionalstorage/compacting_drawer", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .set(2, 1, 2, FS + "compacting_drawer")
            .set(1, 1, 2, FS + "simple_compacting_drawer")
            .set(3, 1, 2, "minecraft:iron_block")
            .build();

    public static final SchematicTemplate ENDER = SchematicTemplate
            .builder("functionalstorage/ender_drawer", 5, 4, 5)
            .basePlate("minecraft:end_stone_bricks")
            .set(1, 1, 2, FS + "ender_drawer")
            .set(3, 1, 2, FS + "ender_drawer")
            .set(1, 0, 2, "minecraft:obsidian")
            .set(3, 0, 2, "minecraft:obsidian")
            .build();

    public static final SchematicTemplate ARMORY = SchematicTemplate
            .builder("functionalstorage/armory_cabinet", 5, 4, 5)
            .basePlate("minecraft:polished_andesite")
            .set(2, 1, 2, FS + "armory_cabinet")
            .set(4, 1, 2, "minecraft:chest[facing=east,type=single,waterlogged=false]")
            .build();

    private FSSchematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(DRAWERS, CONTROLLER, COMPACTING, ENDER, ARMORY);
    }
}
