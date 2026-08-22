---
navigation:
  parent: modern-foundry/index.md
  title: The Smeltery
  position: 20
  icon: modernfoundry:smeltery_controller
item_ids:
  - modernfoundry:smeltery_controller
  - modernfoundry:seared_bricks
  - modernfoundry:seared_fuel_tank
  - modernfoundry:grout
---

# The Smeltery

Melts several stacks at once, and alloys metals together. This is the block that makes the mod worth
building.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/modernfoundry/smeltery.snbt" />
  <BlockAnnotation x="2" y="2" z="0" color="#7fcde0">Smeltery Controller</BlockAnnotation>
  <BlockAnnotation x="0" y="2" z="2" color="#ff5d6c">Seared Fuel Tank</BlockAnnotation>
  <BlockAnnotation x="4" y="2" z="2" color="#ddc166">Seared Drain</BlockAnnotation>
</GameScene>

Built from the bottom up:

1. A solid floor of seared blocks.
2. Walls around the outside. The inside stays hollow and has to stay empty.
3. The Controller in a wall, at the height of the first inner layer.
4. A Seared Fuel Tank in the wall, holding the lava that powers it.
5. A Seared Drain so molten metal can get in and out.

Taller walls hold more. The interior can grow as well, up to a cap.

If it refuses to form, the controller tells you exactly what is wrong: *invalid block in the walls*,
*invalid block in the floor*, *invalid block inside the structure*, or *structure inside is too
large*. Read the message before you start pulling bricks out.

Seared bricks come from Grout, which is the gravel, sand and clay mix you smelt.
