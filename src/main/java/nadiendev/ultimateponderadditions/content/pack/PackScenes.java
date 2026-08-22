package nadiendev.ultimateponderadditions.content.pack;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import nadiendev.ultimateponderadditions.api.util.RegistryLookup;
import net.createmod.catnip.math.Pointing;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;

public final class PackScenes {
    private PackScenes() {
    }

    public static void ae2Controller(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_ae2_controller", "A tidy AE2 Controller");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "The ME Controller, laid out so every face stays reachable.", 2.0, 2.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void ae2CraftingCube(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_ae2_crafting_cube", "The crafting cube");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "The brain of the network: storage, accelerators and a monitor in one block.",
                        2.0, 2.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void ae2Assembler(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_ae2_assembler", "Molecular assembler bank");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "Pattern Providers feeding a bank of Molecular Assemblers.", 2.0, 2.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void arsRecipes(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_ars_recipes", "Ars Nouveau recipes");
        ScenePresets.showAll(scene, util);
        scene.idle(20);

        ScenePresets.pointText(scene, 80, "Ars Nouveau offers magical recipes using magic catalysts.", 1, 1, 1)
                .attachKeyFrame();
        scene.idle(100);

        ScenePresets.pointText(scene, 100,
                        "The enchanting apparatus requires a core underneath it, while an imbuement chamber does not.",
                        1, 2.5, 1)
                .attachKeyFrame();
        scene.idle(120);

        ScenePresets.pointText(scene, 110,
                        "Place recipe ingredients in pedestals one block from the catalyst.", 1, 1.5, 0)
                .attachKeyFrame();
        scene.idle(130);

        ScenePresets.pointText(scene, 60, "Place the middle ingredient in the catalyst.", 1, 2.5, 1)
                .attachKeyFrame();
        scene.idle(80);

        ScenePresets.pointText(scene, 70, "The recipe will begin, but may require source nearby.", 1, 2.5, 1)
                .attachKeyFrame();
        scene.idle(90);

        ScenePresets.pointText(scene, 100,
                        "The enchanting apparatus consumes materials in pedestals while the imbuement chamber does not.",
                        1, 2.5, 1)
                .attachKeyFrame();
        scene.idle(110);
    }

    public static void createAndesiteCasing(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_andesite_casing", "Automatic Andesite Casing");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "Andesite Casing on tap, and it plays nicely with an ME network.",
                        2.0, 2.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void createLumber(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_create_lumber", "Automatic lumber");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "A tree farm that keeps the log supply going on its own.", 2.0, 2.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void laserDrillSetup(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_laser_drill", "Laser drill, done right");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "Twelve drills around one base, and power to keep them all fed.",
                        2.0, 2.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void stasisChamber(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_stasis_chamber", "The Stasis Chamber");
        ScenePresets.showAll(scene, util);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "The Stasis Chamber, wired up and ready to run.", 2.0, 1.5, 2.5)
                .colored(PonderPalette.RED)
                .attachKeyFrame();
        scene.idle(70);
    }

    public static void harvesterPylon(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_harvester_pylon", "Using the Harvester Pylon");
        scene.showBasePlate();
        scene.idle(10);

        scene.overlay().showText(40).text("The Harvester Pylon is placed in the water block for the farm.")
                .independent(20).placeNearTarget();
        scene.idle(20);

        scene.world().hideSection(ScenePresets.box(util, 0, 0, 0, 9, 0, 3), Direction.DOWN);
        scene.idle(10);

        scene.overlay().showControls(new Vec3(4.5, 1, 4.5), Pointing.DOWN, 20)
                .rightClick()
                .withItem(RegistryLookup.stack("pylons:harvester_pylon"));
        scene.idle(10);

        scene.world().setBlock(new BlockPos(4, 0, 4),
                RegistryLookup.state("pylons:harvester_pylon[waterlogged=true]"), false);
        scene.idle(20);
        scene.addLazyKeyframe();

        scene.overlay().showText(40).text("It needs a hoe in its inventory to operate.")
                .independent(20).placeNearTarget();
        scene.idle(10);
        scene.overlay().showControls(new Vec3(4.5, 1, 4.5), Pointing.DOWN, 20)
                .withItem(RegistryLookup.stack("minecraft:stone_hoe"));
        scene.idle(20);

        scene.overlay().showText(40).text("The hoe's durability is used up as it harvests.")
                .independent(36).placeNearTarget();
        scene.idle(30);
        scene.addLazyKeyframe();

        scene.overlay().showText(40).text("It also needs storage above it to place harvested items into.")
                .independent(20).placeNearTarget();
        scene.idle(10);
        scene.overlay().showControls(new Vec3(4.5, 2, 4.5), Pointing.DOWN, 20)
                .rightClick()
                .withItem(RegistryLookup.stack("minecraft:barrel"));
        scene.idle(10);
        scene.world().showSection(util.select().position(4, 1, 4), Direction.DOWN);
        scene.idle(20);
        scene.addLazyKeyframe();

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 9, 0, 3), Direction.UP);
        scene.idle(10);

        Selection threeBy = util.select().fromTo(3, 1, 3, 5, 1, 5).substract(util.select().position(4, 1, 4));
        Selection fiveBy = util.select().fromTo(2, 1, 2, 6, 1, 6).substract(util.select().position(4, 1, 4));
        Selection sevenBy = util.select().fromTo(1, 1, 1, 7, 1, 7).substract(util.select().position(4, 1, 4));
        Selection nineBy = util.select().fromTo(0, 1, 0, 8, 1, 8).substract(util.select().position(4, 1, 4));

        scene.world().setBlocks(nineBy, RegistryLookup.state("minecraft:wheat[age=7]"), false);
        scene.world().showSection(nineBy, Direction.UP);
        scene.idle(10);

        scene.overlay().showText(60).text("Its working area can be set to 3x3, 5x5, 7x7 or 9x9.")
                .independent(20).placeNearTarget();
        scene.idle(20);

        harvestStep(scene, util, threeBy, "3x3", "threeby");
        harvestStep(scene, util, fiveBy, "5x5", "fiveby");
        harvestStep(scene, util, sevenBy, "7x7", "sevenby");
        harvestStep(scene, util, nineBy, "9x9", "nineby");
    }

    private static void harvestStep(SceneBuilder scene, SceneBuildingUtil util, Selection area, String label,
                                    String slot) {
        scene.overlay().showText(20).text(label).independent(68).placeNearTarget();
        scene.idle(10);
        scene.overlay().showOutline(PonderPalette.GREEN, slot, area, 30);
        scene.idle(10);
        scene.world().setBlocks(area, RegistryLookup.state("minecraft:wheat[age=0]"), false);
        scene.idle(10);
    }
}
