---
navigation:
  parent: index.md
  title: Extending this guide
  position: 90
---

# Extending this guide

Ultimate Ponder Additions is a frame. Adding your own mod to it takes either no code at all, or
about thirty lines.

## Pages, with no code

GuideME reads pages from **every** resource pack and **every** namespace, as long as they sit in
this guide's folder. So a mod - or a plain resource pack, or a modpack - can add a chapter here by
shipping one file:

```
assets/<yourmod>/guides/ultimateponderadditions/guide/<yourmod>.md
```

```markdown
---
navigation:
  parent: index.md
  title: My Mod
  position: 50
---

# My Mod

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/mymod/pulverizer.snbt" />
</GameScene>
```

Structures go next to the page, under `.../guide/assets/`, as `.snbt` or `.nbt`. GuideME reads both.

To make an in-game structure into a file, stand in a creative world and use GuideME's structure
commands, or save it with a vanilla structure block.

## Ponder scenes, with a little code

A Ponder scene needs a storyboard, which means Java. The full walkthrough - annotation, addon
interface, scene helpers, data generation - is in `API.md` in the mod's repository. The short
version:

```java
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

Nothing else is required: the addon is found by scanning mod jars for the annotation, so there is no
registration call to place and no load order to get wrong. If Ultimate Ponder Additions is not
installed, the annotated class is simply never touched.
