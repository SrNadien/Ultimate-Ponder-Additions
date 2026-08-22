package nadiendev.ultimateponderadditions.content.exdeorum;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class ExDeorumSchematics {

    public static final String EXD = "exdeorum:";

    public static final SchematicTemplate BARREL = SchematicTemplate
            .builder("exdeorum/barrel", 5, 4, 5)
            .basePlate("minecraft:oak_planks")
            .set(1, 1, 2, EXD + "oak_barrel")
            .set(2, 1, 2, EXD + "oak_barrel")
            .set(3, 1, 2, EXD + "stone_barrel")
            .build();

    public static final SchematicTemplate CRUCIBLE = SchematicTemplate
            .builder("exdeorum/crucible", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .set(1, 1, 2, "minecraft:torch")
            .set(1, 2, 2, EXD + "oak_crucible")
            .set(3, 1, 2, "minecraft:magma_block")
            .set(3, 2, 2, EXD + "porcelain_crucible")
            .build();

    public static final SchematicTemplate SIEVE = SchematicTemplate
            .builder("exdeorum/sieve", 5, 4, 5)
            .basePlate("minecraft:oak_planks")
            .set(1, 1, 2, EXD + "oak_sieve")
            .set(2, 1, 2, EXD + "oak_sieve")
            .set(3, 1, 2, EXD + "oak_compressed_sieve")
            .build();

    public static final SchematicTemplate HAMMER = SchematicTemplate
            .builder("exdeorum/hammer", 5, 4, 5)
            .basePlate("minecraft:stone_bricks")
            .set(1, 1, 2, "minecraft:cobblestone")
            .set(2, 1, 2, "minecraft:gravel")
            .set(3, 1, 2, "minecraft:sand")
            .set(2, 1, 0, EXD + "infested_leaves")
            .build();

    public static final SchematicTemplate MECHANICAL = SchematicTemplate
            .builder("exdeorum/mechanical", 5, 4, 5)
            .basePlate("minecraft:polished_andesite")
            .set(1, 1, 2, EXD + "mechanical_hammer")
            .set(3, 1, 2, EXD + "mechanical_sieve")
            .set(2, 1, 2, "minecraft:hopper[facing=down,enabled=true]")
            .set(2, 0, 2, "minecraft:chest[facing=south,type=single,waterlogged=false]")
            .build();

    private ExDeorumSchematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(BARREL, CRUCIBLE, SIEVE, HAMMER, MECHANICAL);
    }
}
