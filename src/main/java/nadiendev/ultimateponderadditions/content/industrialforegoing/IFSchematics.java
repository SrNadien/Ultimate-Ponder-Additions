package nadiendev.ultimateponderadditions.content.industrialforegoing;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class IFSchematics {
    public static final String IF = "industrialforegoing:";

    public static final SchematicTemplate PLANT_FARM = SchematicTemplate
            .builder("industrialforegoing/plant_farm", 5, 4, 5)
            .basePlate("minecraft:dirt")
            .fill(1, 0, 1, 3, 0, 3, "minecraft:farmland[moisture=7]")
            .fill(1, 1, 1, 3, 1, 3, "minecraft:wheat[age=7]")
            .set(2, 1, 0, IF + "plant_sower")
            .set(2, 1, 4, IF + "plant_gatherer")
            .set(1, 1, 4, "minecraft:barrel[facing=up,open=false]")
            .set(3, 1, 4, IF + "plant_fertilizer")
            .build();

    public static final SchematicTemplate MOB_FARM = SchematicTemplate
            .builder("industrialforegoing/mob_farm", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .set(1, 1, 2, IF + "mob_duplicator")
            .set(3, 1, 2, IF + "mob_crusher")
            .set(3, 1, 0, "minecraft:barrel[facing=up,open=false]")
            .set(1, 1, 0, IF + "mob_slaughter_factory")
            .build();

    public static final SchematicTemplate LASER_DRILL = SchematicTemplate
            .builder("industrialforegoing/laser_drill", 5, 4, 5)
            .basePlate("minecraft:stone")
            .set(2, 1, 2, IF + "ore_laser_base")
            .set(0, 1, 2, IF + "laser_drill")
            .set(4, 1, 2, IF + "laser_drill")
            .set(2, 1, 0, IF + "laser_drill")
            .set(2, 1, 4, IF + "laser_drill")
            .build();

    public static final SchematicTemplate POWER = SchematicTemplate
            .builder("industrialforegoing/power", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .set(2, 1, 2, IF + "bioreactor")
            .set(2, 1, 4, IF + "biofuel_generator")
            .set(0, 1, 2, IF + "pitiful_generator")
            .set(4, 1, 2, IF + "sludge_refiner")
            .set(2, 1, 0, IF + "latex_processing_unit")
            .build();

    public static final SchematicTemplate CONVEYOR = SchematicTemplate
            .builder("industrialforegoing/conveyor", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .fill(2, 1, 0, 2, 1, 3, IF + "conveyor")
            .set(2, 1, 4, "minecraft:chest[facing=south,type=single,waterlogged=false]")
            .set(1, 1, 2, IF + "block_placer")
            .set(3, 1, 2, IF + "block_breaker")
            .build();

    private IFSchematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(PLANT_FARM, MOB_FARM, LASER_DRILL, POWER, CONVEYOR);
    }
}
