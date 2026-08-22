package nadiendev.ultimateponderadditions.content.pack;

import java.util.List;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class PackAddon extends BuiltInAddon {
    private static final String TAG = UPATags.CUSTOM;

    @Override
    public String id() {
        return "custom";
    }

    @Override
    public List<String> requiredMods() {
        return List.of();
    }

    @Override
    public int priority() {
        return 50;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(TAG, "minecraft:crafting_table")
                .title("Custom")
                .description("Hand-built setups: multiblock layouts and machine arrangements worth copying.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        if (reg.isModLoaded("ae2")) {
            reg.scene("ae2:controller", "pack/controlador_ae2", PackScenes::ae2Controller, TAG)
                    .highlightAllTags();
            reg.forComponents("ae2:crafting_accelerator", "ae2:crafting_unit", "ae2:256k_crafting_storage")
                    .addStoryBoard("pack/pc_applied", PackScenes::ae2CraftingCube, reg.asLocation(TAG));
            reg.forComponents("ae2:pattern_provider", "ae2:molecular_assembler")
                    .addStoryBoard("pack/ensambladora_molecular", PackScenes::ae2Assembler, reg.asLocation(TAG));
        }

        if (reg.isModLoaded("ars_nouveau")) {
            reg.forComponents("ars_nouveau:enchanting_apparatus", "ars_nouveau:imbuement_chamber",
                            "ars_nouveau:arcane_core", "ars_nouveau:arcane_pedestal")
                    .addStoryBoard("pack/arsponder1", PackScenes::arsRecipes, reg.asLocation(TAG));
        }

        if (reg.isModLoaded("create")) {
            reg.scene("create:andesite_casing", "pack/andesite_cassing_automatic",
                            PackScenes::createAndesiteCasing, TAG)
                    .highlightAllTags();
            reg.forComponents("minecraft:oak_log", "minecraft:spruce_log", "minecraft:birch_log",
                            "minecraft:jungle_log", "minecraft:acacia_log", "minecraft:dark_oak_log")
                    .addStoryBoard("pack/madera_create", PackScenes::createLumber, reg.asLocation(TAG));
        }

        if (reg.isModLoaded("industrialforegoing")) {
            reg.forComponents("industrialforegoing:ore_laser_base", "industrialforegoing:laser_drill")
                    .addStoryBoard("pack/laser_drill", PackScenes::laserDrillSetup, reg.asLocation(TAG));
            reg.scene("industrialforegoing:stasis_chamber", "pack/camara_de_estasis",
                            PackScenes::stasisChamber, TAG)
                    .highlightAllTags();
        }

        if (reg.isModLoaded("pylons")) {
            reg.scene("pylons:harvester_pylon", "pack/farm", PackScenes::harvesterPylon, TAG)
                    .highlightAllTags();
        }

        if (reg.isModLoaded("mekanismgenerators")) {
            reg.scene("mekanismgenerators:fission_reactor_casing", "pack/fission_mek",
                            MekanismScenes::fissionReactor, TAG)
                    .highlightAllTags();
            reg.forComponents("mekanismgenerators:fission_fuel_assembly",
                            "mekanismgenerators:control_rod_assembly")
                    .addStoryBoard("pack/fission_mek", MekanismScenes::fissionFuelRods, reg.asLocation(TAG));
            reg.scene("mekanismgenerators:fission_reactor_logic_adapter", "pack/fission_logic_example",
                            MekanismScenes::fissionLogicAdapter, TAG)
                    .highlightAllTags();
            reg.scene("mekanismgenerators:fission_reactor_port", "pack/fission_mek",
                            MekanismScenes::fissionPorts, TAG)
                    .highlightAllTags();

            reg.forComponents("mekanismgenerators:fusion_reactor_frame",
                            "mekanismgenerators:fusion_reactor_port",
                            "mekanismgenerators:fusion_reactor_controller",
                            "mekanismgenerators:fusion_reactor_logic_adapter")
                    .addStoryBoard("pack/fusion_mek", MekanismScenes::fusionReactor, reg.asLocation(TAG));
            reg.forComponents("mekanismgenerators:turbine_casing", "mekanismgenerators:turbine_valve",
                            "mekanismgenerators:turbine_vent", "mekanismgenerators:turbine_rotor",
                            "mekanismgenerators:turbine_blade", "mekanismgenerators:rotational_complex",
                            "mekanismgenerators:saturating_condenser", "mekanismgenerators:electromagnetic_coil",
                            "mekanism:pressure_disperser")
                    .addStoryBoard("pack/turbine_mek", MekanismScenes::industrialTurbine, reg.asLocation(TAG));

            reg.forComponents("mekanismgenerators:hohlraum", "mekanismgenerators:laser_focus_matrix")
                    .addStoryBoard("pack/fusion_activation", MekanismScenes::fusionActivation,
                            reg.asLocation(TAG));
        }

        if (reg.isModLoaded("mekanism")) {
            reg.forComponents("mekanism:induction_casing", "mekanism:induction_port")
                    .addStoryBoard("pack/induction_matrix", MekanismScenes::inductionMatrix, reg.asLocation(TAG));
            reg.forComponents("mekanism:sps_casing", "mekanism:sps_port", "mekanism:supercharged_coil")
                    .addStoryBoard("pack/sps", MekanismScenes::supercriticalPhaseShifter, reg.asLocation(TAG));
        }
    }
}
