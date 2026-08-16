---
navigation:
  parent: industrial-foregoing/index.md
  title: Conveyors
  position: 50
  icon: industrialforegoing:conveyor
item_ids:
  - industrialforegoing:conveyor
  - industrialforegoing:block_placer
  - industrialforegoing:block_breaker
---

# Conveyors

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/industrialforegoing/conveyor.snbt" />
  <BoxAnnotation min="2 1 0" max="3 2 4" color="#0084ff">A belt into a chest</BoxAnnotation>
</GameScene>

| Block | What it does |
|---|---|
| Conveyor | Carries dropped items the way it faces, and inserts into any inventory it runs into |
| Block Placer | Places blocks from its inventory in front of itself |
| Block Breaker | Breaks the block in front and drops it |

Wrench right-click turns a belt, clicking the edge adds a ramp. Conveyor upgrades bolt onto the
sides and add extraction, insertion, splitting and detection.
