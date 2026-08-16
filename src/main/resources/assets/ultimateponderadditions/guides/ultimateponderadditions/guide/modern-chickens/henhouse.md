---
navigation:
  parent: modern-chickens/index.md
  title: Henhouse
  position: 80
  icon: chickens:henhouse
item_ids:
  - chickens:henhouse
  - chickens:henhouse_spruce
  - chickens:henhouse_birch
  - chickens:henhouse_jungle
  - chickens:henhouse_acacia
  - chickens:henhouse_dark_oak
---

# Henhouse

Receives nearby chicken drops into a 3x3 output inventory.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/henhouse.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">Henhouse</BlockAnnotation>
</GameScene>

This is the option for chickens left loose as entities, rather than kept as items in a Roost.

It runs on FE or on hay as fuel. Burning hay can leave dirt behind as a byproduct.

Variants exist for oak, spruce, birch, jungle, acacia and dark oak, so it can match whatever the coop
is built from.
