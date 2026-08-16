package nadiendev.ultimateponderadditions.datagen;

import java.util.Map;
import java.util.function.Supplier;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class UPALangProvider extends LanguageProvider {
    private final Supplier<Map<String, String>> entries;

    public UPALangProvider(PackOutput output, String locale, Supplier<Map<String, String>> entries) {
        super(output, UltimatePonderAdditions.MODID, locale);
        this.entries = entries;
    }

    @Override
    protected void addTranslations() {
        entries.get().forEach(this::add);
    }
}
