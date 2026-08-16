---
navigation:
  parent: modern-chickens/index.md
  title: Chicken Breeder
  position: 30
  icon: chickens:breeder
item_ids:
  - chickens:breeder
---

# Chicken Breeder

Combines two non-rooster chicken items and seeds to produce offspring according to the breeding
system.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/breeder.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#7fcde0">Chicken Breeder</BlockAnnotation>
</GameScene>

Both parents must be ordinary chickens. Roosters are rejected; they belong in a [Nest](nest.md).

Which type comes out follows the breeding tree, so an Iron Chicken and a Flint Chicken give a Gold
Chicken. Use an Analyzer on a chicken first to read its stats and decide what is worth pairing.
