---
navigation:
  parent: index.md
  title: Industrial Foregoing
  position: 10
item_ids:
  - industrialforegoing:plant_gatherer
  - industrialforegoing:plant_sower
  - industrialforegoing:plant_fertilizer
  - industrialforegoing:mob_crusher
  - industrialforegoing:mob_duplicator
  - industrialforegoing:mob_slaughter_factory
  - industrialforegoing:ore_laser_base
  - industrialforegoing:laser_drill
  - industrialforegoing:bioreactor
  - industrialforegoing:biofuel_generator
  - industrialforegoing:pitiful_generator
  - industrialforegoing:latex_processing_unit
  - industrialforegoing:sludge_refiner
  - industrialforegoing:conveyor
  - industrialforegoing:block_placer
  - industrialforegoing:block_breaker
---

# Industrial Foregoing

Industrial Foregoing is a mod of single-purpose machines. Each one does one job, takes Forge Energy,
and is happy to be left alone. The trick to it is knowing which machines feed which.

Everything below has a matching Ponder scene: hold **W** over the block in your inventory.

## Automating a farm

The **Plant Sower** and the **Plant Gatherer** are a pair. The sower plants seeds from its inventory
onto tilled soil in the 3x3 in front of it; the gatherer harvests the same shape and pushes the
crops out of its back.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/industrialforegoing/plant_farm.snbt" />
  <BoxAnnotation min="1 1 1" max="4 2 4" color="#8cba51">
    The worked area. A Range Addon in either machine grows it past 3x3.
  </BoxAnnotation>
</GameScene>

Till the plot yourself before switching the sower on — it will not turn dirt into farmland for you.
Point the gatherer's output at any inventory, drop a **Plant Fertilizer** next to the plot, and the
farm runs unattended forever.

## Farming mobs

The **Mob Duplicator** spawns copies of a mob you captured with a Mob Imprisonment Tool, paying for
each one in Essence. The **Mob Crusher** kills whatever wanders into its range and gives Essence
back — more than the duplicator spent, which is what makes the loop self-sustaining.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/industrialforegoing/mob_farm.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#7fcde0">
    Mob Duplicator — needs Essence and an imprisoned mob.
  </BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2" color="#ddc166">
    Mob Crusher — kills, and returns Essence plus drops.
  </BlockAnnotation>
</GameScene>

Keep a tank on the Essence line and a barrel on the drops, and the farm never backs up. If you would
rather have Liquid Meat and Pink Slime than drops and experience, swap the crusher for a **Mob
Slaughter Factory**.

## Mining without a mine

The **Ore Laser Base** produces ore out of nothing. On its own it is glacial; every **Laser Drill**
aimed at it makes it faster, up to twelve of them.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/industrialforegoing/laser_drill.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">
    Ore Laser Base. Which ores it can produce depends on the dimension.
  </BlockAnnotation>
</GameScene>

Put a **Laser Lens** in a drill to bias its colour, and the base weights its output towards ores
matching that colour. A **Fluid Laser Base** does the same trick for fluids.

Storage for all of this is not Industrial Foregoing's job any more — the Black Hole Units moved out
into the separate *Industrial Black Holes and Tanks* mod. Drawers, barrels or an ME network all work
just as well.

## Powering the factory

Everything above burns Forge Energy, so the first thing to build is a source of it. The **Pitiful
Generator** burns solid fuel and is exactly as good as its name suggests; the real answer is the
**Bioreactor** feeding a **Biofuel Generator**.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/industrialforegoing/power.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#7fcde0">
    Bioreactor — plant matter in, Biofuel out.
  </BlockAnnotation>
  <BlockAnnotation x="2" y="1" z="4" color="#ddc166">
    Biofuel Generator — burns it, in a different league to the Pitiful.
  </BlockAnnotation>
</GameScene>

The Bioreactor wants *variety*: the more distinct plant types sitting in its inventory, the more
Biofuel per batch. Feed it from a Plant Gatherer and the factory runs on its own farm.

Two more machines round the loop out. The **Latex Processing Unit** taps trees for Latex, which
becomes Tiny Dry Rubber and then Plastic — the material half of everything you will build. The
**Sludge Refiner** turns the Sludge that machines produce back into ores and blocks.

## Moving items around

**Conveyors** carry dropped items along whichever way they face, and insert into any inventory they
run into. Right-click with a wrench to turn one; click its edge to add a ramp.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/industrialforegoing/conveyor.snbt" />
  <BoxAnnotation min="2 1 0" max="3 2 4" color="#0084ff">
    A belt running into a chest.
  </BoxAnnotation>
</GameScene>

Conveyor upgrades bolt onto the sides of a belt and add extraction, insertion, splitting and
detection. The **Block Placer** and **Block Breaker** flanking the belt are the usual way to feed
one and empty it again.
