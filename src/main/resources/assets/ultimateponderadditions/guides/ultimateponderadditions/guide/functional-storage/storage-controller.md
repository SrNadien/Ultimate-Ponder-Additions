---
navigation:
  parent: functional-storage/index.md
  title: Storage Controller
  position: 20
  icon: functionalstorage:storage_controller
item_ids:
  - functionalstorage:storage_controller
  - functionalstorage:controller_extension
---

# Storage Controller

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/functionalstorage/controller.snbt" />
  <BlockAnnotation x="2" y="1" z="2" color="#8cba51">Storage Controller</BlockAnnotation>
  <BlockAnnotation x="2" y="2" z="2" color="#ddc166">Controller Extension</BlockAnnotation>
</GameScene>

| Block | What it does |
|---|---|
| Storage Controller | Claims every connected drawer and presents them as one searchable inventory |
| Controller Extension | Carries the connection further. Stores nothing itself |

Drawers connect through touching faces, so the wall has to be one solid piece. When it cannot be,
the Linking Tool binds a distant drawer by hand.

Pipes, hoppers and AE2 storage buses talk to the controller instead of addressing each drawer, which
is what makes a drawer wall usable as network storage.
