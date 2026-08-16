---
navigation:
  parent: modern-chickens/index.md
  title: Mechanical Roost
  position: 50
  icon: chickens:mechanical_roost
item_ids:
  - chickens:mechanical_roost
---

# Mechanical Roost

An RF-powered roost with four independent chicken rows and separate output storage for each row.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/roost.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#5f6caf">Mechanical Roost</BlockAnnotation>
</GameScene>

Four rows means four chicken types in one block, each with its own output, instead of four separate
[Roosts](roost.md). It needs power, and it still benefits from a nest aura.
