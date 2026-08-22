---
navigation:
  parent: modern-foundry/index.md
  title: Casting
  position: 30
  icon: modernfoundry:seared_faucet
item_ids:
  - modernfoundry:seared_faucet
  - modernfoundry:seared_basin
  - modernfoundry:seared_table
  - modernfoundry:seared_channel
---

# Casting

Molten metal is useless until you pour it into something.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/modernfoundry/casting.snbt" />
  <BlockAnnotation x="2" y="1" z="1" color="#ddc166">Casting Basin</BlockAnnotation>
  <BlockAnnotation x="2" y="1" z="3" color="#8cba51">Casting Table</BlockAnnotation>
</GameScene>

A Faucet pulls from a tank, a drain or the Smeltery itself, and right-clicking it starts the pour.

**Casting Basin** makes blocks. **Casting Table** makes ingots and tool parts, using a cast as the
mould. Both tooltips say the same thing: *cast items using molten metals from a Smeltery*.

Channels carry the pour further along, so one faucet can keep a whole row of tables fed.

Feed a faucet redstone and it keeps pouring on its own, which is the step that turns casting from a
chore into a production line.
