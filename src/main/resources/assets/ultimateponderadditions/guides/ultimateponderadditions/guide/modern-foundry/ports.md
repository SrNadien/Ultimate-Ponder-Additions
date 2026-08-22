---
navigation:
  parent: modern-foundry/index.md
  title: Drains, Ducts and Chutes
  position: 40
  icon: modernfoundry:seared_drain
item_ids:
  - modernfoundry:seared_drain
  - modernfoundry:seared_duct
  - modernfoundry:seared_chute
---

# Drains, Ducts and Chutes

Three blocks move things through a Smeltery wall. They look similar and do different jobs.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="../assets/modernfoundry/ports.snbt" />
  <BlockAnnotation x="1" y="2" z="2" color="#7fcde0">Seared Drain</BlockAnnotation>
  <BlockAnnotation x="2" y="2" z="2" color="#5f6caf">Seared Duct</BlockAnnotation>
  <BlockAnnotation x="3" y="2" z="2" color="#ddc166">Seared Chute</BlockAnnotation>
</GameScene>

| Block | Moves |
|---|---|
| Seared Drain | Fluid, both directions |
| Seared Duct | Fluid, but only the one its filter is set to |
| Seared Chute | Items: ore in, leftovers out |

All three count as wall blocks, so they replace a brick rather than sitting next to one. Hoppers and
pipes talk to them normally, and that is how a Smeltery ends up automated.
