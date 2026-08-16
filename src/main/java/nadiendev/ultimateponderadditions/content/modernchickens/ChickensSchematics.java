package nadiendev.ultimateponderadditions.content.modernchickens;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class ChickensSchematics {
    public static final String MC = "chickens:";

    public static final SchematicTemplate ROOST = SchematicTemplate
            .builder("chickens/roost", 5, 4, 5)
            .basePlate("minecraft:hay_block[axis=y]")
            .set(2, 1, 2, MC + "roost")
            .set(2, 1, 4, MC + "collector")
            .set(1, 1, 2, MC + "mechanical_roost")
            .build();

    public static final SchematicTemplate BREEDER = SchematicTemplate
            .builder("chickens/breeder", 5, 4, 5)
            .basePlate("minecraft:oak_planks")
            .set(2, 1, 2, MC + "breeder")
            .set(1, 1, 2, MC + "nest")
            .set(3, 1, 2, MC + "mechanical_nest")
            .build();

    public static final SchematicTemplate HENHOUSE = SchematicTemplate
            .builder("chickens/henhouse", 5, 4, 5)
            .basePlate("minecraft:grass_block[snowy=false]")
            .fill(1, 0, 1, 3, 0, 3, "minecraft:hay_block[axis=y]")
            .set(2, 1, 2, MC + "henhouse")
            .set(0, 1, 2, MC + "henhouse_spruce")
            .set(4, 1, 2, MC + "henhouse_birch")
            .build();

    public static final SchematicTemplate INCUBATOR = SchematicTemplate
            .builder("chickens/incubator", 5, 4, 5)
            .basePlate("minecraft:polished_blackstone_bricks")
            .set(2, 1, 2, MC + "incubator")
            .set(1, 1, 2, MC + "avian_dousing_machine")
            .set(3, 1, 2, MC + "roost")
            .build();

    public static final SchematicTemplate GENERATOR = SchematicTemplate
            .builder("chickens/roost_generator", 5, 4, 5)
            .basePlate("minecraft:polished_andesite")
            .set(2, 1, 2, MC + "mechanical_roost")
            .set(1, 1, 2, MC + "avian_flux_converter")
            .set(3, 1, 2, MC + "avian_fluid_converter")
            .set(2, 1, 4, MC + "avian_chemical_converter")
            .set(2, 1, 0, MC + "avian_dousing_machine")
            .build();

    private ChickensSchematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(ROOST, BREEDER, HENHOUSE, INCUBATOR, GENERATOR);
    }
}
