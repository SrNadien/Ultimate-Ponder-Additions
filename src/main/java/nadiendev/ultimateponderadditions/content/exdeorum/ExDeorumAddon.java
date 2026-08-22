package nadiendev.ultimateponderadditions.content.exdeorum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class ExDeorumAddon extends BuiltInAddon {

    private static final String EXD = ExDeorumSchematics.EXD;

    private static final List<String> WOODS = List.of(
            "oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "cherry", "bamboo",
            "crimson", "warped", "archwood", "blue_archwood", "green_archwood", "purple_archwood",
            "red_archwood", "bluebright", "comet", "crystallized", "dead", "dusk", "fir", "frostbright",
            "golden_oak", "hellbark", "jacaranda", "lunar", "magic", "mahogany", "maple", "palm",
            "redwood", "skyroot", "starlit", "umbran", "willow");

    @Override
    public String id() {
        return "exdeorum";
    }

    @Override
    public int priority() {
        return 700;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.EX_DEORUM, EXD + "oak_sieve")
                .title("Ex Deorum")
                .description("Barrels, crucibles, sieves and hammers: making something out of nothing.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.EX_DEORUM;

        reg.forComponents(withStone(variants("_barrel")))
                .addStoryBoard(ExDeorumSchematics.BARREL.path(), ExDeorumScenes::barrel, reg.asLocation(tag));

        List<String> crucibles = new ArrayList<>(List.of(variants("_crucible")));
        crucibles.add(EXD + "porcelain_crucible");
        crucibles.add(EXD + "unfired_porcelain_crucible");
        reg.forComponents(crucibles.toArray(String[]::new))
                .addStoryBoard(ExDeorumSchematics.CRUCIBLE.path(), ExDeorumScenes::crucible, reg.asLocation(tag));

        List<String> sieves = new ArrayList<>(List.of(variants("_sieve")));
        sieves.addAll(List.of(variants("_compressed_sieve")));
        reg.forComponents(sieves.toArray(String[]::new))
                .addStoryBoard(ExDeorumSchematics.SIEVE.path(), ExDeorumScenes::sieve, reg.asLocation(tag));

        reg.forComponents(EXD + "wooden_hammer", EXD + "stone_hammer", EXD + "iron_hammer",
                        EXD + "golden_hammer", EXD + "diamond_hammer", EXD + "netherite_hammer",
                        EXD + "compressed_wooden_hammer", EXD + "compressed_stone_hammer",
                        EXD + "compressed_iron_hammer", EXD + "compressed_golden_hammer",
                        EXD + "compressed_diamond_hammer", EXD + "compressed_netherite_hammer",
                        EXD + "crook", EXD + "bone_crook", EXD + "silkworm", EXD + "infested_leaves")
                .addStoryBoard(ExDeorumSchematics.HAMMER.path(), ExDeorumScenes::hammer, reg.asLocation(tag));

        reg.forComponents(EXD + "mechanical_hammer", EXD + "mechanical_sieve")
                .addStoryBoard(ExDeorumSchematics.MECHANICAL.path(), ExDeorumScenes::mechanical,
                        reg.asLocation(tag));
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return ExDeorumSchematics.all();
    }

    private static String[] variants(String suffix) {
        List<String> ids = new ArrayList<>();
        for (String wood : WOODS) {
            ids.add(EXD + wood + suffix);
        }
        return ids.toArray(String[]::new);
    }

    private static String[] withStone(String[] barrels) {
        List<String> ids = new ArrayList<>(List.of(barrels));
        ids.add(EXD + "stone_barrel");
        return ids.toArray(String[]::new);
    }
}
