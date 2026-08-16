---
navigation:
  parent: modern-chickens/index.md
  title: Incubator
  position: 70
  icon: chickens:incubator
item_ids:
  - chickens:incubator
---

# Incubator

Uses RF to convert Modern Chickens spawn eggs into portable chicken items over a 200-tick operation.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/incubator.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">Incubator</BlockAnnotation>
</GameScene>

Chicken *items* are what the Roost, Breeder and Nest all accept, and this is what produces them, so
in practice everything starts here.

It runs on RF. There is no heat mechanic, so no lava or fire is involved.

Eggs made by the [Avian Dousing Machine](avian-dousing-machine.md) go straight in here.
