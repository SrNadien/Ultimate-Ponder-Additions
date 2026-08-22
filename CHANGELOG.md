# Changelog

The top section is what goes in the CurseForge file upload box. The rest is the project page history.

---

## 1.4.0

Guidebook chapters for the mods that only had Ponder scenes.

**Added**

- **Ex Deorum** chapter: Barrel, Crucible, Sieve, hammers and crooks, and the mechanical versions of
  both. Five pages, each with its setup embedded as a 3D scene.
- **Botany Pots** chapter: the plain, hopper and waxed pots, and what actually separates them.
- Both chapters get sidebar icons and `item_ids`, so holding the guide key over a block opens the
  right page.

The book is now 42 pages across six chapters.

**Changed**

- The index explains why Applied Energistics 2 and the Custom category have scenes but no chapter.
  AE2 ships its own GuideME book; the Custom scenes are hand-built setups, not mod documentation.

---

## 1.3.0

**Added**

- **Ex Deorum** support: five scenes covering the Barrel, the Crucible, the Sieve, hammers and
  crooks, and the Mechanical Hammer and Sieve. Registered across all 36 wood variants of each block
  plus the porcelain crucible and stone barrel.

Scene text was written from the mod's own recipe categories and advancements rather than from
memory, so the details match what the mod actually does: the crucible's heat source sets the *melt
rate* and not just whether it runs, and silkworms are what unlock the sieve by way of string.

---

## 1.2.0

**Added**

- **Botany Pots** support: three scenes for the plain, hopper and waxed pots, registered across all
  61 pot materials.

The waxed pot description comes straight from the mod's `PotType` enum. It is purely decorative:
always renders its crop fully grown, never ticks, no drops. Worth knowing before you build a farm
out of them.

---

## 1.1.1

**Added**

- Industrial Turbine scene for Mekanism, in the Custom category.

**Fixed**

- The turbine scene no longer claims a five coil limit. There is no such cap in Mekanism's
  validator; the actual rule is that every coil has to touch the Rotational Complex or another coil.

---

## 1.1.0

**Added**

- **Custom** category: 16 hand-built setups ported from KubeJS to Java. AE2 controller, crafting
  cube and assembler bank; Create andesite casing and lumber farm; Industrial Foregoing laser drill
  and stasis chamber; the Pylons Harvester Pylon; and the Mekanism fission reactor, fusion reactor,
  induction matrix and SPS.
- Each scene appears only when the mod it documents is installed, so the category adapts to the
  pack it is in.

**Fixed**

- Scenes gated behind a mod check produced no translation keys during data generation, because none
  of those mods are present when data generation runs. In game they would have shown raw keys
  instead of text. All 89 captions now generate correctly.

---

## 1.0.3

**Fixed**

- The guidebook was empty outside the development environment. GuideME decides which guides to load
  pages for at the *start* of a resource reload, and the guide was being built afterwards, during
  client setup. It is now built in the mod constructor, which is what GuideME's own documentation
  says to do. Opening the book showed "Page could not be found" before this.
- A dead link in the guide index.

---

## 1.0.2

**Changed**

- **Ponder is now optional.** With only GuideME installed the mod loads normally and the guidebook
  works; you just get no scenes. Previously it refused to start.

---

## 1.0.1

**Fixed**

- The mod refused to load alongside Industrial Foregoing. Its version reads `1.21-3.6.39`, and that
  Minecraft version prefix sorts below any sane lower bound, so the dependency check rejected a mod
  that was sitting right there. Every optional dependency now uses an open range.
- The mod description in the mod list read "Processes main resources."

---

## 1.0.0

First release.

**Added**

- Ponder scenes for **Industrial Foregoing**, **Functional Storage**, **Modern Chickens** and
  **Applied Energistics 2**, registered against roughly ninety blocks.
- A GuideME guidebook covering the first three, one page per machine, with the same structures
  embedded as interactive 3D scenes.
- An addon API. Guidebook pages need no code at all: drop markdown into
  `assets/<yourmod>/guides/ultimateponderadditions/guide/` and it appears, from a mod or from a
  plain resource pack. Ponder scenes take one annotated class and about thirty lines.
- English and Spanish.

**Notes**

None of the documented mods is a compile dependency. Everything is written against registry ids, so
those mods can update, rename or remove a machine and the worst case is that the machine loses its
scene.
