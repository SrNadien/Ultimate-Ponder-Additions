---
navigation:
  parent: ex-deorum/index.md
  title: Hammers and Crooks
  position: 40
  icon: exdeorum:iron_hammer
item_ids:
  - exdeorum:wooden_hammer
  - exdeorum:stone_hammer
  - exdeorum:iron_hammer
  - exdeorum:diamond_hammer
  - exdeorum:netherite_hammer
  - exdeorum:crook
  - exdeorum:silkworm
---

# Hammers and Crooks

<GameScene zoom="4" interactive={true}>
  <ImportStructure src="../assets/exdeorum/hammer.snbt" />
  <BoxAnnotation min="1 1 2" max="4 2 3" color="#0084ff">Cobblestone, gravel, sand</BoxAnnotation>
</GameScene>

The Hammer breaks stone down one step at a time, and every step feeds the sieve:

Cobblestone → gravel → sand → dust.

Better hammers work faster, and the compressed versions handle a whole compressed block at once.

The **Crook** is the other early tool. It doubles what leaves drop, which is how you get saplings
and silkworms out of a tree without going mad.

Put a **Silkworm** on leaves and they turn into Infested Leaves. Break those and you get string,
which makes your first mesh. Silkworms are, in a real sense, what unlocks the sieve.
