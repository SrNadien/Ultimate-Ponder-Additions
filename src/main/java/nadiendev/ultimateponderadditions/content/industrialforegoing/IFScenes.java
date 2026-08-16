package nadiendev.ultimateponderadditions.content.industrialforegoing;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import nadiendev.ultimateponderadditions.api.util.RegistryLookup;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;
import net.minecraft.world.level.block.Blocks;

public final class IFScenes {
    private IFScenes() {
    }

    public static void plantFarm(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "if_plant_farm", "Automating a farm");

        Selection field = util.select().fromTo(1, 1, 1, 3, 1, 3);

        ScenePresets.say(scene, 4, "The Plant Sower and the Plant Gatherer work a 3x3 area in front of them.");

        ScenePresets.input(scene, util, 4,
                "The Plant Sower plants whatever seeds you put in its inventory.", 2, 1, 0);

        scene.world().setBlocks(field, Blocks.AIR.defaultBlockState(), false);
        scene.idle(10);
        scene.world().setBlocks(field, RegistryLookup.state("minecraft:wheat[age=7]"), true);
        scene.idle(15);

        ScenePresets.highlight(scene, 4, field, PonderPalette.GREEN,
                "It only sows on tilled soil, so till the plot before switching it on.");

        ScenePresets.output(scene, util, 5,
                "The Plant Gatherer harvests the same area, and hands the crops out of its back.", 2, 1, 4);

        ScenePresets.highlight(scene, 4, util.select().position(3, 1, 4), PonderPalette.BLUE,
                "A Plant Fertilizer next to the plot speeds the crops along.");

        ScenePresets.needsPower(scene, util, 2, 1, 4,
                "Every machine here runs on Forge Energy - no power, no harvest.");

        ScenePresets.outro(scene, 5,
                "Add a Range Addon to each machine to grow the worked area past 3x3.");
    }

    public static void mobFarm(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "if_mob_farm", "Farming mobs");

        ScenePresets.say(scene, 4,
                "The Mob Duplicator spawns copies of a mob captured with a Mob Imprisonment Tool.");

        ScenePresets.input(scene, util, 5,
                "Fill it with Essence and drop the imprisonment tool in its inventory.", 1, 1, 2);

        ScenePresets.output(scene, util, 5,
                "The Mob Crusher kills anything in range and turns it into Essence and drops.", 3, 1, 2);

        ScenePresets.highlight(scene, 4, util.select().position(3, 1, 0), PonderPalette.OUTPUT,
                "Point the drops at any inventory so nothing despawns.");

        ScenePresets.say(scene, 5,
                "Crushing mobs produces more Essence than duplicating them costs, so the loop pays for itself.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 0), PonderPalette.BLUE,
                "The Mob Slaughter Factory is the other option: no drops or experience, but Liquid Meat and Pink Slime.");

        ScenePresets.outro(scene, 5,
                "Both killers take Range Addons; a Fortune Addon on the Crusher improves the drops.");
    }

    public static void laserDrill(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "if_laser_drill", "Mining without a mine");

        ScenePresets.say(scene, 4,
                "The Ore Laser Base produces ores out of thin air, powered by Laser Drills around it.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.GREEN,
                "The base sits in the middle. Which ores it can make depends on the dimension it is in.");

        Selection drills = util.select().position(0, 1, 2)
                .add(util.select().position(4, 1, 2))
                .add(util.select().position(2, 1, 0))
                .add(util.select().position(2, 1, 4));

        ScenePresets.highlight(scene, 5, drills, PonderPalette.INPUT,
                "Every Laser Drill aimed at the base speeds it up. Up to twelve can feed one base.");

        ScenePresets.say(scene, 5,
                "Put a Laser Lens in a drill to bias the output towards ores of that colour.");

        ScenePresets.say(scene, 4,
                "The finished ore comes out of the base - pipe it into any inventory you like.");

        ScenePresets.needsPower(scene, util, 2, 1, 2,
                "The drills are the hungry part; the base itself needs almost nothing.");

        ScenePresets.outro(scene, 5,
                "A Fluid Laser Base does the same trick for fluids instead of ores.");
    }

    public static void power(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "if_power", "Powering the factory");

        ScenePresets.say(scene, 4,
                "Every machine here burns Forge Energy, so the first thing to build is a source of it.");

        ScenePresets.highlight(scene, 5, util.select().position(0, 1, 2), PonderPalette.RED,
                "The Pitiful Generator burns solid fuel. It is exactly as good as the name suggests, but it starts you off.");

        ScenePresets.input(scene, util, 5,
                "The Bioreactor takes plant matter - seeds, saplings, crops - and turns it into Biofuel.",
                2, 1, 2);

        ScenePresets.say(scene, 5,
                "It wants variety: the more distinct plant types in its inventory, the more Biofuel per batch.");

        ScenePresets.output(scene, util, 5,
                "The Biofuel Generator burns that Biofuel, and it is in a different league.", 2, 1, 4);

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 0), PonderPalette.BLUE,
                "The Latex Processing Unit taps trees for Latex, which becomes Tiny Dry Rubber and then Plastic.");

        ScenePresets.highlight(scene, 5, util.select().position(4, 1, 2), PonderPalette.OUTPUT,
                "The Sludge Refiner turns the Sludge machines produce back into ores and blocks.");

        ScenePresets.outro(scene, 5,
                "Feed the Bioreactor from a Plant Gatherer and the whole factory runs on its own farm.");
    }

    public static void conveyor(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "if_conveyor", "Moving items around");

        Selection belt = util.select().fromTo(2, 1, 0, 2, 1, 3);

        ScenePresets.highlight(scene, 4, belt, PonderPalette.MEDIUM,
                "Conveyors carry dropped items along whichever way they face.");

        ScenePresets.say(scene, 4,
                "Right-click a conveyor with a wrench to turn it; click the edge to add a ramp.");

        ScenePresets.output(scene, util, 4,
                "Run a belt into any inventory and the items insert themselves.", 2, 1, 4);

        ScenePresets.highlight(scene, 4, util.select().position(1, 1, 2), PonderPalette.INPUT,
                "The Block Placer sets blocks from its inventory in front of itself.");

        ScenePresets.highlight(scene, 4, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "The Block Breaker does the opposite, and drops what it mines.");

        ScenePresets.outro(scene, 5,
                "Conveyor upgrades add extraction, insertion, splitting and detection to a belt.");
    }
}
