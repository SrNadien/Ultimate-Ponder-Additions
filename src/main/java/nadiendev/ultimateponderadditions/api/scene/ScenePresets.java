package nadiendev.ultimateponderadditions.api.scene;

import nadiendev.ultimateponderadditions.api.util.RegistryLookup;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.element.TextElementBuilder;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;

public final class ScenePresets {
    public static final int SECOND = 20;

    private ScenePresets() {
    }

    public static void intro(SceneBuilder scene, SceneBuildingUtil util, String sceneId, String title, int baseSize) {
        scene.title(sceneId, title);
        scene.configureBasePlate(0, 0, baseSize);
        scene.showBasePlate();
        scene.idle(10);
        scene.world().showSection(util.select().layersFrom(1), Direction.DOWN);
        scene.idle(10);
    }

    public static void intro(SceneBuilder scene, SceneBuildingUtil util, String sceneId, String title) {
        intro(scene, util, sceneId, title, 5);
    }

    public static TextElementBuilder say(SceneBuilder scene, int seconds, String text) {
        TextElementBuilder builder = scene.overlay().showText(seconds * SECOND).text(text).attachKeyFrame();
        scene.idleSeconds(seconds);
        return builder;
    }

    public static TextElementBuilder sayAt(SceneBuilder scene, SceneBuildingUtil util, int seconds, String text,
                                           int x, int y, int z) {
        TextElementBuilder builder = scene.overlay()
                .showText(seconds * SECOND)
                .text(text)
                .pointAt(util.vector().centerOf(x, y, z))
                .placeNearTarget()
                .attachKeyFrame();
        scene.idleSeconds(seconds);
        return builder;
    }

    public static TextElementBuilder highlight(SceneBuilder scene, int seconds, Selection selection,
                                               PonderPalette color, String text) {
        TextElementBuilder builder = scene.overlay()
                .showOutlineWithText(selection, seconds * SECOND)
                .colored(color)
                .text(text)
                .attachKeyFrame();
        scene.idleSeconds(seconds);
        return builder;
    }

    public static TextElementBuilder input(SceneBuilder scene, SceneBuildingUtil util, int seconds,
                                           String text, int x, int y, int z) {
        return highlight(scene, seconds, util.select().position(x, y, z), PonderPalette.INPUT, text);
    }

    public static TextElementBuilder output(SceneBuilder scene, SceneBuildingUtil util, int seconds,
                                            String text, int x, int y, int z) {
        return highlight(scene, seconds, util.select().position(x, y, z), PonderPalette.OUTPUT, text);
    }

    public static void needsPower(SceneBuilder scene, SceneBuildingUtil util, int x, int y, int z, String text) {
        scene.effects().indicateRedstone(new BlockPos(x, y, z));
        highlight(scene, 4, util.select().position(x, y, z), PonderPalette.RED, text);
    }

    public static void dropItemOnto(SceneBuilder scene, SceneBuildingUtil util, String itemId,
                                    int x, int y, int z) {
        if (!RegistryLookup.itemExists(itemId)) {
            return;
        }
        Vec3 above = util.vector().topOf(x, y, z).add(0, 1.5, 0);
        scene.world().createItemEntity(above, new Vec3(0, -0.1, 0), RegistryLookup.stack(itemId));
        scene.idle(15);
    }

    public static void swap(SceneBuilder scene, int x, int y, int z, String stateDescriptor) {
        scene.world().setBlock(new BlockPos(x, y, z), RegistryLookup.state(stateDescriptor), true);
    }

    public static void focus(SceneBuilder scene, SceneBuildingUtil util, int x, int y, int z) {
        scene.special().movePointOfInterest(util.vector().centerOf(x, y, z));
    }

    public static void hide(SceneBuilder scene, Selection selection, Direction direction) {
        scene.world().hideSection(selection, direction);
        scene.idle(10);
    }

    public static void outro(SceneBuilder scene, int seconds, String text) {
        say(scene, seconds, text);
        scene.markAsFinished();
    }

    public static void showAll(SceneBuilder scene, SceneBuildingUtil util) {
        scene.world().showSection(util.select().everywhere(), Direction.DOWN);
    }

    public static TextElementBuilder pointText(SceneBuilder scene, int ticks, String text,
                                               double x, double y, double z) {
        return scene.overlay()
                .showText(ticks)
                .text(text)
                .pointAt(new Vec3(x, y, z))
                .placeNearTarget();
    }

    public static Selection box(SceneBuildingUtil util, int x1, int y1, int z1, int x2, int y2, int z2) {
        return util.select().fromTo(x1, y1, z1, x2, y2, z2);
    }

    public static void show(SceneBuilder scene, Selection selection, Direction from) {
        scene.world().showSection(selection, from);
    }
}
