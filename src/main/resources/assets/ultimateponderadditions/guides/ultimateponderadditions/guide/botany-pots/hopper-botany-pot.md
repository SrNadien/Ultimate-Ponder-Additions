---
navigation:
  parent: botany-pots/index.md
  title: Hopper Botany Pot
  position: 20
  icon: botanypots:terracotta_hopper_botany_pot
item_ids:
  - botanypots:terracotta_hopper_botany_pot
---

# Hopper Botany Pot

Same pot, except it harvests itself.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="../assets/botanypots/pots.snbt" />
  <BlockAnnotation x="2" y="2" z="2" color="#8cba51">Hopper Botany Pot</BlockAnnotation>
  <BlockAnnotation x="2" y="1" z="2" color="#ddc166">Anything that takes items</BlockAnnotation>
</GameScene>

When the crop finishes, the pot pushes the drops into whatever sits below it. A chest, a hopper, a
pipe, a drawer controller: it does not care.

That is the whole difference. Same soils, same crops, same growth speed.

A wall of hopper pots over a row of chests is a farm with no moving parts and nothing to click.
