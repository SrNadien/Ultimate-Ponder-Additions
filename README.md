# Ultimate Ponder Additions

An addon for two documentation libraries: [Ponder](https://github.com/Creators-of-Create/Ponder) by
the Create team, and [GuideME](https://github.com/AppliedEnergistics/GuideME) by the Applied
Energistics team. Neither is mine, and neither is bundled here. This mod only supplies content for
them, plus an API so other mods can supply their own.

Ponder is the animated in-game explainer you get by hovering an item and holding a key. GuideME is
the markdown-driven guidebook AE2 uses. Both are libraries, and both are only as useful as the
content mods write for them. Industrial Foregoing, Functional Storage, Modern Chickens and Applied
Energistics 2 never shipped Ponder scenes, so this adds them, along with a guidebook covering the
same ground.

Minecraft 1.21.1, NeoForge 21.1.240.

## What it covers

**Industrial Foregoing** - Plant Sower/Gatherer/Fertilizer, Mob Duplicator + Crusher + Slaughter
Factory, Ore Laser Base and Laser Drills, the Bioreactor power chain, conveyors with Block
Placer/Breaker.

**Functional Storage** - the 1/2/4 slot drawers, Storage Controller and extensions, compacting
drawers, ender drawers, the Armory Cabinet.

**Modern Chickens** - Roost and Collector, Breeder and Nests, Henhouse, Incubator, the Avian
converters.

**Applied Energistics 2** - Inscriber, budding quartz and growth accelerators, a minimal ME network,
crafting CPUs, Charger and Crank.

Twenty scenes in total, registered against about ninety blocks (every drawer wood, every crafting
storage tier, and so on). Each one also has a section in the guidebook with the same structure
embedded as a 3D scene.

## Using it in game

Hover a documented block in your inventory and hold the Ponder key (W by default). The guidebook has
its own creative tab, or you can open it with GuideME's hotkey.

## Dependencies

Ponder is required on the client, since without it there is nothing for the scenes to run in. It
pulls Flywheel with it. Install it separately.

GuideME is optional and also installed separately. Without it you lose the book, but the Ponder
scenes still work.

Both are third-party libraries. Bugs in the Ponder UI or the guidebook renderer belong in their
issue trackers, not this one.

The four documented mods are all optional and none of them is a compile dependency. Everything is
written against registry ids instead of their classes, which means the mod builds without them
installed and their updates cannot break the build. It also means a missing block just does not get
a scene.

## Building

```
gradlew runData
gradlew build
```

`runData` is not optional the first time. Scene structures and all of the Ponder text live in
`src/generated/resources` and are produced there. Re-run it after touching a scene or a schematic.

If Gradle dies with `Unsupported class file major version 69`, your default JDK is too new. Point it
at 21:

```
JAVA_HOME="C:/Program Files/Java/jdk-21" ./gradlew build
```

## Dev runtime

`gradlew runClient` starts with all four documented mods loaded so the scenes can actually be
tested. They come from:

- Industrial Foregoing and Titanium: `maven.blamejared.com`
- Functional Storage and Modern Chickens: the Modrinth maven, since neither publishes anywhere else
- Applied Energistics 2: Maven Central

Versions are in `gradle.properties`. Set `runtime_integrated_mods=false` to build without any of
them.

## Config

`config/ultimateponderadditions-client.toml`:

- `enablePonderScenes` - register the scenes at all
- `enableGuidebook` - build the GuideME book
- `disabledAddons` - list of addon ids to skip. The built-in ones are `industrialforegoing`,
  `functionalstorage`, `chickens`, `ae2`

## Translating

Nothing under `lang/` is written by hand. Ponder builds the scene translation keys from the English
strings in the storyboards, and `runData` turns that into both `en_us.json` and `es_es.json`.

English comes straight out of Ponder. Spanish comes from a key/value table in
`datagen/SpanishLang.java`, checked against the generated key set on every run: keys with no
translation get left out (Minecraft falls back to English for those) and translations that no longer
match any key get dropped. Both cases are logged during `runData`, so a scene edit that outdates a
translation is visible immediately.

To add another language, write a second table and register one more provider in `UPADataGen`.

Caption keys are numbered `text_1`, `text_2` and so on, in the order the storyboard creates them.
Insert a line in the middle of a released scene and everything after it shifts, which will orphan
its translations. Add at the end.

If a generated file ever looks out of date, delete `src/generated/resources/.cache` and re-run
`runData`. Data generation skips files whose hash it thinks it already wrote.

## Adding your own content

Guidebook pages need no code. Put markdown in
`assets/<yourmod>/guides/ultimateponderadditions/guide/` and GuideME picks it up.

Ponder scenes need a class implementing `PonderAddon` and an annotation. Roughly thirty lines.

[API.md](API.md) covers both. The four bundled integrations under
`src/main/java/nadiendev/ultimateponderadditions/content/` use nothing that is not documented there,
so they work as examples.

## Layout

```
src/main/java/nadiendev/ultimateponderadditions/
  api/         public API
  client/      client-side startup
  content/     the four bundled integrations
  datagen/     structure and lang generation
  internal/    addon discovery, Ponder and GuideME glue

src/main/resources/assets/ultimateponderadditions/
  guides/      guidebook pages
  lang/        hand-written translations
```

## License

MIT.
