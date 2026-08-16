---
navigation:
  parent: modern-chickens/index.md
  title: Avian Flux Converter
  position: 100
  icon: chickens:avian_flux_converter
item_ids:
  - chickens:avian_flux_converter
---

# Avian Flux Converter

Drains energy from Flux Eggs into an internal FE/RF buffer and exports it to adjacent energy
machines.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/roost_generator.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#ddc166">Avian Flux Converter</BlockAnnotation>
</GameScene>

Feed it Flux Eggs from a Roost and it becomes a power source. This is the egg-driven route; the
[Roost Generator](roost-generator.md) is the one that takes the chickens directly.
