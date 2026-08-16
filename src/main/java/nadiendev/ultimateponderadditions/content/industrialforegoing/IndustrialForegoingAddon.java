package nadiendev.ultimateponderadditions.content.industrialforegoing;

import java.util.Collection;

import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.TagRegistration;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.content.BuiltInAddon;
import nadiendev.ultimateponderadditions.content.UPATags;

public class IndustrialForegoingAddon extends BuiltInAddon {
    private static final String IF = IFSchematics.IF;

    @Override
    public String id() {
        return "industrialforegoing";
    }

    @Override
    public int priority() {
        return 100;
    }

    @Override
    public void registerTags(TagRegistration reg) {
        reg.tag(UPATags.INDUSTRIAL_FOREGOING, IF + "machine_frame_pity")
                .title("Industrial Foregoing")
                .description("Machines that farm, mine and generate on your behalf.")
                .addToIndex()
                .register();
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        String tag = UPATags.INDUSTRIAL_FOREGOING;

        reg.forComponents(IF + "plant_gatherer", IF + "plant_sower", IF + "plant_fertilizer")
                .addStoryBoard(IFSchematics.PLANT_FARM.path(), IFScenes::plantFarm, reg.asLocation(tag));

        reg.forComponents(IF + "mob_crusher", IF + "mob_duplicator", IF + "mob_slaughter_factory")
                .addStoryBoard(IFSchematics.MOB_FARM.path(), IFScenes::mobFarm, reg.asLocation(tag));

        reg.forComponents(IF + "ore_laser_base", IF + "laser_drill", IF + "fluid_laser_base")
                .addStoryBoard(IFSchematics.LASER_DRILL.path(), IFScenes::laserDrill, reg.asLocation(tag));

        reg.forComponents(
                        IF + "bioreactor",
                        IF + "biofuel_generator",
                        IF + "pitiful_generator",
                        IF + "sludge_refiner",
                        IF + "latex_processing_unit")
                .addStoryBoard(IFSchematics.POWER.path(), IFScenes::power, reg.asLocation(tag));

        reg.forComponents(IF + "conveyor", IF + "block_placer", IF + "block_breaker")
                .addStoryBoard(IFSchematics.CONVEYOR.path(), IFScenes::conveyor, reg.asLocation(tag));
    }

    @Override
    public Collection<SchematicTemplate> schematics() {
        return IFSchematics.all();
    }
}
