package nadiendev.ultimateponderadditions.content.ae2;

import nadiendev.ultimateponderadditions.api.scene.ScenePresets;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;

public final class AE2Scenes {
    private AE2Scenes() {
    }

    public static void inscriber(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "ae2_inscriber", "The Inscriber");

        ScenePresets.say(scene, 5,
                "Every AE2 machine is built from processors, and processors come out of Inscribers.");

        ScenePresets.input(scene, util, 5,
                "A press goes in the top slot, the material in the middle, and out comes a printed circuit.",
                2, 1, 2);

        ScenePresets.say(scene, 5,
                "Presses are not consumed. Find them in meteorites, or grind Sky Stone until one turns up.");

        Selection line = util.select().fromTo(1, 1, 2, 3, 1, 2);
        ScenePresets.highlight(scene, 5, line, PonderPalette.GREEN,
                "Chain three inscribers together and the last one assembles the printed parts into a processor.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 0), PonderPalette.INPUT,
                "The ME Energy Acceptor converts Forge Energy into AE, which is what the inscriber drinks.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 4), PonderPalette.OUTPUT,
                "An Energy Cell buffers that power so a burst of crafting does not stall the network.");

        ScenePresets.outro(scene, 5,
                "Once your network has patterns for the presses, a Pattern Provider can drive this whole row.");
    }

    public static void growth(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "ae2_growth_accelerator", "Growing Certus Quartz");

        ScenePresets.say(scene, 5,
                "Budding Certus Quartz grows crystal buds on its faces, exactly like amethyst does.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 1, 2), PonderPalette.BLUE,
                "The block degrades a tier each time a bud matures: Flawless, Chipped, Damaged, then plain quartz.");

        ScenePresets.say(scene, 5,
                "Mine a cluster with anything and it drops crystals; mine it with Silk Touch to move the cluster.");

        Selection accelerators = util.select().position(1, 1, 2)
                .add(util.select().position(3, 1, 2))
                .add(util.select().position(2, 1, 1))
                .add(util.select().position(2, 1, 3));

        ScenePresets.highlight(scene, 5, accelerators, PonderPalette.GREEN,
                "Crystal Growth Accelerators touching the block speed the growth up dramatically.");

        ScenePresets.needsPower(scene, util, 1, 1, 2,
                "Accelerators need AE power, and they only count when they touch the budding block.");

        ScenePresets.outro(scene, 5,
                "Add a Crystal Resonance Generator and a Spatial IO setup and quartz stops being a bottleneck.");
    }

    public static void network(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "ae2_network", "Your first ME Network");

        ScenePresets.say(scene, 5,
                "An ME Network is power, storage, and cable joining them. Everything else is an extra.");

        ScenePresets.input(scene, util, 5,
                "Power enters through an ME Energy Acceptor, which converts FE into AE.", 0, 1, 2);

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.GREEN,
                "The ME Controller hands out channels. Small networks can skip it entirely.");

        ScenePresets.highlight(scene, 5, util.select().position(3, 1, 2), PonderPalette.OUTPUT,
                "The ME Drive holds storage cells. Each cell is the network's actual disk space.");

        ScenePresets.say(scene, 5,
                "Every device that stores or moves items eats one channel. A plain cable carries eight.");

        ScenePresets.highlight(scene, 5, util.select().position(2, 2, 2), PonderPalette.MEDIUM,
                "Terminals, buses and P2P tunnels all attach to the cable as parts.");

        ScenePresets.outro(scene, 5,
                "Run out of channels and devices go dark. Dense cable carries thirty-two instead of eight.");
    }

    public static void craftingCpu(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "ae2_crafting_cpu", "Autocrafting");

        ScenePresets.say(scene, 5,
                "A Crafting CPU is any solid cube of crafting blocks attached to the network.");

        Selection cpu = util.select().fromTo(1, 1, 1, 2, 2, 2);

        ScenePresets.highlight(scene, 5, cpu, PonderPalette.GREEN,
                "Crafting Storage sets how large a job the CPU can plan. No storage, no crafting.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 1, 2), PonderPalette.FAST,
                "Co-Processing Units let the CPU push several ingredients out at once.");

        ScenePresets.highlight(scene, 5, util.select().position(1, 2, 1), PonderPalette.OUTPUT,
                "A Crafting Monitor shows what the CPU is currently working on.");

        ScenePresets.highlight(scene, 5, util.select().position(4, 1, 2), PonderPalette.INPUT,
                "Pattern Providers hold the recipes and push ingredients into the machine behind them.");

        ScenePresets.highlight(scene, 5, util.select().position(4, 1, 1), PonderPalette.MEDIUM,
                "A Molecular Assembler bolted to a provider handles ordinary crafting-table recipes.");

        ScenePresets.say(scene, 5,
                "Build several small CPUs rather than one huge one, so separate jobs can run side by side.");

        ScenePresets.outro(scene, 5,
                "Each CPU is one job at a time - the number of CPUs is the number of parallel crafts.");
    }

    public static void charger(SceneBuilder scene, SceneBuildingUtil util) {
        ScenePresets.intro(scene, util, "ae2_charger", "The Charger");

        ScenePresets.say(scene, 5,
                "The Charger turns Certus Quartz into Charged Certus Quartz, which is where Fluix comes from.");

        ScenePresets.input(scene, util, 5,
                "Drop a crystal in the front and wait. It also recharges tools and energy cells.", 2, 1, 2);

        ScenePresets.highlight(scene, 5, util.select().position(2, 2, 2), PonderPalette.FAST,
                "No power yet? Bolt a Crank on top and turn it by hand.");

        ScenePresets.highlight(scene, 5, util.select().position(0, 1, 2), PonderPalette.RED,
                "The Vibration Chamber burns fuel for AE directly - crude, but it works on day one.");

        ScenePresets.highlight(scene, 5, util.select().position(4, 1, 2), PonderPalette.INPUT,
                "Once you have a real generator, the Energy Acceptor takes over.");

        ScenePresets.outro(scene, 5,
                "Charged Certus plus Nether Quartz plus Redstone, thrown in water, gives you Fluix.");
    }
}
