---
navigation:
  parent: index.md
  title: Functional Storage
  position: 20
item_ids:
  - functionalstorage:oak_1
  - functionalstorage:oak_2
  - functionalstorage:oak_4
  - functionalstorage:storage_controller
  - functionalstorage:controller_extension
  - functionalstorage:compacting_drawer
  - functionalstorage:simple_compacting_drawer
  - functionalstorage:ender_drawer
  - functionalstorage:armory_cabinet
---

# Functional Storage

Chests are fine until you have four thousand cobblestone. Functional Storage replaces the wall of
chests with a wall of drawers: fewer slots, vastly more of each thing, and you can see what is in
them from across the room.

## Drawers

A drawer block comes in one, two and four slot versions, in every wood type. Each slot holds one
item type — deeply.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="assets/functionalstorage/drawers.snbt" />
  <BlockAnnotation x="1" y="1" z="2">One slot, the largest capacity.</BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2">Four slots, capacity split between them.</BlockAnnotation>
</GameScene>

Interacting with a drawer:

| Action | Result |
|---|---|
| Right-click a slot | Insert the held stack |
| Hold right-click | Push everything matching out of your inventory |
| Left-click a slot | Take one stack |
| Sneak + left-click | Take one item |

Upgrades go in the drawer's own UI. Copper through Netherite raise capacity; **Void** throws away
whatever will not fit; **Puller** and **Pusher** move items in and out on their own.

## The Storage Controller

A wall of drawers is only useful if you can search it. The **Storage Controller** claims every
drawer connected to it and presents the lot as a single inventory with a search box.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/functionalstorage/controller.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">
    Storage Controller.
  </BlockAnnotation>
  <BlockAnnotation x="2" y="2" z="2" color="#ddc166">
    Controller Extension — carries the connection further, stores nothing itself.
  </BlockAnnotation>
</GameScene>

Drawers connect through touching faces, so the wall has to be one solid piece. When it cannot be,
the **Linking Tool** binds a distant drawer to the controller by hand.

Pipes, hoppers and AE2 storage buses can all talk to the controller instead of addressing each
drawer, which is what makes a drawer wall usable as network storage.

## Compacting Drawers

A **Compacting Drawer** stores one material across all of its crafting tiers at once — nuggets,
ingots and blocks in a single drawer, converted between each other automatically.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="assets/functionalstorage/compacting_drawer.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">
    Compacting Drawer — three tiers, one drawer.
  </BlockAnnotation>
</GameScene>

Insert at any tier, withdraw at any tier. The **Simple Compacting Drawer** is the cheap two-tier
version.

## Ender Drawers

Two **Ender Drawers** set to the same colour frequency are the same drawer, however far apart they
are.

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="assets/functionalstorage/ender_drawer.snbt" />
  <BlockAnnotation x="1" y="1" z="2" color="#7fcde0">Put something in here...</BlockAnnotation>
  <BlockAnnotation x="3" y="1" z="2" color="#ddc166">...take it out over there.</BlockAnnotation>
</GameScene>

One at the mining site, one at the base, and the trip home stops being about inventory management.

## The Armory Cabinet

Drawers refuse anything with NBT, which rules out tools, armour and enchanted books. The **Armory
Cabinet** is the answer: hundreds of ordinary slots, happy to hold gear.

<GameScene zoom="5" interactive={true}>
  <ImportStructure src="assets/functionalstorage/armory_cabinet.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">
    One cabinet, in place of a very long row of chests.
  </BlockAnnotation>
</GameScene>
