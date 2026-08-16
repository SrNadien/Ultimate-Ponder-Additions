package nadiendev.ultimateponderadditions.datagen;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import nadiendev.ultimateponderadditions.UltimatePonderAdditions;
import nadiendev.ultimateponderadditions.internal.ponder.PonderIntegration;
import net.createmod.ponder.foundation.PonderIndex;

public final class UPALang {

    private static final String MODID = UltimatePonderAdditions.MODID;

    private static Map<String, String> english;

    private UPALang() {
    }

    public static synchronized Map<String, String> english() {
        if (english == null) {
            Map<String, String> entries = new LinkedHashMap<>();
            entries.put("itemGroup." + MODID, UltimatePonderAdditions.NAME);
            entries.put("item." + MODID + ".guide", "Ultimate Ponder Additions Guide");
            entries.put("item." + MODID + ".guide.tooltip",
                    "Machines, drawers, chickens and networks, explained.");
            entries.putAll(ponder());
            english = entries;
        }
        return english;
    }

    public static Map<String, String> spanish() {
        Map<String, String> entries = new LinkedHashMap<>();
        List<String> missing = new ArrayList<>();

        for (String key : english().keySet()) {
            String translated = SpanishLang.ENTRIES.get(key);
            if (translated == null) {
                missing.add(key);
            } else {
                entries.put(key, translated);
            }
        }

        if (!missing.isEmpty()) {
            UltimatePonderAdditions.LOGGER.warn(
                    "{} es_es translation(s) missing, those keys will fall back to en_us: {}",
                    missing.size(), missing);
        }

        List<String> stale = new ArrayList<>(SpanishLang.ENTRIES.keySet());
        stale.removeAll(english().keySet());
        if (!stale.isEmpty()) {
            UltimatePonderAdditions.LOGGER.warn(
                    "{} es_es translation(s) no longer match any key and were dropped: {}",
                    stale.size(), stale);
        }

        return entries;
    }

    private static Map<String, String> ponder() {
        Map<String, String> entries = new TreeMap<>();
        try {
            PonderIntegration.init();
            PonderIndex.getLangAccess().provideLang(MODID, entries::put);
        } catch (RuntimeException | LinkageError e) {
            UltimatePonderAdditions.LOGGER.error(
                    "Could not collect Ponder scene translations. Every scene title and caption will "
                            + "be missing from the generated lang files.", e);
        }
        return entries;
    }
}
