---
navigation:
  parent: index.md
  title: Modern Chickens
  position: 30
item_ids:
  - chickens:roost
  - chickens:mechanical_roost
  - chickens:collector
  - chickens:breeder
  - chickens:nest
  - chickens:mechanical_nest
  - chickens:henhouse
  - chickens:incubator
  - chickens:roost_generator
---

# Modern Chickens

Every chicken type lays a resource instead of an egg. Getting the type you want is a breeding
problem; getting it in bulk is a housing problem.

## The Roost

A **Roost** holds up to sixteen chickens of one type and collects what they lay, without any of them
wandering off.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/chickens/roost.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">
    Roost — up to sixteen chickens of one type.
  </BlockAnnotation>
  <BlockAnnotation x="2" y="1" z="4" color="#ddc166">
    Collector — empties the roost automatically.
  </BlockAnnotation>
</GameScene>

The **Mechanical Roost** is the powered version: faster, and it takes speed and stack upgrades.

Three stats decide a chicken's worth:

| Stat | Effect |
|---|---|
| Gain | How much it drops per lay |
| Growth | How fast a chick matures |
| Strength | How often it lays |

All three cap at ten, and all three are inherited — which is what breeding is for.

## Breeding

New chicken types come out of a **Breeder**: two parents, some seeds, and a recipe. An Iron Chicken
plus a Flint Chicken gives a Gold Chicken, and so on up the tree.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/chickens/breeder.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#7fcde0">Breeder.</BlockAnnotation>
  <BlockAnnotation x="1" y="1" z="2" color="#8cba51">
    Nest — spawns in the world, holds the first chicken of a wild type.
  </BlockAnnotation>
</GameScene>

Use an **Analyzer** on a chicken to read its stats before deciding what to pair. Breeding two
high-stat parents is how you push a line towards the cap.

## The Henhouse

For chickens roaming loose, the **Henhouse** picks up after them across the surrounding chunk.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/chickens/henhouse.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">
    Henhouse — collects anything dropped nearby.
  </BlockAnnotation>
</GameScene>

Feed it hay bales and it converts them to dirt, buying itself a good deal more collection. Cheap and
early-game; once you have power, a roost with a collector outpaces it easily. There is a variant for
every wood type.

## The Incubator

Coloured Eggs hatch into the chicken painted on them, in an **Incubator**. No power — only heat,
from lava or fire around it.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/chickens/incubator.snbt" />
  <BoxAnnotation min="1 1 2" max="4 2 3" color="#ff5d6c">
    Heat sources. More heat, faster hatching.
  </BoxAnnotation>
</GameScene>

Chickens hatched this way keep the stats stored on the egg, so a good egg is worth saving.

## Power from chickens

The **Roost Generator** burns a chicken's output back into Forge Energy, and the Avian converters
scale that idea up.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/chickens/roost_generator.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">Roost Generator.</BlockAnnotation>
  <BlockAnnotation x="1" y="1" z="2" color="#ddc166">Avian Flux Converter — output to energy.</BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2" color="#5f6caf">Avian Fluid Converter — output to fluids.</BlockAnnotation>
</GameScene>

RF upgrades in the generator raise output, efficiency and buffer size. A wall of roosts feeding
converters is a perfectly serious mid-game power plant.
