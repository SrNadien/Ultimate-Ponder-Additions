package nadiendev.ultimateponderadditions.content.modernfoundry;

import java.util.List;

import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;

public final class MFSchematics {

    public static final String MF = "modernfoundry:";

    public static final SchematicTemplate MELTER = SchematicTemplate
            .builder("modernfoundry/melter", 5, 4, 5)
            .basePlate(MF + "seared_cobble")
            .set(2, 1, 2, MF + "seared_heater")
            .set(2, 2, 2, MF + "seared_melter")
            .set(2, 2, 1, MF + "seared_faucet")
            .set(2, 1, 1, MF + "seared_basin")
            .set(1, 1, 3, MF + "seared_table")
            .build();

    public static final SchematicTemplate SMELTERY = SchematicTemplate
            .builder("modernfoundry/smeltery", 5, 4, 5)
            .basePlate(MF + "seared_cobble")
            .layer(1, MF + "seared_bricks")
            .outline(0, 0, 4, 4, 2, MF + "seared_bricks")
            .outline(0, 0, 4, 4, 3, MF + "seared_bricks")
            .set(2, 2, 0, MF + "smeltery_controller")
            .set(0, 2, 2, MF + "seared_fuel_tank")
            .set(4, 2, 2, MF + "seared_drain")
            .set(2, 2, 4, MF + "seared_glass")
            .build();

    public static final SchematicTemplate CASTING = SchematicTemplate
            .builder("modernfoundry/casting", 5, 4, 5)
            .basePlate(MF + "seared_cobble")
            .set(2, 1, 2, MF + "seared_ingot_tank")
            .set(2, 2, 2, MF + "seared_ingot_tank")
            .set(2, 2, 1, MF + "seared_faucet")
            .set(2, 1, 1, MF + "seared_basin")
            .set(2, 2, 3, MF + "seared_faucet")
            .set(2, 1, 3, MF + "seared_table")
            .set(4, 1, 2, MF + "seared_channel")
            .build();

    public static final SchematicTemplate PORTS = SchematicTemplate
            .builder("modernfoundry/ports", 5, 4, 5)
            .basePlate(MF + "seared_cobble")
            .fill(1, 1, 2, 3, 1, 2, MF + "seared_bricks")
            .set(1, 2, 2, MF + "seared_drain")
            .set(2, 2, 2, MF + "seared_duct")
            .set(3, 2, 2, MF + "seared_chute")
            .set(1, 3, 2, MF + "seared_bricks")
            .set(2, 3, 2, MF + "seared_bricks")
            .set(3, 3, 2, MF + "seared_bricks")
            .build();

    private MFSchematics() {
    }

    public static List<SchematicTemplate> all() {
        return List.of(MELTER, SMELTERY, CASTING, PORTS);
    }
}
