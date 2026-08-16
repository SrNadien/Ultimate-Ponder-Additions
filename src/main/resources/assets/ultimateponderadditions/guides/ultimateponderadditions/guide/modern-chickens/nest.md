---
navigation:
  parent: modern-chickens/index.md
  title: Nest
  position: 20
  icon: chickens:nest
item_ids:
  - chickens:nest
---

# Nest

Holds a rooster item and seeds. It consumes the seeds to create a timed aura that boosts nearby
Roosts.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/chickens/breeder.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#8cba51">Nest</BlockAnnotation>
</GameScene>

It produces no items itself. The only thing it makes is the aura, so judge it by how many Roosts sit
inside its range rather than by what comes out of it.

Roosters go here. They are not valid breeding parents, so this is what they are for.
