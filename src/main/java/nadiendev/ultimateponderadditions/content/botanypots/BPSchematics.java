package nadiendev.ultimateponderadditions.content.botanypots;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class BPSchematics {

    public static final String BP = "botanypots:";

    public static final SchematicTemplate POTS = SchematicTemplate
            .builder("botanypots/pots", 5, 4, 5)
            .basePlate("minecraft:coarse_dirt")
            .set(1, 1, 2, "minecraft:stone_bricks")
            .set(2, 1, 2, "minecraft:chest[facing=south,type=single,waterlogged=false]")
            .set(3, 1, 2, "minecraft:stone_bricks")
            .set(1, 2, 2, BP + "terracotta_botany_pot")
            .set(2, 2, 2, BP + "terracotta_hopper_botany_pot")
            .set(3, 2, 2, BP + "terracotta_waxed_botany_pot")
            .build();

    private BPSchematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(POTS);
    }
}
