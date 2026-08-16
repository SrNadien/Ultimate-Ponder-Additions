package nadiendev.ultimateponderadditions.content.ae2;

import java.util.Collection;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class AppliedEnergisticsAddon extends BuiltInAddon {
    private static final String AE = AE2Schematics.AE;

    @Override
    public String id() {
        return "ae2";
    }

    @Override
    public int priority() {
        return 400;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.APPLIED_ENERGISTICS, AE + "controller")
                .title("Applied Energistics 2")
                .description("Networks, channels, storage cells and the machines that feed them.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.APPLIED_ENERGISTICS;

        reg.scene(AE + "inscriber", AE2Schematics.INSCRIBER.path(), AE2Scenes::inscriber, tag)
                .highlightAllTags();

        reg.forComponents(
                        AE + "flawless_budding_quartz",
                        AE + "flawed_budding_quartz",
                        AE + "chipped_budding_quartz",
                        AE + "damaged_budding_quartz",
                        AE + "growth_accelerator",
                        AE + "quartz_cluster")
                .addStoryBoard(AE2Schematics.GROWTH.path(), AE2Scenes::growth, reg.asLocation(tag));

        reg.forComponents(
                        AE + "controller",
                        AE + "drive",
                        AE + "energy_acceptor",
                        AE + "chest",
                        AE + "energy_cell",
                        AE + "dense_energy_cell")
                .addStoryBoard(AE2Schematics.NETWORK.path(), AE2Scenes::network, reg.asLocation(tag));

        reg.forComponents(
                        AE + "crafting_unit",
                        AE + "crafting_accelerator",
                        AE + "crafting_monitor",
                        AE + "1k_crafting_storage",
                        AE + "4k_crafting_storage",
                        AE + "16k_crafting_storage",
                        AE + "64k_crafting_storage",
                        AE + "256k_crafting_storage",
                        AE + "pattern_provider",
                        AE + "molecular_assembler")
                .addStoryBoard(AE2Schematics.CRAFTING_CPU.path(), AE2Scenes::craftingCpu, reg.asLocation(tag));

        reg.forComponents(AE + "charger", AE + "crank", AE + "vibration_chamber")
                .addStoryBoard(AE2Schematics.CHARGER.path(), AE2Scenes::charger, reg.asLocation(tag));
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return AE2Schematics.all();
    }
}
