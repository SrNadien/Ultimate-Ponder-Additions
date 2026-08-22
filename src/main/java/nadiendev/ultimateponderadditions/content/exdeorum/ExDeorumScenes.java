package nadiendev.ultimateponderadditions.content.exdeorum;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;

public final class ExDeorumScenes {

    private ExDeorumScenes() {
    }

    public static void barrel(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "exd_barrel", "The Barrel");

        ScenePresets.say(scene, 5,
                "On a skyblock the Barrel is where dirt comes from, and where most fluids come from.");

        ScenePresets.input(scene, util, 5,
                "Throw organic matter in and it composts. When the bar fills, you get a block of dirt.",
                1, 1, 2);

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.BLUE,
                "Filled with a fluid instead, it mixes: drop the right item in and the fluid changes.");

        ScenePresets.say(scene, 5,
                "Water plus lava gives stone. Water and a mushroom gives Witch Water, which spawns worse things.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.WHITE,
                "Stone Barrels do the same job but will not burn when you put lava in them.");

        ScenePresets.outro(scene, 5,
                "Barrels left under the sky slowly fill with rain, which is the free water you start with.");
    }

    public static void crucible(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "exd_crucible", "The Crucible");

        ScenePresets.say(scene, 5,
                "A Crucible melts solids into fluid, and which crucible you use decides what it can melt.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 2, 2), PonderPalette.GREEN,
                "Wooden crucibles melt leaves, saplings and wood into water.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 2, 2), PonderPalette.RED,
                "The Porcelain Crucible handles stone, and turns it into lava.");

        ScenePresets.needsPower(scene, util, 3, 1, 2,
                "It needs a heat source underneath. Torches are slow, lava and magma are much faster.");

        ScenePresets.say(scene, 5,
                "The heat source sets the melt rate, so upgrading what is under it is a real speed increase.");

        ScenePresets.outro(scene, 5,
                "Porcelain is fired clay: craft the unfired crucible, then smelt it.");
    }

    public static void sieve(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "exd_sieve", "The Sieve");

        ScenePresets.say(scene, 5,
                "Everything you mine on a skyblock comes out of a Sieve, one handful at a time.");

        ScenePresets.input(scene, util, 5,
                "Fit a mesh first, then put in dirt, gravel, sand or dust and click to sift.", 1, 1, 2);

        ScenePresets.say(scene, 5,
                "The mesh decides what can drop. String finds seeds; flint, iron, diamond and netherite go deeper.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "A Compressed Sieve takes a compressed block and does the whole stack in one go.");

        ScenePresets.say(scene, 5,
                "Sieves side by side all sift at once when you click across them, so build a row.");

        ScenePresets.outro(scene, 5,
                "Ore chunks out of the sieve go to a furnace, or to a Smeltery if you have one.");
    }

    public static void hammer(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "exd_hammer", "Hammers and Crooks");

        ScenePresets.say(scene, 5,
                "The Hammer breaks stone down a step at a time, and each step feeds the sieve.");

        ScenePresets.highlight(scene, 5, util.select().fromTo(1, 1, 2, 3, 1, 2), PonderPalette.MEDIUM,
                "Cobblestone to gravel, gravel to sand, sand to dust.");

        ScenePresets.say(scene, 5,
                "Better hammers are faster, and the compressed ones work on a whole compressed block at once.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 0), PonderPalette.GREEN,
                "The Crook is the other early tool: it doubles what leaves drop.");

        ScenePresets.say(scene, 5,
                "Put a Silkworm on leaves and they become Infested Leaves, which break into string.");

        ScenePresets.outro(scene, 5,
                "String makes your first mesh, so silkworms are what unlock the sieve.");
    }

    public static void mechanical(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "exd_mechanical", "Automating it");

        ScenePresets.say(scene, 5,
                "Clicking sieves by hand gets old. Both jobs have a powered version.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.INPUT,
                "The Mechanical Hammer crushes on its own, taking Forge Energy.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "The Mechanical Sieve does the sifting, mesh included.");

        ScenePresets.say(scene, 5,
                "Both have an input and an output side, so hoppers and pipes chain them together.");

        ScenePresets.outro(scene, 5,
                "Cobblegen into hammer into sieve into furnace is the whole skyblock loop, hands-free.");
    }
}
