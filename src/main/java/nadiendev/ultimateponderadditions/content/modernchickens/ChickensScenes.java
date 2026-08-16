package nadiendev.ultimateponderadditions.content.modernchickens;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;

public final class ChickensScenes {
    private ChickensScenes() {
    }

    public static void roost(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_roost", "The Roost");

        ScenePresets.say(scene, 5,
                "A Roost turns a chicken into a quiet, tidy resource generator - no wandering, no clucking.");

        ScenePresets.input(scene, util, 5,
                "Put up to sixteen chickens of one type inside. Faster chickens lay faster.", 2, 1, 2);

        ScenePresets.say(scene, 5,
                "Each chicken drops its own resource instead of an egg: iron, redstone, glowstone, and so on.");

        ScenePresets.output(scene, util, 5,
                "A Collector next to the roost empties it automatically.", 2, 1, 4);

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.BLUE,
                "The Mechanical Roost is the powered version: faster, and it accepts upgrades.");

        ScenePresets.outro(scene, 5,
                "A chicken's Gain, Growth and Strength stats decide how much it produces and how fast.");
    }

    public static void breeder(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_breeder", "Breeding chickens");

        ScenePresets.say(scene, 5,
                "New chicken types come from breeding, and breeding happens in a Breeder.");

        ScenePresets.input(scene, util, 5,
                "Two chickens plus seeds. The offspring can be either parent's type, or their child type.",
                2, 1, 2);

        ScenePresets.say(scene, 5,
                "Every breed has a recipe: an Iron Chicken and a Flint Chicken make a Gold Chicken, say.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.GREEN,
                "Nests spawn naturally in the world and hold the first chicken of a wild type.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "The Mechanical Nest is the crafted, powered version you build once you are set up.");

        ScenePresets.say(scene, 5,
                "Use an Analyzer on a chicken to read its stats before deciding what to breed.");

        ScenePresets.outro(scene, 5,
                "Breeding two high-stat parents is how you push Gain and Growth towards the cap of ten.");
    }

    public static void henhouse(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_henhouse", "The Henhouse");

        ScenePresets.say(scene, 5,
                "Chickens roaming loose still lay. The Henhouse is what picks up after them.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.GREEN,
                "It gathers anything a chicken drops in the chunk around it.");

        ScenePresets.say(scene, 5,
                "It also eats hay bales: one bale converted to dirt lets it collect a good deal more.");

        ScenePresets.say(scene, 5,
                "There is a Henhouse for every wood type, so it can match whatever you built the pen out of.");

        ScenePresets.outro(scene, 5,
                "Cheap and early-game. Once you have power, a Roost with a Collector outpaces it easily.");
    }

    public static void incubator(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_incubator", "The Incubator");

        ScenePresets.say(scene, 5,
                "The Incubator hatches Coloured Eggs into the chicken type painted on them.");

        ScenePresets.input(scene, util, 5,
                "Drop the eggs in and wait. No power needed - only heat.", 2, 1, 2);

        ScenePresets.highlight(scene, 5,
                util.select().fromTo(1, 1, 2, 3, 1, 2), PonderPalette.RED,
                "Heat comes from lava or fire underneath and beside it. More heat, faster hatching.");

        ScenePresets.say(scene, 5,
                "Chickens hatched this way keep the stats stored on the egg, so good eggs are worth saving.");

        ScenePresets.outro(scene, 5,
                "This is the fast way to turn a breeding line into a working farm.");
    }

    public static void generator(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_roost_generator", "Power from chickens");

        ScenePresets.say(scene, 5,
                "Chickens do not only lay solid resources. The Avian machines turn them into energy and fluids.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.GREEN,
                "It starts with a Mechanical Roost keeping a flock producing around the clock.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.OUTPUT,
                "The Avian Flux Converter turns that output into Forge Energy.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.BLUE,
                "The Avian Fluid Converter does the same for fluids - lava from Lava Chickens, for instance.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 4), PonderPalette.FAST,
                "The Avian Chemical Converter handles the chemical side for the mods that want it.");

        ScenePresets.say(scene, 5,
                "RF upgrades in the machine's slots raise output, efficiency and buffer size.");

        ScenePresets.outro(scene, 5,
                "A wall of roosts feeding converters is a perfectly serious mid-game power plant.");
    }
}
