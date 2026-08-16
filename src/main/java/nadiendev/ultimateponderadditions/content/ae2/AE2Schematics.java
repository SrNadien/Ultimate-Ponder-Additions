package nadiendev.ultimateponderadditions.content.ae2;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class AE2Schematics {
    public static final String AE = "ae2:";

    public static final SchematicTemplate INSCRIBER = SchematicTemplate
            .builder("ae2/inscriber", 5, 4, 5)
            .basePlate("ae2:smooth_sky_stone_block")
            .set(1, 1, 2, AE + "inscriber")
            .set(2, 1, 2, AE + "inscriber")
            .set(3, 1, 2, AE + "inscriber")
            .set(2, 1, 0, AE + "energy_acceptor")
            .set(2, 1, 4, AE + "energy_cell")
            .build();

    public static final SchematicTemplate GROWTH = SchematicTemplate
            .builder("ae2/growth_accelerator", 5, 4, 5)
            .basePlate("ae2:smooth_sky_stone_block")
            .set(2, 1, 2, AE + "flawless_budding_quartz")
            .set(1, 1, 2, AE + "growth_accelerator")
            .set(3, 1, 2, AE + "growth_accelerator")
            .set(2, 1, 1, AE + "growth_accelerator")
            .set(2, 1, 3, AE + "growth_accelerator")
            .set(2, 2, 2, AE + "quartz_cluster[facing=up,waterlogged=false]")
            .build();

    public static final SchematicTemplate NETWORK = SchematicTemplate
            .builder("ae2/network", 5, 4, 5)
            .basePlate("ae2:smooth_sky_stone_block")
            .set(0, 1, 2, AE + "energy_acceptor")
            .set(1, 1, 2, AE + "controller")
            .set(2, 1, 2, AE + "cable_bus")
            .set(3, 1, 2, AE + "drive")
            .set(2, 2, 2, AE + "cable_bus")
            .set(2, 1, 4, AE + "chest")
            .build();

    public static final SchematicTemplate CRAFTING_CPU = SchematicTemplate
            .builder("ae2/crafting_cpu", 5, 4, 5)
            .basePlate("ae2:smooth_sky_stone_block")
            .set(1, 1, 1, AE + "1k_crafting_storage")
            .set(2, 1, 1, AE + "4k_crafting_storage")
            .set(1, 1, 2, AE + "crafting_accelerator")
            .set(2, 1, 2, AE + "crafting_unit")
            .set(1, 2, 1, AE + "crafting_monitor")
            .set(2, 2, 1, AE + "crafting_unit")
            .set(1, 2, 2, AE + "crafting_unit")
            .set(2, 2, 2, AE + "crafting_accelerator")
            .set(4, 1, 2, AE + "pattern_provider")
            .set(4, 1, 1, AE + "molecular_assembler")
            .build();

    public static final SchematicTemplate CHARGER = SchematicTemplate
            .builder("ae2/charger", 5, 4, 5)
            .basePlate("ae2:sky_stone_brick")
            .set(2, 1, 2, AE + "charger")
            .set(2, 2, 2, AE + "crank")
            .set(0, 1, 2, AE + "vibration_chamber")
            .set(4, 1, 2, AE + "energy_acceptor")
            .build();

    private AE2Schematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(INSCRIBER, GROWTH, NETWORK, CRAFTING_CPU, CHARGER);
    }
}
