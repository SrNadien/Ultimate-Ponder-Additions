package nadiendev.ultimateponderadditions.api.schematic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import net.minecraft.SharedConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.IntTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.TagParser;
import org.jetbrains.annotations.Nullable;

public final class SchematicTemplate {
    private final String path;
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;
    private final Map<BlockPos, Entry> blocks;

    private SchematicTemplate(String path, int sizeX, int sizeY, int sizeZ, Map<BlockPos, Entry> blocks) {
        this.path = path;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.blocks = blocks;
    }

    public static Builder builder(String path, int sizeX, int sizeY, int sizeZ) {
        return new Builder(path, sizeX, sizeY, sizeZ);
    }

    public String path() {
        return path;
    }

    public int sizeX() {
        return sizeX;
    }

    public int sizeY() {
        return sizeY;
    }

    public int sizeZ() {
        return sizeZ;
    }

    public CompoundTag toStructureTag() {
        List<String> palette = new ArrayList<>();
        ListTag blockList = new ListTag();

        for (Map.Entry<BlockPos, Entry> entry : blocks.entrySet()) {
            BlockPos pos = entry.getKey();
            Entry block = entry.getValue();

            int state = palette.indexOf(block.state);
            if (state < 0) {
                state = palette.size();
                palette.add(block.state);
            }

            CompoundTag blockTag = new CompoundTag();
            blockTag.put("pos", intList(pos.getX(), pos.getY(), pos.getZ()));
            blockTag.putInt("state", state);
            if (block.data != null) {
                blockTag.put("nbt", block.data.copy());
            }
            blockList.add(blockTag);
        }

        ListTag paletteTag = new ListTag();
        for (String state : palette) {
            paletteTag.add(parseState(state));
        }

        CompoundTag root = new CompoundTag();
        root.put("size", intList(sizeX, sizeY, sizeZ));
        root.put("palette", paletteTag);
        root.put("blocks", blockList);
        root.put("entities", new ListTag());
        root.putInt("DataVersion", SharedConstants.getCurrentVersion().getDataVersion().getVersion());
        return root;
    }

    private static ListTag intList(int... values) {
        ListTag list = new ListTag();
        for (int value : values) {
            list.add(IntTag.valueOf(value));
        }
        return list;
    }

    static CompoundTag parseState(String descriptor) {
        String trimmed = descriptor.trim();
        CompoundTag tag = new CompoundTag();

        int bracket = trimmed.indexOf('[');
        if (bracket < 0) {
            tag.putString("Name", withNamespace(trimmed));
            return tag;
        }

        if (!trimmed.endsWith("]")) {
            throw new IllegalArgumentException("Unbalanced '[' in blockstate descriptor: " + descriptor);
        }

        tag.putString("Name", withNamespace(trimmed.substring(0, bracket)));

        CompoundTag properties = new CompoundTag();
        String body = trimmed.substring(bracket + 1, trimmed.length() - 1).trim();
        if (!body.isEmpty()) {
            for (String pair : body.split(",")) {
                int eq = pair.indexOf('=');
                if (eq < 0) {
                    throw new IllegalArgumentException("Malformed property '" + pair + "' in: " + descriptor);
                }
                properties.put(pair.substring(0, eq).trim(),
                        StringTag.valueOf(pair.substring(eq + 1).trim()));
            }
        }
        tag.put("Properties", properties);
        return tag;
    }

    private static String withNamespace(String id) {
        String trimmed = id.trim().toLowerCase(Locale.ROOT);
        return trimmed.indexOf(':') < 0 ? "minecraft:" + trimmed : trimmed;
    }

    private record Entry(String state, @Nullable CompoundTag data) {
    }

    public static final class Builder {
        private final String path;
        private final int sizeX;
        private final int sizeY;
        private final int sizeZ;

        private final Map<BlockPos, Entry> blocks = new LinkedHashMap<>();

        private Builder(String path, int sizeX, int sizeY, int sizeZ) {
            if (sizeX < 1 || sizeY < 1 || sizeZ < 1) {
                throw new IllegalArgumentException("Schematic " + path + " has a non-positive size");
            }
            this.path = Objects.requireNonNull(path, "path");
            this.sizeX = sizeX;
            this.sizeY = sizeY;
            this.sizeZ = sizeZ;
        }

        public Builder set(int x, int y, int z, String state) {
            return set(x, y, z, state, (CompoundTag) null);
        }

        public Builder set(int x, int y, int z, String state, String blockEntitySnbt) {
            try {
                return set(x, y, z, state, TagParser.parseTag(blockEntitySnbt));
            } catch (Exception e) {
                throw new IllegalArgumentException(
                        "Invalid block entity data for " + path + " at " + x + "," + y + "," + z, e);
            }
        }

        public Builder set(int x, int y, int z, String state, @Nullable CompoundTag blockEntityData) {
            checkBounds(x, y, z);

            SchematicTemplate.parseState(state);
            blocks.put(new BlockPos(x, y, z), new Entry(state, blockEntityData));
            return this;
        }

        public Builder fill(int x1, int y1, int z1, int x2, int y2, int z2, String state) {
            for (int x = Math.min(x1, x2); x <= Math.max(x1, x2); x++) {
                for (int y = Math.min(y1, y2); y <= Math.max(y1, y2); y++) {
                    for (int z = Math.min(z1, z2); z <= Math.max(z1, z2); z++) {
                        set(x, y, z, state);
                    }
                }
            }
            return this;
        }

        public Builder layer(int y, String state) {
            return fill(0, y, 0, sizeX - 1, y, sizeZ - 1, state);
        }

        public Builder basePlate(String state) {
            return layer(0, state);
        }

        public Builder column(int x, int z, int y1, int y2, String state) {
            return fill(x, y1, z, x, y2, z, state);
        }

        public Builder outline(int x1, int z1, int x2, int z2, int y, String state) {
            int minX = Math.min(x1, x2);
            int maxX = Math.max(x1, x2);
            int minZ = Math.min(z1, z2);
            int maxZ = Math.max(z1, z2);
            for (int x = minX; x <= maxX; x++) {
                set(x, y, minZ, state);
                set(x, y, maxZ, state);
            }
            for (int z = minZ + 1; z < maxZ; z++) {
                set(minX, y, z, state);
                set(maxX, y, z, state);
            }
            return this;
        }

        public SchematicTemplate build() {
            return new SchematicTemplate(path, sizeX, sizeY, sizeZ, new LinkedHashMap<>(blocks));
        }

        private void checkBounds(int x, int y, int z) {
            if (x < 0 || y < 0 || z < 0 || x >= sizeX || y >= sizeY || z >= sizeZ) {
                throw new IllegalArgumentException("Position " + x + "," + y + "," + z
                        + " is outside schematic " + path + " (" + sizeX + "x" + sizeY + "x" + sizeZ + ")");
            }
        }
    }
}
