package nadiendev.ultimateponderadditions.datagen;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.api.PonderAddon;
import nadiendev.ultimateponderadditions.api.schematic.SchematicTemplate;
import nadiendev.ultimateponderadditions.internal.AddonManager;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtIo;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.Util;

public class SchematicProvider implements DataProvider {
    private final PackOutput output;

    public SchematicProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        Path assets = output.getOutputFolder(PackOutput.Target.RESOURCE_PACK);
        List<CompletableFuture<?>> tasks = new ArrayList<>();

        for (PonderAddon addon : AddonManager.ponderAddons()) {
            String namespace = addon.namespace();
            String guideFolder = "guides/" + UltimatePonderAdditions.GUIDE_ID.getNamespace()
                    + "/" + UltimatePonderAdditions.GUIDE_ID.getPath();

            for (SchematicTemplate template : addon.schematics()) {
                CompoundTag tag = template.toStructureTag();

                tasks.add(write(cache, assets.resolve(namespace).resolve("ponder")
                        .resolve(template.path() + ".nbt"), gzipped(tag)));

                tasks.add(write(cache, assets.resolve(namespace).resolve(guideFolder).resolve("assets")
                        .resolve(template.path() + ".snbt"),
                        NbtUtils.structureToSnbt(tag).getBytes(StandardCharsets.UTF_8)));
            }
        }

        UltimatePonderAdditions.LOGGER.info("Generating {} schematic file(s)", tasks.size());
        return CompletableFuture.allOf(tasks.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Ponder Schematics";
    }

    private static byte[] gzipped(CompoundTag tag) {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            NbtIo.writeCompressed(tag, out);
            return out.toByteArray();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @SuppressWarnings("deprecation")
    private static CompletableFuture<?> write(CachedOutput cache, Path path, byte[] data) {
        return CompletableFuture.runAsync(() -> {
            try {
                HashCode hash = Hashing.sha1().hashBytes(data);
                cache.writeIfNeeded(path, data, hash);
            } catch (IOException e) {
                throw new UncheckedIOException("Failed to write " + path, e);
            }
        }, Util.backgroundExecutor());
    }
}
