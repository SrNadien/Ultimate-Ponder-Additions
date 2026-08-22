package nadiendev.ultimateponderadditions.content.modernfoundry;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;

public final class MFScenes {

    private MFScenes() {
    }

    public static void melter(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "mf_melter", "Your first smeltery");

        ScenePresets.say(scene, 5,
                "The Seared Melter is the small one you build before the real Smeltery.");

        ScenePresets.input(scene, util, 5,
                "It melts one thing at a time, and it has to sit on top of its fuel.", 2, 2, 2);

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.RED,
                "A Seared Heater burns solid fuel underneath it. A fuel tank of lava works too.");

        ScenePresets.output(scene, util, 5,
                "A Faucet on the side pours the melt out.", 2, 2, 1);

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 1), PonderPalette.OUTPUT,
                "Into a Casting Basin for blocks, or a Casting Table for ingots and parts.");

        ScenePresets.outro(scene, 5,
                "Melter, heater, faucet, basin and table: that is the whole starting setup.");
    }

    public static void smeltery(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "mf_smeltery", "Building a Smeltery");

        ScenePresets.say(scene, 5,
                "The Smeltery melts several stacks at once and alloys metals together.");

        ScenePresets.highlight(scene, 5, util.select().layer(1), PonderPalette.GREEN,
                "It starts with a solid floor of seared blocks.");

        Selection walls = util.select().fromTo(0, 2, 0, 4, 3, 4)
                .substract(util.select().fromTo(1, 2, 1, 3, 3, 3));

        ScenePresets.highlight(scene, 5, walls, PonderPalette.WHITE,
                "Walls go around the outside. The inside stays hollow, and it must stay empty.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 2, 0), PonderPalette.INPUT,
                "The Smeltery Controller goes in a wall, at the height of the first inner layer.");

        ScenePresets.highlight(scene, 5, util.select().position(0, 2, 2), PonderPalette.RED,
                "A Seared Fuel Tank in the wall holds the lava that powers it.");

        ScenePresets.highlight(scene, 5, util.select().position(4, 2, 2), PonderPalette.OUTPUT,
                "A Seared Drain is how molten metal gets in and out.");

        ScenePresets.say(scene, 5,
                "Build the walls higher and the Smeltery holds more. The inside can grow too, up to a limit.");

        ScenePresets.outro(scene, 5,
                "If it refuses to form, the controller tells you which block is wrong and where.");
    }

    public static void casting(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "mf_casting", "Casting metal");

        ScenePresets.say(scene, 5,
                "Molten metal is useless until you pour it into something.");

        ScenePresets.input(scene, util, 5,
                "A Faucet pulls from a tank, a drain or the Smeltery itself.", 2, 2, 1);

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 1), PonderPalette.OUTPUT,
                "A Casting Basin makes blocks. Right-click the faucet to pour.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 3), PonderPalette.OUTPUT,
                "A Casting Table makes ingots and tool parts, using a cast as the mould.");

        ScenePresets.highlight(scene, 5, util.select().position(4, 1, 2), PonderPalette.MEDIUM,
                "Channels carry the pour further, so one faucet can feed a row of tables.");

        ScenePresets.outro(scene, 5,
                "Redstone into a faucet keeps it pouring, which is what turns casting into a production line.");
    }

    public static void ports(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "mf_ports", "Getting things in and out");

        ScenePresets.say(scene, 5,
                "Three blocks move things through a Smeltery wall, and each does one job.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 2, 2), PonderPalette.INPUT,
                "The Seared Drain moves fluid in and out.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 2, 2), PonderPalette.BLUE,
                "The Seared Duct does the same, but only for the fluid its filter is set to.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 2, 2), PonderPalette.OUTPUT,
                "The Seared Chute moves items instead: ore in, or leftovers out.");

        ScenePresets.say(scene, 5,
                "All three count as wall blocks, so they replace a brick rather than sitting next to one.");

        ScenePresets.outro(scene, 5,
                "Hoppers and pipes talk to them normally, which is how a Smeltery gets automated.");
    }
}
