package nadiendev.ultimateponderadditions.content.botanypots;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;

public final class BPScenes {

    private BPScenes() {
    }

    public static void botanyPot(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "bp_pot", "The Botany Pot");

        ScenePresets.say(scene, 5,
                "A Botany Pot grows one crop in one block, with no farmland and no light rules to worry about.");

        ScenePresets.input(scene, util, 5,
                "Put a soil in it first, then the crop. Both are just items you drop in.", 1, 2, 2);

        ScenePresets.say(scene, 5,
                "The soil decides what can grow and how fast. The same crop in better soil finishes sooner.");

        ScenePresets.output(scene, util, 5,
                "When it is ready, break the crop out of the pot by hand.", 1, 2, 2);

        ScenePresets.say(scene, 5,
                "Which soils and crops exist is data-driven, so a pack can add or change any of them.");

        ScenePresets.outro(scene, 5,
                "Pots come in terracotta, concrete and every brick going. They all behave the same.");
    }

    public static void hopperPot(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "bp_hopper_pot", "The Hopper Botany Pot");

        ScenePresets.say(scene, 5,
                "A plain pot grows but will not pick anything up. The Hopper version does.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 2, 2), PonderPalette.GREEN,
                "It harvests itself and pushes the drops into whatever sits below.");

        ScenePresets.output(scene, util, 5,
                "A chest, a hopper, a pipe: anything that takes items works.", 2, 1, 2);

        ScenePresets.say(scene, 5,
                "That is the only difference. Same soils, same crops, same growth speed.");

        ScenePresets.outro(scene, 5,
                "A wall of hopper pots over a row of chests is a farm with no moving parts.");
    }

    public static void waxedPot(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "bp_waxed_pot", "The Waxed Botany Pot");

        ScenePresets.highlight(scene, 5, util.select().position(3, 2, 2), PonderPalette.BLUE,
                "The Waxed pot is purely decorative.");

        ScenePresets.say(scene, 5,
                "It always renders its crop fully grown, and it never ticks.");

        ScenePresets.say(scene, 5,
                "Nothing grows and nothing drops, so a hundred of them cost the server nothing.");

        ScenePresets.outro(scene, 5,
                "For the greenhouse you want to look at, not the one you want to harvest.");
    }
}
