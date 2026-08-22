---
navigation:
  parent: ex-deorum/index.md
  title: Crucible
  position: 20
  icon: exdeorum:porcelain_crucible
item_ids:
  - exdeorum:oak_crucible
  - exdeorum:porcelain_crucible
  - exdeorum:unfired_porcelain_crucible
---

# Crucible

Melts solids into fluid. Which crucible you use decides what it can melt.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="../assets/exdeorum/crucible.snbt" />
  <BlockAnnotation x="1" y="2" z="2" color="#8cba51">Wooden Crucible</BlockAnnotation>
  <BlockAnnotation x="3" y="2" z="2" color="#ff5d6c">Porcelain Crucible</BlockAnnotation>
</GameScene>

| Crucible | Melts | Into |
|---|---|---|
| Wooden | Leaves, saplings, wood | Water |
| Porcelain | Stone | Lava |

Both need a heat source underneath, and the heat source sets the *rate*, not just whether it runs.
The game shows this as a melt-rate multiplier: a torch is slow, lava and magma are much faster.
Upgrading what sits below a crucible is a real speed increase.

Porcelain is fired clay. Craft the unfired crucible first, then smelt it.
