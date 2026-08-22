---
navigation:
  parent: ex-deorum/index.md
  title: Barrel
  position: 10
  icon: exdeorum:oak_barrel
item_ids:
  - exdeorum:oak_barrel
  - exdeorum:stone_barrel
---

# Barrel

Where dirt comes from, and where most of your fluids come from.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="../assets/exdeorum/barrel.snbt" />
  <BlockAnnotation x="3" y="1" z="2" color="#8cba51">Stone Barrel</BlockAnnotation>
</GameScene>

It does three separate jobs depending on what you put in it.

**Compost.** Throw organic matter in and it fills a bar. When the bar is full you get a block of
dirt.

**Mixing.** Fill it with a fluid, drop the right item in, and the fluid becomes something else.

**Fluid mixing.** Two fluids meeting in a barrel give a third. Water plus lava gives stone.

Witch Water comes from this, and it spawns considerably worse things than water does.

Stone Barrels behave the same but will not burn when you put lava in them. A barrel left open to
the sky slowly fills with rain, which is the free water you start the game with.
