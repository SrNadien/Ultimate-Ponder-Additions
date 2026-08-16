---
navigation:
  parent: index.md
  title: Applied Energistics 2
  position: 40
item_ids:
  - ae2:inscriber
  - ae2:controller
  - ae2:drive
  - ae2:energy_acceptor
  - ae2:growth_accelerator
  - ae2:crafting_unit
  - ae2:crafting_accelerator
  - ae2:pattern_provider
  - ae2:molecular_assembler
  - ae2:charger
  - ae2:crank
  - ae2:vibration_chamber
---

# Applied Energistics 2

AE2 stores everything you own as data on cells, and crafts anything you have a pattern for. Getting
there means processors, power, and understanding channels.

> AE2 ships its own, far more thorough guidebook — also built on GuideME. These pages are the short
> version, paired with Ponder scenes.

## The Inscriber

Every AE2 machine is built out of processors, and processors come out of **Inscribers**.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/ae2/inscriber.snbt" />
  <BoxAnnotation min="1 1 2" max="4 2 3" color="#8cba51">
    Three inscribers in a row: two printing, one assembling.
  </BoxAnnotation>
  <BlockAnnotation x="2" y="1" z="0" color="#7fcde0">
    ME Energy Acceptor — turns Forge Energy into AE.
  </BlockAnnotation>
</GameScene>

Presses are not consumed. Find them in meteorites, or grind Sky Stone until one turns up. Once your
network has patterns for them, a **Pattern Provider** can drive the whole row.

## Growing Certus Quartz

Budding Certus Quartz grows crystal buds on its faces, exactly like amethyst. The block degrades a
tier each time a bud matures: Flawless → Flawed → Chipped → Damaged → plain quartz.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="assets/ae2/growth_accelerator.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#5f6caf">
    Budding block. Silk Touch is the only way to move it.
  </BlockAnnotation>
</GameScene>

**Crystal Growth Accelerators** touching the budding block speed it up dramatically. They need AE
power, and they only count when they actually touch.

## Your first ME Network

A network is power, storage, and cable joining them. Everything else is an extra.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/ae2/network.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#8cba51">
    ME Controller — hands out channels. Small networks can skip it.
  </BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2" color="#ddc166">
    ME Drive — holds the storage cells that are your actual disk space.
  </BlockAnnotation>
</GameScene>

Channels are the thing that catches people out. Every device that stores or moves items consumes
one. A plain cable carries eight; a dense cable carries thirty-two. Run out and devices go dark.

## Autocrafting

A **Crafting CPU** is any solid cube of crafting blocks attached to the network.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/ae2/crafting_cpu.snbt" />
  <BoxAnnotation min="1 1 1" max="3 3 3" color="#8cba51">
    The CPU. Crafting Storage sets how large a job it can plan.
  </BoxAnnotation>
  <BlockAnnotation x="4" y="1" z="2" color="#7fcde0">
    Pattern Provider — holds recipes, pushes ingredients into the machine behind it.
  </BlockAnnotation>
</GameScene>

Rules of thumb:

- No Crafting Storage in the cube, no crafting at all.
- Co-Processing Units let one CPU push several ingredients at once.
- One CPU runs one job. Several small CPUs beat one enormous one.
- A **Molecular Assembler** bolted to a provider handles plain crafting-table recipes.

## Power, on day one

Before you have a generator, the **Charger** still needs to run: bolt a **Crank** on top and turn it
by hand.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="assets/ae2/charger.snbt" />
  <BlockAnnotation x="2" y="2" z="2" color="#ff55ff">Crank — manual power.</BlockAnnotation>
  <BlockAnnotation x="0" y="1" z="2" color="#ff5d6c">Vibration Chamber — burns fuel for AE.</BlockAnnotation>
</GameScene>

The charger turns Certus Quartz into Charged Certus Quartz. Charged Certus plus Nether Quartz plus
Redstone, thrown into water, gives you Fluix — and Fluix is where the rest of the mod starts.
