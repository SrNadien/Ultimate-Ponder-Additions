package nadiendev.ultimateponderadditions.content.functionalstorage;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;

public final class FSScenes {
    private FSScenes() {
    }

    public static void drawers(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "fs_drawers", "Drawers");

        Selection row = util.select().fromTo(1, 1, 2, 3, 1, 2);

        ScenePresets.highlight(scene, 4, row, PonderPalette.WHITE,
                "A drawer holds one kind of item per slot, and a lot more of it than a chest would.");

        ScenePresets.input(scene, util, 4,
                "One slot: the whole block is a single, very deep stack.", 1, 1, 2);

        ScenePresets.say(scene, 4, "Two and four slot drawers trade capacity for variety.");

        ScenePresets.say(scene, 5,
                "Right-click a slot to insert one stack, or hold the click to empty your inventory into it.");

        ScenePresets.say(scene, 4, "Left-click a slot to pull one stack back out; sneak-click for one item.");

        ScenePresets.say(scene, 5,
                "Upgrades go in the drawer's UI: Copper through Netherite raise capacity, Void discards the overflow.");

        ScenePresets.outro(scene, 5,
                "The Configuration Tool locks a drawer to its current item, so it stays reserved when emptied.");
    }

    public static void controller(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "fs_controller", "The Storage Controller");

        ScenePresets.say(scene, 4,
                "A wall of drawers is only useful if you can search it. That is what the controller is for.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.GREEN,
                "The Storage Controller claims every connected drawer and shows them as one inventory.");

        ScenePresets.highlight(scene, 5,
                util.select().fromTo(1, 1, 1, 3, 1, 3), PonderPalette.INPUT,
                "Drawers connect through touching faces - the wall has to be one solid piece.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 2, 2), PonderPalette.OUTPUT,
                "Controller Extensions carry the connection further without adding storage of their own.");

        ScenePresets.say(scene, 5,
                "Pipes, hoppers and AE2 storage buses can all talk to the controller instead of each drawer.");

        ScenePresets.outro(scene, 5,
                "Out of reach? The Linking Tool binds a distant drawer to the controller by hand.");
    }

    public static void compacting(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "fs_compacting_drawer", "Compacting Drawers");

        ScenePresets.say(scene, 5,
                "A Compacting Drawer stores one material across all of its crafting tiers at once.");

        ScenePresets.input(scene, util, 5,
                "Insert iron nuggets, ingots or blocks - the drawer converts between them automatically.",
                2, 1, 2);

        ScenePresets.say(scene, 5,
                "Pull from whichever slot you need. Nine nuggets always come back out as one ingot.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.BLUE,
                "The Simple Compacting Drawer does the same for a single two-step material.");

        ScenePresets.outro(scene, 4,
                "This is the cheapest way to stop nuggets, ingots and blocks eating three separate slots.");
    }

    public static void enderDrawer(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "fs_ender_drawer", "Ender Drawers");

        ScenePresets.say(scene, 5,
                "Two Ender Drawers set to the same frequency are the same drawer, however far apart they sit.");

        ScenePresets.highlight(scene, 4, util.select().position(1, 1, 2), PonderPalette.INPUT,
                "Put something in here...");

        ScenePresets.highlight(scene, 4, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "...and take it out over there.");

        ScenePresets.say(scene, 5,
                "The frequency is a colour code, set in the drawer's UI. Different code, different storage.");

        ScenePresets.outro(scene, 5,
                "Handy for mining trips: one drawer at the dig site, one back at the base.");
    }

    public static void armoryCabinet(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "fs_armory_cabinet", "The Armory Cabinet");

        ScenePresets.say(scene, 5,
                "Drawers refuse anything with NBT, which rules out tools, armour and enchanted books.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.GREEN,
                "The Armory Cabinet is the answer: hundreds of slots, all happy to hold gear.");

        ScenePresets.highlight(scene, 4, util.select().position(4, 1, 2), PonderPalette.WHITE,
                "One cabinet replaces a very long row of chests.");

        ScenePresets.outro(scene, 5,
                "It is a plain inventory, so hoppers and pipes can fill and empty it as usual.");
    }
}
