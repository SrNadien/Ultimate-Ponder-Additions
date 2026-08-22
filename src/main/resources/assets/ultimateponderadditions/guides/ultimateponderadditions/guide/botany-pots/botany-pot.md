---
navigation:
  parent: botany-pots/index.md
  title: Botany Pot
  position: 10
  icon: botanypots:terracotta_botany_pot
item_ids:
  - botanypots:terracotta_botany_pot
---

# Botany Pot

The plain one. It grows, but it will not pick anything up for you.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="../assets/botanypots/pots.snbt" />
  <BlockAnnotation x="1" y="2" z="2" color="#8cba51">Botany Pot</BlockAnnotation>
</GameScene>

Soil goes in first, then the crop. Both are just items you drop in.

The soil decides what is allowed to grow and how quickly. The same crop in better soil finishes
sooner, so the soil is the upgrade path.

When the crop is done, break it out of the pot by hand.

Pots come in terracotta, concrete, glazed terracotta and most bricks. Sixty-odd materials, all
behaving identically, so pick whichever matches the build.
