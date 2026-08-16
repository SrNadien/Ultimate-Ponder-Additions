---
navigation:
  parent: index.md
  title: Modern Chickens
  position: 30
  icon: chickens:roost
---

# Modern Chickens

Every chicken type lays a resource instead of an egg. Chickens are held as *items*, not as entities:
you put the item into a machine and the machine produces on its behalf.

The chain is an Incubator to turn a spawn egg into a chicken item, a Breeder to get new types, and
Roosts to actually produce. Everything else feeds one of those three.

<SubPages />

## Quick reference

| Block | What it does |
|---|---|
| Roost | Holds chicken items and periodically produces their configured drops into internal output slots. Nest auras and Speed/Stack upgrades improve production |
| Nest | Holds a rooster item and seeds. Consumes seeds to create a timed aura that boosts nearby Roosts. Produces no items itself |
| Chicken Breeder | Combines two non-rooster chicken items and seeds to produce offspring according to the breeding system |
| Roost Collector | Automatically pulls finished output from nearby Roosts and Mechanical Roosts into its own storage inventory |
| Mechanical Roost | An RF-powered roost with four independent chicken rows and separate output storage for each row |
| Mechanical Nest | Uses a Robot Rooster and RF to maintain an aura that boosts nearby active Roosts and Mechanical Roosts |
| Incubator | Uses RF to convert Modern Chickens spawn eggs into portable chicken items over a 200-tick operation |
| Henhouse | Receives nearby chicken drops into a 3x3 output inventory. Runs on FE or hay fuel; hay can produce dirt as a byproduct |
| Roost Generator | Uses Redstone Flux Chickens to generate FE/t based on their count and stats, then exports the energy to adjacent machines |
| Avian Flux Converter | Drains energy from Flux Eggs into an internal FE/RF buffer and exports it to adjacent energy machines |
| Avian Fluid Converter | Cracks Liquid Eggs into an internal fluid tank and sends the stored fluid to adjacent tanks or pipes |
| Avian Chemical Converter | Cracks Chemical Eggs and Gas Eggs into a Mekanism-compatible chemical buffer for automation |
| Avian Dousing Machine | Uses an eligible chicken, stored item/fluid/chemical reagents, and RF to create specialized chicken spawn eggs, including the Dragon and Wither infusion paths |
