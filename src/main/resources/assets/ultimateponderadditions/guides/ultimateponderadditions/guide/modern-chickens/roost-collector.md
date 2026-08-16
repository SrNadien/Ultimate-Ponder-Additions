---
navigation:
  parent: modern-chickens/index.md
  title: Roost Collector
  position: 40
  icon: chickens:collector
item_ids:
  - chickens:collector
---

# Roost Collector

Automatically pulls finished output from nearby Roosts and Mechanical Roosts into its own storage
inventory.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/roost.snbt" />
  <BlockAnnotation x="2" y="1" z="4" color="#ddc166">Roost Collector</BlockAnnotation>
</GameScene>

One collector serves every roost in its range, so a wall of roosts needs a single drain point instead
of a pipe per block. Empty the collector with whatever you normally use.
