---
navigation:
  parent: industrial-foregoing/index.md
  title: Power
  position: 40
  icon: industrialforegoing:bioreactor
item_ids:
  - industrialforegoing:bioreactor
  - industrialforegoing:biofuel_generator
  - industrialforegoing:pitiful_generator
  - industrialforegoing:latex_processing_unit
  - industrialforegoing:sludge_refiner
---

# Power

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/industrialforegoing/power.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#7fcde0">Bioreactor</BlockAnnotation>
  <BlockAnnotation x="2" y="1" z="4" color="#ddc166">Biofuel Generator</BlockAnnotation>
</GameScene>

| Block | What it does |
|---|---|
| Pitiful Generator | Burns solid fuel. As good as the name suggests |
| Bioreactor | Turns plant matter into Biofuel. More distinct plant types means more per batch |
| Biofuel Generator | Burns Biofuel, at a much better rate |
| Latex Processing Unit | Taps trees for Latex, which becomes Tiny Dry Rubber and then Plastic |
| Sludge Refiner | Turns machine Sludge back into ores and blocks |

Feed the Bioreactor from a Plant Gatherer and the factory runs on its own farm.
