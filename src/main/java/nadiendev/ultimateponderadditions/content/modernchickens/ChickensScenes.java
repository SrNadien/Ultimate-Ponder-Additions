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
                "A Roost holds chicken items and produces their drops into its own output slots. No loose birds.");

        ScenePresets.input(scene, util, 5,
                "Chickens in, resources out: iron, redstone, glowstone, whatever that type produces.", 2, 1, 2);

        ScenePresets.say(scene, 5,
                "Speed and Stack upgrades inside the roost raise how fast and how much it makes.");

        ScenePresets.output(scene, util, 5,
                "A Roost Collector pulls the finished output from every Roost in range into its own inventory.",
                2, 1, 4);

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.BLUE,
                "The Mechanical Roost runs on RF and has four independent chicken rows, each with its own output.");

        ScenePresets.outro(scene, 5,
                "A Nest placed nearby projects an aura that speeds up every Roost it reaches.");
    }

    public static void breeder(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_breeder", "Breeding chickens");

        ScenePresets.input(scene, util, 5,
                "The Chicken Breeder takes two chicken items and seeds, and produces offspring.", 2, 1, 2);

        ScenePresets.say(scene, 5,
                "Both parents have to be ordinary chickens. Roosters do not go in here.");

        ScenePresets.say(scene, 5,
                "Which chicken you get follows the breeding tree: an Iron and a Flint chicken give Gold.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.GREEN,
                "The Nest is a different machine. It holds a rooster and seeds, and makes no items at all.");

        ScenePresets.say(scene, 5,
                "What it makes is an aura: while it burns seeds, every Roost in range works faster.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "The Mechanical Nest does the same with a Robot Rooster and RF instead of seeds.");

        ScenePresets.outro(scene, 5,
                "Use an Analyzer on a chicken to read its stats before you decide what to pair.");
    }

    public static void henhouse(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_henhouse", "The Henhouse");

        ScenePresets.say(scene, 5,
                "Chickens dropping resources on the floor need something to pick them up. That is the Henhouse.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.GREEN,
                "It collects nearby chicken drops into a 3x3 inventory inside it.");

        ScenePresets.say(scene, 5,
                "It runs on FE, or on hay bales as fuel. Burning hay leaves dirt behind as a byproduct.");

        ScenePresets.say(scene, 5,
                "There is a Henhouse for every wood type, so it matches whatever you built the coop out of.");

        ScenePresets.outro(scene, 5,
                "Cheap and early. A Roost with a Collector is tidier once you can afford it.");
    }

    public static void incubator(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_incubator", "The Incubator");

        ScenePresets.input(scene, util, 5,
                "The Incubator turns Modern Chickens spawn eggs into the portable chicken items the machines take.",
                2, 1, 2);

        ScenePresets.say(scene, 5,
                "Drop the eggs in and give it power. One conversion takes 200 ticks.");

        ScenePresets.needsPower(scene, util, 2, 1, 2,
                "It runs on RF, not on heat. No lava or fire involved.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "Chicken items are what Roosts, Breeders and Nests accept, so everything starts here.");

        ScenePresets.outro(scene, 5,
                "An egg out of an Avian Dousing Machine goes straight in here to become the chicken.");
    }

    public static void generator(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "chickens_roost_generator", "Power from chickens");

        ScenePresets.say(scene, 5,
                "Chickens lay more than solid resources. The Avian machines turn the rest into something usable.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.OUTPUT,
                "The Avian Flux Converter drains Flux Eggs into an FE buffer and pushes it to adjacent machines.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.BLUE,
                "The Avian Fluid Converter cracks Liquid Eggs into a tank and feeds adjacent tanks or pipes.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 4), PonderPalette.FAST,
                "The Avian Chemical Converter does the same with Chemical and Gas Eggs, into a Mekanism buffer.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 0), PonderPalette.RED,
                "The Avian Dousing Machine burns RF plus a reagent to make specialised spawn eggs.");

        ScenePresets.say(scene, 5,
                "The Roost Generator is the direct route: Redstone Flux Chickens in, FE/t out.");

        ScenePresets.outro(scene, 5,
                "A wall of roosts feeding converters is a serious mid-game power plant.");
    }
}
