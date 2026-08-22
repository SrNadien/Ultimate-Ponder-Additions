package nadiendev.ultimateponderadditions.content.botanypots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class BotanyPotsAddon extends BuiltInAddon {

    private static final String BP = BPSchematics.BP;

    private static final List<String> MATERIALS = List.of(
            "terracotta", "bricks", "stone_bricks", "deepslate_bricks", "mossy_stone_bricks", "mud_bricks",
            "nether_bricks", "red_nether_bricks", "end_stone_bricks", "polished_blackstone_bricks",
            "prismarine_bricks", "quartz_bricks", "tuff_bricks",
            "white_terracotta", "orange_terracotta", "magenta_terracotta", "light_blue_terracotta",
            "yellow_terracotta", "lime_terracotta", "pink_terracotta", "gray_terracotta",
            "light_gray_terracotta", "cyan_terracotta", "purple_terracotta", "blue_terracotta",
            "brown_terracotta", "green_terracotta", "red_terracotta", "black_terracotta",
            "white_concrete", "orange_concrete", "magenta_concrete", "light_blue_concrete",
            "yellow_concrete", "lime_concrete", "pink_concrete", "gray_concrete",
            "light_gray_concrete", "cyan_concrete", "purple_concrete", "blue_concrete",
            "brown_concrete", "green_concrete", "red_concrete", "black_concrete",
            "white_glazed_terracotta", "orange_glazed_terracotta", "magenta_glazed_terracotta",
            "light_blue_glazed_terracotta", "yellow_glazed_terracotta", "lime_glazed_terracotta",
            "pink_glazed_terracotta", "gray_glazed_terracotta", "light_gray_glazed_terracotta",
            "cyan_glazed_terracotta", "purple_glazed_terracotta", "blue_glazed_terracotta",
            "brown_glazed_terracotta", "green_glazed_terracotta", "red_glazed_terracotta",
            "black_glazed_terracotta");

    @Override
    public String id() {
        return "botanypots";
    }

    @Override
    public int priority() {
        return 600;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.BOTANY_POTS, BP + "terracotta_botany_pot")
                .title("Botany Pots")
                .description("One crop per block, no farmland required.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.BOTANY_POTS;

        reg.forComponents(variants("_botany_pot"))
                .addStoryBoard(BPSchematics.POTS.path(), BPScenes::botanyPot, reg.asLocation(tag));

        reg.forComponents(variants("_hopper_botany_pot"))
                .addStoryBoard(BPSchematics.POTS.path(), BPScenes::hopperPot, reg.asLocation(tag));

        reg.forComponents(variants("_waxed_botany_pot"))
                .addStoryBoard(BPSchematics.POTS.path(), BPScenes::waxedPot, reg.asLocation(tag));
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return BPSchematics.all();
    }

    private static String[] variants(String suffix) {
        List<String> ids = new ArrayList<>();
        for (String material : MATERIALS) {
            ids.add(BP + material + suffix);
        }
        return ids.toArray(String[]::new);
    }
}
