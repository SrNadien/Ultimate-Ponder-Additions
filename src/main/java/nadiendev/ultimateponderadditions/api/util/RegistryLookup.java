package nadiendev.ultimateponderadditions.api.util;

import java.util.Locale;
import java.util.Optional;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;

public final class RegistryLookup {
    private RegistryLookup() {
    }

    public static Block block(String id) {
        return parse(id).map(BuiltInRegistries.BLOCK::get).orElse(Blocks.AIR);
    }

    public static boolean blockExists(String id) {
        return parse(id).map(BuiltInRegistries.BLOCK::containsKey).orElse(false);
    }

    public static Item item(String id) {
        return parse(id).map(BuiltInRegistries.ITEM::get).orElse(Items.AIR);
    }

    public static boolean itemExists(String id) {
        return parse(id).map(BuiltInRegistries.ITEM::containsKey).orElse(false);
    }

    public static ItemStack stack(String id) {
        return stack(id, 1);
    }

    public static ItemStack stack(String id, int count) {
        Item item = item(id);
        return item == Items.AIR ? ItemStack.EMPTY : new ItemStack(item, count);
    }

    public static BlockState state(String descriptor) {
        String trimmed = descriptor.trim();
        int bracket = trimmed.indexOf('[');
        if (bracket < 0) {
            return block(trimmed).defaultBlockState();
        }
        if (!trimmed.endsWith("]")) {
            throw new IllegalArgumentException("Unbalanced '[' in blockstate descriptor: " + descriptor);
        }

        Block block = block(trimmed.substring(0, bracket));
        BlockState state = block.defaultBlockState();
        if (block == Blocks.AIR) {
            return state;
        }

        String body = trimmed.substring(bracket + 1, trimmed.length() - 1).trim();
        if (body.isEmpty()) {
            return state;
        }

        StateDefinition<Block, BlockState> definition = block.getStateDefinition();
        for (String pair : body.split(",")) {
            int eq = pair.indexOf('=');
            if (eq < 0) {
                continue;
            }
            Property<?> property = definition.getProperty(pair.substring(0, eq).trim());
            if (property != null) {
                state = apply(state, property, pair.substring(eq + 1).trim());
            }
        }
        return state;
    }

    private static <T extends Comparable<T>> BlockState apply(BlockState state, Property<T> property, String value) {
        return property.getValue(value).map(v -> state.setValue(property, v)).orElse(state);
    }

    private static Optional<ResourceLocation> parse(String id) {
        String trimmed = id.trim().toLowerCase(Locale.ROOT);
        if (trimmed.isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(ResourceLocation.tryParse(
                trimmed.indexOf(':') < 0 ? "minecraft:" + trimmed : trimmed));
    }
}
