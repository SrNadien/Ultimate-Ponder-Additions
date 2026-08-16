---
navigation:
  parent: industrial-foregoing/index.md
  title: Mob farm
  position: 20
  icon: industrialforegoing:mob_crusher
item_ids:
  - industrialforegoing:mob_duplicator
  - industrialforegoing:mob_crusher
  - industrialforegoing:mob_slaughter_factory
---

# Mob farm

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/industrialforegoing/mob_farm.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#7fcde0">Mob Duplicator</BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2" color="#ddc166">Mob Crusher</BlockAnnotation>
</GameScene>

| Block | What it does |
|---|---|
| Mob Duplicator | Spawns copies of a mob captured with a Mob Imprisonment Tool, paying Essence per spawn |
| Mob Crusher | Kills mobs in range, returns Essence and their drops |
| Mob Slaughter Factory | Kills mobs for Liquid Meat and Pink Slime instead of drops and experience |

Crushing gives back more Essence than duplicating costs, so the loop sustains itself. Range Addons
widen the kill area; a Fortune Addon on the Crusher improves drops.
