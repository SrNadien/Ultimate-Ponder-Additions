---
navigation:
  parent: modern-chickens/index.md
  title: Roost
  position: 10
  icon: chickens:roost
item_ids:
  - chickens:roost
---

# Roost

Holds chicken items and periodically produces their configured drops into internal output slots.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/roost.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">Roost</BlockAnnotation>
</GameScene>

Production scales with the chickens inside and with what is helping them:

- Speed and Stack upgrades placed in the roost
- a [Nest](nest.md) or [Mechanical Nest](mechanical-nest.md) aura reaching it

Output sits in the roost until something takes it. A [Roost Collector](roost-collector.md) does that
for you.
