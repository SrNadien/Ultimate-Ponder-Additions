# Addon API

Ultimate Ponder Additions is itself an addon for two libraries written by other people:
[Ponder](https://github.com/Creators-of-Create/Ponder) (Create team) and
[GuideME](https://github.com/AppliedEnergistics/GuideME) (Applied Energistics team). Everything
below is a thin layer on top of theirs, not a replacement for it. Scenes are Ponder's
`PonderStoryBoard`, pages are GuideME markdown, and both of their APIs stay reachable from here.

What this mod actually adds is the plumbing: addon discovery, one Ponder plugin per addon so
namespaces stay separate, a shared guidebook to hang pages off, structure generation, and a few
scene helpers. If your mod would rather register its own `PonderPlugin` or build its own `Guide`
directly, that works too and nothing here is in the way. Their docs are the reference for anything
this page does not cover.

There are two halves and they are independent: you can add guidebook pages without writing any Java,
and you can add Ponder scenes without touching the guidebook.

- [Guidebook pages](#guidebook-pages) - no code, just resources
- [Ponder scenes](#ponder-scenes) - one class and an annotation
- [Writing a scene](#writing-a-scene)
- [Structures](#structures)
- [Translations](#translations)
- [Guidebook extensions](#guidebook-extensions)
- [Class reference](#class-reference)

## Guidebook pages

GuideME reads pages out of every resource pack and every namespace, as long as they sit in the
guide's content folder. The guide id here is `ultimateponderadditions:guide`, so that folder is:

```
assets/<any-namespace>/guides/ultimateponderadditions/guide/
```

Anything with a `.md` extension in there becomes a page. There is nothing to register and no
dependency to declare. It works from a plain resource pack as well as from a mod jar.

```
src/main/resources/assets/mymod/guides/ultimateponderadditions/guide/
  mymod.md
  assets/
    mymod/
      pulverizer.snbt
```

```markdown
---
navigation:
  parent: index.md
  title: My Mod
  position: 50
item_ids:
  - mymod:pulverizer
---

# My Mod

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/mymod/pulverizer.snbt" />
  <BlockAnnotation x="0" y="0" z="0" color="#8cba51">The pulverizer.</BlockAnnotation>
</GameScene>
```

`src` is resolved against the page's own id, so a page at the guide root reaches `assets/...`
directly and a page one folder down needs `../assets/...`. Both `.snbt` and `.nbt` structure files
work.

For the full markdown reference (every tag and attribute) see
[GuideME's own docs](https://guideme.appliedenergistics.org/authoring/).

## Ponder scenes

### Gradle

```gradle
repositories {
    maven { url = 'https://maven.createmod.net' }
}

dependencies {
    compileOnly "net.createmod.ponder:Ponder-NeoForge-1.21.1:${ponder_version}"
    compileOnly "nadiendev.ultimateponderadditions:Ultimate Ponder Additions:${upa_version}"
}
```

Neither needs to be present at runtime for your mod to load. Declare it optional in
`neoforge.mods.toml`:

```toml
[[dependencies."mymod"]]
modId = "ultimateponderadditions"
type = "optional"
versionRange = "[0,)"
ordering = "AFTER"
side = "CLIENT"
```

Open version range on purpose. Modded version strings are a mess and a lower bound on an optional
dependency is a good way to make somebody's game refuse to start.

### The addon class

```java
package mymod.ponder;

import nadiendev.ultimateponderadditions.api.PonderAddon;
import nadiendev.ultimateponderadditions.api.SceneRegistration;
import nadiendev.ultimateponderadditions.api.UPAAddon;

@UPAAddon
public class MyModPonderAddon implements PonderAddon {

    @Override
    public String id() {
        return "mymod";
    }

    @Override
    public void registerScenes(SceneRegistration reg) {
        reg.scene("mymod:pulverizer", "mymod/pulverizer", MyScenes::pulverizer)
           .highlightAllTags();
    }
}
```

That is the whole registration story. Every mod jar gets scanned for `@UPAAddon` while Ultimate
Ponder Additions is constructing itself, so there is no call to place and no load order to worry
about. The class needs a public no-arg constructor.

When Ultimate Ponder Additions is not installed the class is never loaded, which is why it is safe
for the annotation and the interface to name its types.

### What you can override

| Member | Default | Notes |
| --- | --- | --- |
| `id()` | required | Must be unique. Players use it in the `disabledAddons` config list |
| `namespace()` | `id()` | Namespace for translation keys and for schematic paths given as strings |
| `requiredMods()` | `[id()]` | All of them must be loaded or the addon contributes nothing |
| `priority()` | `1000` | Lower goes first, which is also the order in the Ponder index |
| `registerScenes(SceneRegistration)` | required | |
| `registerTags(TagRegistration)` | no-op | Categories on the Ponder index screen |
| `registerSharedText(SharedTextRegistrationHelper)` | no-op | Captions reused across scenes |
| `excludeFromIndex(IndexExclusionHelper)` | no-op | Hide item variants from the index |
| `schematics()` | empty | See [Structures](#structures) |

Since `namespace()` defaults to your mod id, your translation keys end up as
`mymod.ponder.<sceneId>.header` and your schematics are read from `assets/mymod/ponder/`. Nothing of
yours lands in this mod's namespace.

### Registering by hand

If your addon needs constructor arguments, drop the annotation and do it yourself:

```java
UltimatePonderAdditionsApi.register(new MyModPonderAddon(myRegistry));
```

Anywhere before `FMLLoadCompleteEvent` is fine, since that is when Ponder collects scenes. A mod
constructor is the obvious place.

## Writing a scene

A scene is a `PonderStoryBoard`, which is `(SceneBuilder scene, SceneBuildingUtil util) -> void`.
This is Ponder's API and none of it is wrapped. Create's own scenes are the best reference for what
is possible.

```java
public static void pulverizer(SceneBuilder scene, SceneBuildingUtil util) {
    ScenePresets.intro(scene, util, "mymod_pulverizer", "The Pulverizer");

    ScenePresets.say(scene, 4, "The Pulverizer grinds ore into dust.");

    ScenePresets.input(scene, util, 4, "Ore goes in the top.", 2, 2, 2);
    ScenePresets.output(scene, util, 4, "Dust comes out of the front.", 2, 1, 2);

    ScenePresets.needsPower(scene, util, 2, 1, 2, "It runs on Forge Energy.");

    ScenePresets.outro(scene, 5, "Two dust per ore, and it is not fussy about which ore.");
}
```

`ScenePresets` is a thin layer over `SceneBuilder` covering the beats every machine scene repeats.
Ignore it and call `scene.overlay()`, `scene.world()`, `scene.effects()` and `scene.special()`
directly if you would rather.

| Preset | |
| --- | --- |
| `intro(scene, util, sceneId, title[, baseSize])` | Names the scene, fades the base plate in, reveals what is above it |
| `say(scene, seconds, text)` | Caption, then wait |
| `sayAt(scene, util, seconds, text, x, y, z)` | Caption anchored to a block |
| `highlight(scene, seconds, selection, palette, text)` | Outline a region while a caption is up |
| `input` / `output(scene, util, seconds, text, x, y, z)` | `highlight` for one block, in the input/output colour |
| `needsPower(scene, util, x, y, z, text)` | Redstone flash and a red caption |
| `dropItemOnto(scene, util, itemId, x, y, z)` | Drop an item on a block. Skipped if the id is unknown |
| `swap(scene, x, y, z, state)` | Replace a block mid-scene, with particles |
| `focus(scene, util, x, y, z)` | Move the camera's point of interest |
| `outro(scene, seconds, text)` | Last caption, and marks the scene finished |

### Other mods' blocks

`RegistryLookup` resolves ids at runtime and falls back to air rather than throwing:

```java
BlockState state = RegistryLookup.state("mymod:pulverizer[facing=north,lit=true]");
ItemStack   ore   = RegistryLookup.stack("minecraft:raw_iron", 4);
boolean     have  = RegistryLookup.blockExists("thermal:machine_pulverizer");
```

Blockstate properties that do not exist get skipped instead of failing, so a scene survives the
update that renames one. This is how the bundled integrations document Industrial Foregoing and AE2
without compiling against either.

### Two traps

**Caption order is part of the key.** Ponder numbers text entries as it creates them (`text_1`,
`text_2`, ...). Inserting a caption in the middle of a released scene renumbers everything after it
and orphans those translations. Add new lines at the end.

**`sceneId` is permanent.** It prefixes every key the scene generates. Renaming it throws away every
translation for that scene.

## Structures

Every scene needs a structure file. Save one with a structure block and ship the `.nbt`, or describe
it in code and let data generation write it.

```java
public static final SchematicTemplate PULVERIZER = SchematicTemplate
        .builder("mymod/pulverizer", 5, 4, 5)
        .basePlate("minecraft:stone_bricks")
        .set(2, 1, 2, "mymod:pulverizer[facing=north]")
        .set(2, 2, 2, "minecraft:hopper[facing=down,enabled=true]")
        .fill(1, 1, 0, 3, 1, 0, "minecraft:iron_block")
        .build();
```

Return it from `schematics()` and `SchematicProvider` writes two files:

- `assets/<namespace>/ponder/mymod/pulverizer.nbt`, gzipped structure NBT, which is what Ponder loads
- `assets/<namespace>/guides/ultimateponderadditions/guide/assets/mymod/pulverizer.snbt`, the same
  thing as text, for `<ImportStructure />` and for readable diffs

Blocks are described as strings and never as `BlockState` objects. That is what lets the generator
run with none of the target mods installed.

Builder methods are `set`, `fill`, `layer`, `basePlate`, `column` and `outline`, plus a `set`
overload that takes block entity data as SNBT. Layer `y = 0` is the base plate Ponder fades in
first, so put the ground there and start the machine at `y = 1`.

To generate them in your own project, add the provider to your `GatherDataEvent`:

```java
generator.addProvider(event.includeClient(), new SchematicProvider(generator.getPackOutput()));
```

## Translations

Ponder keeps the English strings you passed to `scene.title(..)` and `.text(..)` and hands them back
keyed the way it will look them up. Generate the lang file from that instead of writing keys by
hand:

```java
public class MyLangProvider extends LanguageProvider {

    @Override
    protected void addTranslations() {
        PonderIndex.getLangAccess().provideLang("mymod", this::add);
    }
}
```

For other locales, keep a `Map<String, String>` from key to translated string and register a second
provider for it. `UPALang` and `SpanishLang` in this repo do exactly that, and they diff the table
against the generated key set on every run so a scene edit that outdates a translation shows up in
the log instead of silently shipping.

## Guidebook extensions

Only needed for custom markdown tags, custom indices or custom recipe renderers. Everything else is
covered by dropping markdown in the folder.

```java
@UPAAddon(requiredMods = {"mymod", "guideme"})
public class MyModGuideAddon implements GuideAddon {

    @Override
    public String id() {
        return "mymod";
    }

    @Override
    public void configureGuide(GuideBuilder builder) {
        builder.extension(ExtensionPoint.TAG_COMPILERS, new MyTagCompiler());
    }
}
```

`configureGuide` runs once on the client, right before the guide is built. Do not call `build()`.
One class can implement both `PonderAddon` and `GuideAddon`.

List `guideme` in `requiredMods`. The annotation is read from scan data, so the class never gets
loaded when GuideME is missing.

## Testing

`gradlew runData` writes structures and `en_us.json` into `src/generated/resources`.

`gradlew runClient`, then hover one of your blocks and hold the Ponder key.

Ponder's editing mode (in its client config) reloads scenes without a restart and shows the raw
English strings, which makes a missing translation obvious immediately.

The guidebook hot-reloads its markdown when the guide's `sources` system property points at your
source tree. This repo's `runClient` sets it up for its own pages; the same two properties work for
yours:

```
-Dguideme.ultimateponderadditions.guide.sources=<path to your guide folder>
-Dguideme.ultimateponderadditions.guide.sourcesNamespace=ultimateponderadditions
```

## Class reference

| Class | |
| --- | --- |
| `api.UPAAddon` | Annotation that makes a class discoverable |
| `api.PonderAddon` | A bundle of Ponder scenes |
| `api.SceneRegistration` | Passed to `registerScenes` |
| `api.TagRegistration` | Passed to `registerTags` |
| `api.UltimatePonderAdditionsApi` | Manual registration, guide id, addon queries |
| `api.guide.GuideAddon` | Guidebook customisation |
| `api.scene.ScenePresets` | Reusable scene fragments |
| `api.schematic.SchematicTemplate` | Structures described in code |
| `api.util.RegistryLookup` | Registry lookups that fall back to air |
