package nadiendev.ultimateponderadditions.content.modernfoundry;

import java.util.Collection;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class ModernFoundryAddon extends BuiltInAddon {
    private static final String MF = MFSchematics.MF;

    @Override
    public String id() {
        return "modernfoundry";
    }

    @Override
    public int priority() {
        return 500;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.MODERN_FOUNDRY, MF + "smeltery_controller")
                .title("Modern Foundry")
                .description("Melters, smelteries and everything that pours molten metal into a mould.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.MODERN_FOUNDRY;

        reg.forComponents(MF + "seared_melter", MF + "seared_heater")
                .addStoryBoard(MFSchematics.MELTER.path(), MFScenes::melter, reg.asLocation(tag));

        reg.forComponents(MF + "smeltery_controller", MF + "seared_bricks", MF + "seared_cobble",
                        MF + "seared_fuel_tank", MF + "seared_glass", MF + "grout")
                .addStoryBoard(MFSchematics.SMELTERY.path(), MFScenes::smeltery, reg.asLocation(tag));

        reg.forComponents(MF + "seared_faucet", MF + "seared_basin", MF + "seared_table",
                        MF + "seared_channel", MF + "seared_ingot_tank", MF + "seared_casting_tank")
                .addStoryBoard(MFSchematics.CASTING.path(), MFScenes::casting, reg.asLocation(tag));

        reg.forComponents(MF + "seared_drain", MF + "seared_duct", MF + "seared_chute")
                .addStoryBoard(MFSchematics.PORTS.path(), MFScenes::ports, reg.asLocation(tag));
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return MFSchematics.all();
    }
}
