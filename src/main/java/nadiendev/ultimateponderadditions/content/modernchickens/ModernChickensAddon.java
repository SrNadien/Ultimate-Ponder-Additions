package nadiendev.ultimateponderadditions.content.modernchickens;

import java.util.Collection;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class ModernChickensAddon extends BuiltInAddon {
    private static final String MC = ChickensSchematics.MC;

    @Override
    public String id() {
        return "chickens";
    }

    @Override
    public int priority() {
        return 300;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.MODERN_CHICKENS, MC + "roost")
                .title("Modern Chickens")
                .description("Roosts, breeders and the birds that lay everything from iron to lava.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.MODERN_CHICKENS;

        reg.forComponents(MC + "roost", MC + "mechanical_roost", MC + "collector")
                .addStoryBoard(ChickensSchematics.ROOST.path(), ChickensScenes::roost, reg.asLocation(tag));

        reg.forComponents(MC + "breeder", MC + "nest", MC + "mechanical_nest")
                .addStoryBoard(ChickensSchematics.BREEDER.path(), ChickensScenes::breeder, reg.asLocation(tag));

        reg.forComponents(
                        MC + "henhouse",
                        MC + "henhouse_acacia",
                        MC + "henhouse_birch",
                        MC + "henhouse_dark_oak",
                        MC + "henhouse_jungle",
                        MC + "henhouse_spruce")
                .addStoryBoard(ChickensSchematics.HENHOUSE.path(), ChickensScenes::henhouse, reg.asLocation(tag));

        reg.scene(MC + "incubator", ChickensSchematics.INCUBATOR.path(), ChickensScenes::incubator, tag)
                .highlightAllTags();

        reg.forComponents(
                        MC + "avian_flux_converter",
                        MC + "avian_fluid_converter",
                        MC + "avian_chemical_converter",
                        MC + "avian_dousing_machine")
                .addStoryBoard(ChickensSchematics.GENERATOR.path(), ChickensScenes::generator, reg.asLocation(tag));
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return ChickensSchematics.all();
    }
}
