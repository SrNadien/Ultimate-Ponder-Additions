---
navigation:
  parent: ex-deorum/index.md
  title: Automating it
  position: 50
  icon: exdeorum:mechanical_sieve
item_ids:
  - exdeorum:mechanical_hammer
  - exdeorum:mechanical_sieve
---

# Automating it

Clicking sieves by hand gets old fast. Both jobs have a powered version.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/exdeorum/mechanical.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#7fcde0">Mechanical Hammer</BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2" color="#ddc166">Mechanical Sieve</BlockAnnotation>
</GameScene>

Both run on Forge Energy and both have separate input and output sides, so hoppers and pipes chain
them together without any fiddling.

Cobblegen into hammer into sieve into furnace is the entire skyblock loop, hands-free.
