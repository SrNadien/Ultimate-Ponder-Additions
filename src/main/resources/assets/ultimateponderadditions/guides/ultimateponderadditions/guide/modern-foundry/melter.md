---
navigation:
  parent: modern-foundry/index.md
  title: Seared Melter
  position: 10
  icon: modernfoundry:seared_melter
item_ids:
  - modernfoundry:seared_melter
  - modernfoundry:seared_heater
---

# Seared Melter

The small one you build before the real Smeltery. It melts a single thing at a time.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/modernfoundry/melter.snbt" />
  <BlockAnnotation x="2" y="2" z="2" color="#7fcde0">Seared Melter</BlockAnnotation>
  <BlockAnnotation x="2" y="1" z="2" color="#ff5d6c">Seared Heater</BlockAnnotation>
</GameScene>

The melter's own tooltip says it plainly: *place above a tank or heater to fuel*. It does not take
fuel directly, it takes heat from whatever is underneath.

| Block | Job |
|---|---|
| Seared Melter | Melts one item at a time into its internal tank |
| Seared Heater | Burns solid fuel underneath the melter |
| Seared Faucet | Pours the melt out of the side |
| Casting Basin | Casts blocks |
| Casting Table | Casts ingots and tool parts |

That is the whole starting kit: melter, heater, faucet, basin and table. Once you have it, you can
cast the copper you need for a Smeltery Controller.
