---
navigation:
  parent: functional-storage/index.md
  title: Drawers
  position: 10
  icon: functionalstorage:oak_1
item_ids:
  - functionalstorage:oak_1
  - functionalstorage:oak_2
  - functionalstorage:oak_4
---

# Drawers

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="../assets/functionalstorage/drawers.snbt" />
  <BlockAnnotation x="1" y="1" z="2">One slot, largest capacity</BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2">Four slots, capacity split</BlockAnnotation>
</GameScene>

One, two and four slot versions, in every wood type. Each slot holds one item type, deeply.

| Action | Result |
|---|---|
| Right-click a slot | Insert the held stack |
| Hold right-click | Push everything matching out of your inventory |
| Left-click a slot | Take one stack |
| Sneak + left-click | Take one item |

Upgrades go in the drawer's own UI. Copper through Netherite raise capacity, Void discards overflow,
Puller and Pusher move items in and out on their own. The Configuration Tool locks a drawer to its
current item so the slot stays reserved when emptied.
