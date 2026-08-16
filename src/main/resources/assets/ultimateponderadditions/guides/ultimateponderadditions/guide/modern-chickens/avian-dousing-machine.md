---
navigation:
  parent: modern-chickens/index.md
  title: Avian Dousing Machine
  position: 130
  icon: chickens:avian_dousing_machine
item_ids:
  - chickens:avian_dousing_machine
---

# Avian Dousing Machine

Uses an eligible chicken, stored item/fluid/chemical reagents, and RF to create specialized chicken
spawn eggs. It includes the Dragon and Wither infusion paths.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/roost_generator.snbt" />
  <BlockAnnotation x="2" y="1" z="0" color="#ff5d6c">Avian Dousing Machine</BlockAnnotation>
</GameScene>

Three things go in: a chicken that qualifies, the reagent the recipe wants, and power. What comes out
is a spawn egg, which then goes to the [Incubator](incubator.md) to become a usable chicken item.

The Dragon and Wither paths are how the late-game chickens get made.
