package nadiendev.ultimateponderadditions.content.pack;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import nadiendev.ultimateponderadditions.api.util.RegistryLookup;
import net.createmod.catnip.math.Pointing;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;

public final class MekanismScenes {
    private static final String GEN = "mekanismgenerators:";

    private MekanismScenes() {
    }

    public static void fissionReactor(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_fission_reactor", "Mekanism Fission Reactor");

        scene.world().showSection(util.select().position(4, 0, 4), Direction.DOWN);
        scene.idle(5);

        for (int n = 1; n <= 4; n++) {
            scene.world().showSection(util.select().position(4, n, 4), Direction.DOWN);
            scene.world().showSection(util.select().position(4, 0, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 0, 4), Direction.DOWN);
            scene.idle(5);
        }

        for (int n = 1; n <= 3; n++) {
            scene.world().showSection(util.select().position(4, 4, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 4, 4), Direction.DOWN);
            scene.world().showSection(util.select().position(0, 0, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 0, 0), Direction.DOWN);
            scene.world().showSection(util.select().position(0, n, 4), Direction.DOWN);
            scene.world().showSection(util.select().position(4, n, 0), Direction.DOWN);
            scene.idle(5);
        }

        ScenePresets.pointText(scene, 80, "The edges must be casings.", 0, 4.5, 4.5);

        scene.world().showSection(util.select().position(4, 4, 0), Direction.DOWN);
        scene.world().showSection(util.select().position(0, 4, 4), Direction.DOWN);
        scene.world().showSection(util.select().position(0, 0, 0), Direction.DOWN);
        scene.idle(5);

        for (int n = 1; n <= 3; n++) {
            scene.world().showSection(util.select().position(0, n, 0), Direction.DOWN);
            scene.world().showSection(util.select().position(0, 4, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 4, 0), Direction.DOWN);
            scene.idle(5);
        }

        scene.world().showSection(util.select().position(0, 4, 0), Direction.DOWN);
        scene.addKeyframe();
        scene.idle(80);

        scene.world().showSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.DOWN);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 0, 1, 3, 0, 3), Direction.UP);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 1, 0, 3, 3, 0), Direction.SOUTH);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 1, 4, 3, 3, 4), Direction.NORTH);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 1, 0, 3, 3), Direction.EAST);
        scene.idle(5);

        ScenePresets.pointText(scene, 80, "The walls can be either casings or reactor glass.", 0, 2.5, 2.5);

        scene.world().showSection(ScenePresets.box(util, 4, 1, 1, 4, 3, 3), Direction.WEST);
        scene.addKeyframe();
        scene.idle(80);

        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 3, 4, 0), Direction.UP);
        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 0, 4, 3), Direction.UP);
        scene.world().hideSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.UP);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "Place fuel assembly blocks inside to make the fuel rods.", 2.5, 2.5, 2.5);
        setAndShow(scene, util, 2, 1, 2, GEN + "fission_fuel_assembly");
        scene.idle(10);
        setAndShow(scene, util, 2, 2, 2, GEN + "fission_fuel_assembly");
        scene.idle(10);
        scene.addKeyframe();
        scene.idle(40);

        setAndShow(scene, util, 2, 3, 2, GEN + "control_rod_assembly");
        scene.idle(10);
        ScenePresets.pointText(scene, 60, "Put a control rod assembly at the top of each fuel rod.", 2.5, 3.5, 2.5);
        scene.idle(20);
        scene.addKeyframe();
        scene.idle(60);

        scene.world().showSection(ScenePresets.box(util, 0, 1, 0, 3, 4, 0), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 0, 0, 4, 3), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.UP);
        scene.addKeyframe();
        scene.idle(40);
    }

    public static void fissionFuelRods(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_fission_fuel_rods", "Fission Reactor: fuel assemblies");

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 4, 4, 4), Direction.DOWN);
        scene.idle(20);
        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 3, 4, 3), Direction.UP);
        scene.idle(20);

        ScenePresets.pointText(scene, 80, "Place fuel assembly blocks inside to make the fuel rods.", 2.5, 2.5, 2.5)
                .attachKeyFrame();
        setAndShow(scene, util, 2, 1, 2, GEN + "fission_fuel_assembly");
        scene.idle(10);
        setAndShow(scene, util, 2, 2, 2, GEN + "fission_fuel_assembly");
        scene.idle(80);

        ScenePresets.pointText(scene, 120,
                "A fuel rod is several fuel assemblies with a control rod assembly on top.", 1.5, 2.5, 2.5);
        scene.idle(40);
        scene.addKeyframe();
        setAndShow(scene, util, 2, 3, 2, GEN + "control_rod_assembly");
        scene.idle(80);

        ScenePresets.pointText(scene, 80, "Control rod assemblies sit one block below the ceiling.", 1.5, 3.5, 2.5)
                .attachKeyFrame();
        scene.idle(90);

        ScenePresets.pointText(scene, 60, "Fuel rods cannot touch each other.", 1.5, 1.5, 2.5).attachKeyFrame();
        setAndShow(scene, util, 1, 1, 2, GEN + "fission_fuel_assembly");
        setAndShow(scene, util, 3, 1, 2, GEN + "fission_fuel_assembly");
        scene.idle(60);
        scene.world().setBlock(new BlockPos(1, 1, 2), RegistryLookup.state("minecraft:air"), true);
        scene.world().setBlock(new BlockPos(3, 1, 2), RegistryLookup.state("minecraft:air"), true);
        scene.idle(40);

        scene.world().hideSection(ScenePresets.box(util, 1, 1, 1, 3, 3, 3), Direction.UP);
        scene.idle(40);
        for (int x : new int[] { 1, 3 }) {
            for (int z : new int[] { 1, 3 }) {
                scene.world().setBlock(new BlockPos(x, 1, z),
                        RegistryLookup.state(GEN + "fission_fuel_assembly"), true);
                scene.world().setBlock(new BlockPos(x, 2, z),
                        RegistryLookup.state(GEN + "fission_fuel_assembly"), true);
                scene.world().setBlock(new BlockPos(x, 3, z),
                        RegistryLookup.state(GEN + "control_rod_assembly"), true);
            }
        }
        scene.world().showSection(ScenePresets.box(util, 1, 1, 1, 3, 3, 3), Direction.DOWN);

        ScenePresets.pointText(scene, 80, "Several fuel rods work best in a checkerboard pattern.", 1.5, 1.5, 2.5)
                .attachKeyFrame();
        scene.idle(100);

        scene.world().showSection(ScenePresets.box(util, 0, 1, 0, 3, 4, 0), Direction.DOWN);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 1, 0, 4, 3), Direction.DOWN);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.DOWN);
        scene.idle(20);
    }

    public static void fissionLogicAdapter(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_fission_logic", "Fission Reactor: logic adapters");

        scene.world().showSection(ScenePresets.box(util, 0, 0, 2, 4, 4, 6), Direction.DOWN);
        scene.world().setBlock(new BlockPos(2, 3, 2), RegistryLookup.state(GEN + "reactor_glass"), false);
        scene.idle(20);

        ScenePresets.pointText(scene, 60, "Logic adapters give the reactor redstone control.", 2.5, 1.5, 2)
                .attachKeyFrame();
        scene.idle(80);

        ScenePresets.pointText(scene, 60, "Right-click one to open its configuration.", 2.5, 1.5, 2).attachKeyFrame();
        scene.overlay().showControls(new Vec3(2.5, 2.5, 2), Pointing.DOWN, 60).rightClick();
        scene.idle(70);

        ScenePresets.pointText(scene, 80,
                        "With two of them you can build a fail-safe that shuts the reactor down.", 2.5, 3.5, 2)
                .attachKeyFrame();
        scene.world().setBlock(new BlockPos(2, 3, 2),
                RegistryLookup.state(GEN + "fission_reactor_logic_adapter"), true);
        scene.idle(90);
    }

    public static void fissionPorts(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_fission_ports", "Fission Reactor: ports");

        ScenePresets.showAll(scene, util);
        scene.idle(20);

        scene.world().setBlock(new BlockPos(0, 1, 1), RegistryLookup.state(GEN + "fission_reactor_port"), true);
        scene.world().setBlock(new BlockPos(0, 1, 3), RegistryLookup.state(GEN + "fission_reactor_port"), true);

        ScenePresets.pointText(scene, 60, "A reactor needs at least four ports.", 0, 1.5, 3.5);
        scene.addKeyframe();
        scene.idle(80);

        ScenePresets.pointText(scene, 60, "Ports are switched over with a Configurator.", 0, 1.5, 3.5);
        scene.overlay().showControls(new Vec3(0.5, 2, 3.5), Pointing.DOWN, 60)
                .rightClick()
                .withItem(RegistryLookup.stack("mekanism:configurator"))
                .whileSneaking();
        scene.idle(80);
        scene.addKeyframe();

        ScenePresets.pointText(scene, 40, "Coolant in", 3.5, 1.5, 0);
        scene.idle(40);
        ScenePresets.pointText(scene, 40, "Fuel in", 1.5, 1.5, 0);
        scene.idle(40);
        ScenePresets.pointText(scene, 40, "Waste out", 0, 1.5, 1.5);
        scene.idle(40);
        ScenePresets.pointText(scene, 40, "Heated coolant out", 0, 1.5, 3.5);
        scene.idle(40);
        scene.addKeyframe();
        scene.idle(10);
    }

    public static void fusionReactor(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_fusion_reactor", "Mekanism Fusion Reactor");

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 4, 4, 4), Direction.DOWN);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "The Fusion Reactor puts out millions of RF per tick.", 0, 2.5, 4.5)
                .attachKeyFrame();
        scene.idle(80);

        ScenePresets.pointText(scene, 60, "Ports are switched over with a Configurator.", 1.5, 2.5, 0)
                .attachKeyFrame();
        scene.overlay().showControls(new Vec3(1.5, 3.5, 0), Pointing.DOWN, 60)
                .rightClick()
                .withItem(RegistryLookup.stack("mekanism:configurator"))
                .whileSneaking();
        scene.idle(70);

        scene.world().hideSection(ScenePresets.box(util, 0, 0, 0, 4, 4, 3), Direction.UP);
        scene.idle(10);

        ScenePresets.pointText(scene, 80, "Every face follows the same pattern.", 2.5, 2, 4.5).attachKeyFrame();
        scene.idle(90);

        scene.world().showSection(ScenePresets.box(util, 4, 0, 0, 4, 4, 3), Direction.DOWN);
        scene.idle(10);
        ScenePresets.pointText(scene, 60, "One port exports power.", 4, 2.5, 2.5).attachKeyFrame();
        scene.idle(70);

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 0, 4, 3), Direction.DOWN);
        scene.idle(30);
        ScenePresets.pointText(scene, 60, "The laser matrix is what kickstarts the reaction.", 0, 2.5, 2.5)
                .attachKeyFrame();
        scene.idle(70);

        scene.world().showSection(ScenePresets.box(util, 1, 0, 0, 3, 0, 3), Direction.DOWN);
        scene.idle(30);
        scene.world().showSection(ScenePresets.box(util, 0, 4, 0, 3, 4, 3), Direction.DOWN);
        scene.idle(30);

        ScenePresets.pointText(scene, 60, "The controller goes in the middle of the top face.", 2.5, 4.5, 3.5)
                .attachKeyFrame();
        scene.idle(70);

        scene.world().showSection(ScenePresets.box(util, 1, 1, 0, 3, 3, 0), Direction.DOWN);
        scene.idle(30);

        ScenePresets.pointText(scene, 30, "Two more ports feed in Deuterium", 3.5, 2.5, 0).attachKeyFrame();
        scene.idle(40);
        ScenePresets.pointText(scene, 40, "and Tritium.", 1.5, 2.5, 0).attachKeyFrame();
        scene.idle(50);
    }

    public static void fusionActivation(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_fusion_activation", "Fusion Reactor: starting it up");

        scene.world().showSection(ScenePresets.box(util, 2, 0, 0, 6, 4, 6), Direction.DOWN);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "Lighting a Fusion Reactor takes a few things.", 2, 2.5, 4.5)
                .attachKeyFrame();
        scene.idle(80);

        scene.overlay().showText(100)
                .text("A Hohlraum filled with D-T fuel goes in the controller.")
                .attachKeyFrame();
        scene.overlay().showControls(new Vec3(4.5, 5.5, 3.5), Pointing.DOWN, 100)
                .withItem(RegistryLookup.stack(GEN + "hohlraum"));
        scene.idle(110);

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 1, 4, 6), Direction.DOWN);
        scene.idle(10);

        ScenePresets.pointText(scene, 100, "Then fire 400 MRF from lasers into the laser matrix.", 0, 2.5, 3.5)
                .attachKeyFrame();
        scene.idle(110);

        scene.world().hideSection(ScenePresets.box(util, 1, 0, 0, 6, 4, 6), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(90);
        scene.idle(5);

        ScenePresets.pointText(scene, 100, "The amplifier's red face has to point at the matrix.", 1, 2.5, 3)
                .attachKeyFrame();
        scene.idle(110);

        scene.rotateCameraY(-90);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 0, 0, 6, 4, 6), Direction.DOWN);
        scene.idle(10);
        scene.world().hideSection(ScenePresets.box(util, 0, 0, 0, 1, 4, 6), Direction.DOWN);
        scene.idle(10);

        scene.overlay().showText(100).text("After that it needs a steady fuel supply.").independent(-50);
        ScenePresets.pointText(scene, 50, "Deuterium here", 5.5, 2.5, 1).attachKeyFrame();
        scene.idle(60);
        ScenePresets.pointText(scene, 50, "Tritium here", 3.5, 2.5, 1).attachKeyFrame();
        scene.idle(60);

        ScenePresets.pointText(scene, 80,
                        "Pumped in separately, the reactor mixes the D-T fuel itself at a set rate.", 4.5, 2.5, 1)
                .attachKeyFrame();
        scene.idle(80);
    }

    public static void inductionMatrix(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_induction_matrix", "Mekanism Induction Matrix");

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 4, 4, 4), Direction.DOWN);
        scene.idle(10);

        ScenePresets.pointText(scene, 80, "The Induction Matrix stores an enormous amount of power.", 0, 4.5, 4.5)
                .attachKeyFrame();
        scene.idle(85);

        scene.world().hideSection(ScenePresets.box(util, 0, 0, 0, 4, 4, 4), Direction.UP);
        scene.idle(10);

        scene.world().showSection(util.select().position(4, 0, 4), Direction.DOWN);
        scene.idle(5);

        for (int n = 1; n <= 4; n++) {
            scene.world().showSection(util.select().position(4, n, 4), Direction.DOWN);
            scene.world().showSection(util.select().position(4, 0, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 0, 4), Direction.DOWN);
            scene.idle(5);
        }

        for (int n = 1; n <= 3; n++) {
            scene.world().showSection(util.select().position(4, 4, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 4, 4), Direction.DOWN);
            scene.world().showSection(util.select().position(0, 0, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 0, 0), Direction.DOWN);
            scene.world().showSection(util.select().position(0, n, 4), Direction.DOWN);
            scene.world().showSection(util.select().position(4, n, 0), Direction.DOWN);
            scene.idle(5);
        }

        ScenePresets.pointText(scene, 80, "The edges must be casings.", 0, 4.5, 4.5).attachKeyFrame();
        scene.idle(5);

        scene.world().showSection(util.select().position(4, 4, 0), Direction.DOWN);
        scene.world().showSection(util.select().position(0, 4, 4), Direction.DOWN);
        scene.world().showSection(util.select().position(0, 0, 0), Direction.DOWN);
        scene.idle(5);

        for (int n = 1; n <= 3; n++) {
            scene.world().showSection(util.select().position(0, n, 0), Direction.DOWN);
            scene.world().showSection(util.select().position(0, 4, 4 - n), Direction.DOWN);
            scene.world().showSection(util.select().position(4 - n, 4, 0), Direction.DOWN);
            scene.idle(5);
        }

        scene.world().showSection(util.select().position(0, 4, 0), Direction.DOWN);
        scene.idle(60);

        ScenePresets.pointText(scene, 80, "The faces can be casings or structural glass.", 0, 2.5, 2.5)
                .attachKeyFrame();

        scene.world().showSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.DOWN);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 0, 1, 3, 0, 3), Direction.UP);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 1, 0, 3, 3, 0), Direction.SOUTH);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 1, 1, 4, 3, 3, 4), Direction.NORTH);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 1, 0, 3, 3), Direction.EAST);
        scene.idle(5);
        scene.world().showSection(ScenePresets.box(util, 4, 1, 1, 4, 3, 3), Direction.WEST);
        scene.idle(80);

        ScenePresets.pointText(scene, 60, "Ports move power in and out.", 1.5, 1.5, 0).attachKeyFrame();
        scene.idle(80);

        ScenePresets.pointText(scene, 80, "They are switched over with a Configurator.", 1.5, 1.5, 0)
                .attachKeyFrame();
        scene.overlay().showControls(new Vec3(1.5, 2.5, 0), Pointing.DOWN, 80)
                .rightClick()
                .withItem(RegistryLookup.stack("mekanism:configurator"))
                .whileSneaking();
        scene.idle(80);

        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 3, 4, 0), Direction.UP);
        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 0, 4, 3), Direction.UP);
        scene.world().hideSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.UP);
        scene.idle(20);

        ScenePresets.pointText(scene, 60, "Induction cells raise how much power it holds.", 2.5, 1.5, 2.5)
                .attachKeyFrame();
        setAndShow(scene, util, 2, 1, 2, "mekanism:basic_induction_cell");
        scene.idle(65);

        ScenePresets.pointText(scene, 60, "Induction providers raise how fast it charges.", 2.5, 2.5, 2.5)
                .attachKeyFrame();
        setAndShow(scene, util, 2, 2, 2, "mekanism:basic_induction_provider");
        scene.idle(65);

        ScenePresets.pointText(scene, 60, "It needs at least one of each.", 2, 2.5, 2.5).attachKeyFrame();
        scene.idle(65);

        scene.world().showSection(ScenePresets.box(util, 0, 1, 0, 3, 4, 0), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 0, 0, 4, 3), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 3), Direction.UP);
        scene.idle(10);
    }

    public static void supercriticalPhaseShifter(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_sps", "Supercritical Phase Shifter");

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 6, 7, 6), Direction.DOWN);
        scene.setSceneOffsetY(-1);
        scene.idle(20);

        ScenePresets.pointText(scene, 60,
                "The SPS turns Polonium into Antimatter, and it drinks power doing it.", 0, 3.5, 6.5);
        scene.addKeyframe();
        scene.idle(80);

        ScenePresets.pointText(scene, 60, "Ports are switched over with a Configurator.", 2.5, 1.5, 0);
        scene.overlay().showControls(new Vec3(2.5, 2.5, 0), Pointing.DOWN, 60)
                .rightClick()
                .withItem(RegistryLookup.stack("mekanism:configurator"))
                .whileSneaking();
        scene.idle(70);

        scene.world().hideSection(ScenePresets.box(util, 0, 0, 0, 6, 6, 5), Direction.UP);
        scene.idle(10);

        ScenePresets.pointText(scene, 60, "Every face is built to this pattern.", 2.5, 4, 5).attachKeyFrame();
        scene.idle(60);

        scene.world().showSection(ScenePresets.box(util, 6, 0, 0, 6, 7, 5), Direction.DOWN);
        scene.idle(10);
        ScenePresets.pointText(scene, 60, "One side needs a port in the middle for power.", 5.5, 4, 3)
                .attachKeyFrame();
        scene.idle(70);

        scene.world().showSection(util.select().position(5, 3, 3), Direction.DOWN);
        ScenePresets.pointText(scene, 60, "Inside, a Supercharged Coil sits against that port.", 5, 4, 3)
                .attachKeyFrame();
        scene.idle(80);

        scene.world().showSection(ScenePresets.box(util, 0, 0, 0, 0, 6, 5), Direction.DOWN);
        scene.idle(30);
        scene.world().showSection(util.select().position(1, 3, 3), Direction.DOWN);
        ScenePresets.pointText(scene, 60, "Two coils lets it pull power at the maximum rate.", 0, 4, 3)
                .attachKeyFrame();
        scene.idle(80);

        scene.world().showSection(ScenePresets.box(util, 1, 0, 0, 5, 0, 5), Direction.DOWN);
        scene.idle(30);
        scene.world().showSection(ScenePresets.box(util, 1, 6, 0, 5, 6, 5), Direction.DOWN);
        scene.idle(30);
        scene.world().showSection(ScenePresets.box(util, 1, 1, 0, 5, 5, 0), Direction.DOWN);
        scene.idle(30);

        ScenePresets.pointText(scene, 60, "One port takes Polonium in.", 4.5, 1.5, 0).attachKeyFrame();
        scene.idle(70);
        ScenePresets.pointText(scene, 60, "Another sends the Antimatter out.", 2.5, 1.5, 0).attachKeyFrame();
        scene.idle(70);
    }

    private static void setAndShow(SceneBuilder scene, SceneBuildingUtil util, int x, int y, int z, String block) {
        scene.world().setBlock(new BlockPos(x, y, z), RegistryLookup.state(block), false);
        scene.world().showSection(util.select().position(x, y, z), Direction.DOWN);
    }

    public static void industrialTurbine(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pack_turbine", "Mekanism Industrial Turbine");

        ScenePresets.showAll(scene, util);
        scene.idle(5);

        ScenePresets.pointText(scene, 60, "The Industrial Turbine burns heated coolant to make power.", 0, 4.5, 4.5)
                .attachKeyFrame();
        scene.idle(65);

        ScenePresets.pointText(scene, 60, "The edges have to be turbine casings.", 0, 4.5, 4.5).attachKeyFrame();
        scene.idle(65);

        ScenePresets.pointText(scene, 60,
                        "The faces can be casings, structural glass, valves or vents.", 0, 2.5, 2.5)
                .attachKeyFrame();
        scene.idle(65);

        ScenePresets.pointText(scene, 60, "Valves pump steam in, or send power out.", 0, 1.5, 2.5)
                .attachKeyFrame();
        scene.idle(65);

        scene.world().hideSection(ScenePresets.box(util, 0, 4, 0, 4, 6, 4), Direction.UP);
        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 3, 6, 0), Direction.UP);
        scene.world().hideSection(ScenePresets.box(util, 0, 1, 0, 0, 6, 3), Direction.UP);
        scene.idle(10);

        ScenePresets.pointText(scene, 80,
                        "Rotors stack up the middle column. Each one holds two blades, up to 28 in total.",
                        2, 3.5, 2.5)
                .attachKeyFrame();
        scene.idle(85);

        scene.world().showSection(util.select().position(2, 4, 2), Direction.UP);
        scene.idle(10);

        ScenePresets.pointText(scene, 80,
                        "A Rotational Complex goes on top of the rotor, dead centre.", 2, 4.5, 2.5)
                .attachKeyFrame();
        scene.idle(85);

        scene.world().showSection(ScenePresets.box(util, 1, 4, 1, 3, 4, 1), Direction.UP);
        scene.world().showSection(util.select().position(3, 4, 2), Direction.UP);
        scene.world().showSection(util.select().position(1, 4, 2), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 1, 4, 3, 3, 4, 3), Direction.UP);
        scene.idle(10);

        ScenePresets.pointText(scene, 80,
                        "Pressure Dispersers must fill that whole layer around the complex, with no gaps.",
                        1, 4.5, 2.5)
                .attachKeyFrame();
        scene.idle(85);

        scene.world().showSection(ScenePresets.box(util, 0, 4, 0, 4, 4, 0), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 4, 4, 4, 4, 4), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 4, 1, 0, 4, 3), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 4, 4, 0, 4, 4, 4), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 0, 3, 3, 0), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 1, 1, 0, 3, 3), Direction.UP);

        ScenePresets.pointText(scene, 120,
                        "From this layer up, vents can take over the outer faces. They also push the water back out.",
                        0, 4.5, 3.5)
                .attachKeyFrame();
        scene.idle(125);

        scene.world().showSection(util.select().position(2, 5, 2), Direction.UP);
        scene.idle(5);

        ScenePresets.pointText(scene, 60, "Electromagnetic Coils sit on top of the complex.", 2, 5.5, 2.5)
                .attachKeyFrame();
        scene.idle(65);

        setAndShow(scene, util, 2, 5, 1, GEN + "electromagnetic_coil");
        setAndShow(scene, util, 1, 5, 2, GEN + "electromagnetic_coil");
        setAndShow(scene, util, 2, 5, 3, GEN + "electromagnetic_coil");
        setAndShow(scene, util, 3, 5, 2, GEN + "electromagnetic_coil");
        scene.idle(10);

        ScenePresets.pointText(scene, 100,
                        "Every coil has to touch the complex or another coil. Isolated ones do not count.",
                        2, 5.5, 2.5)
                .attachKeyFrame();
        scene.idle(105);

        scene.world().showSection(util.select().position(3, 5, 3), Direction.UP);
        scene.world().showSection(util.select().position(1, 5, 1), Direction.UP);
        scene.world().showSection(util.select().position(1, 5, 3), Direction.UP);
        scene.world().showSection(util.select().position(3, 5, 1), Direction.UP);

        ScenePresets.pointText(scene, 120,
                        "Saturating Condensers turn the steam back into water. Optional, but they go on the coil layer or above.",
                        1, 5.5, 1.5)
                .attachKeyFrame();
        scene.idle(130);

        scene.world().showSection(ScenePresets.box(util, 0, 5, 0, 4, 5, 0), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 5, 4, 4, 5, 4), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 0, 5, 1, 0, 5, 3), Direction.UP);
        scene.world().showSection(ScenePresets.box(util, 4, 5, 0, 4, 5, 3), Direction.UP);
        scene.idle(5);

        scene.world().showSection(ScenePresets.box(util, 0, 6, 0, 4, 6, 4), Direction.UP);
        scene.idle(20);

        scene.world().hideSection(ScenePresets.box(util, 1, 6, 1, 3, 6, 3), Direction.UP);
        scene.idle(15);
        for (int x = 1; x <= 3; x++) {
            for (int z = 1; z <= 3; z++) {
                scene.world().setBlock(new BlockPos(x, 6, z), RegistryLookup.state(GEN + "turbine_vent"), false);
            }
        }
        scene.idle(10);
        scene.world().showSection(ScenePresets.box(util, 1, 6, 1, 3, 6, 3), Direction.DOWN);
        scene.idle(10);

        ScenePresets.pointText(scene, 80, "The top face can be vents too, if you need the throughput.",
                        2.5, 6.5, 2.5)
                .attachKeyFrame();
        scene.idle(85);
    }
}
