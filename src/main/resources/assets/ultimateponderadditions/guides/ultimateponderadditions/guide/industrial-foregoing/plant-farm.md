---
navigation:
  parent: industrial-foregoing/index.md
  title: Automated farm
  position: 10
  icon: industrialforegoing:plant_gatherer
item_ids:
  - industrialforegoing:plant_sower
  - industrialforegoing:plant_gatherer
  - industrialforegoing:plant_fertilizer
---

# Automated farm

The Plant Sower and Plant Gatherer are a pair. Both work the 3x3 in front of them.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/industrialforegoing/plant_farm.snbt" />
  <BoxAnnotation min="1 1 1" max="4 2 4" color="#8cba51">
    The worked area. A Range Addon in either machine grows it past 3x3.
  </BoxAnnotation>
</GameScene>

| Block | What it does |
|---|---|
| Plant Sower | Plants seeds from its inventory onto tilled soil in range |
| Plant Gatherer | Harvests the same area and pushes crops out of its back |
| Plant Fertilizer | Speeds up crop growth in range |

Till the plot yourself. The sower will not turn dirt into farmland for you.
