package xyz.absolutez3ro.championgram.data

import xyz.absolutez3ro.championgram.R
import xyz.absolutez3ro.championgram.model.Champion
import xyz.absolutez3ro.championgram.model.Story

val spiderman = Champion(
    id = 100,
    name = "Peter Parker",
    madeUpName = "Spider-Man",
    imageThumbId = R.drawable.spiderman_thumb,
    imageId = R.drawable.spiderman_champion,
    placeOfOrigin = "New York, USA",
    abilities = listOf(
        "Genius-level intellect",
        "Proficient scientist and inventor",
        "Superhuman strength, speed, durability, agility, stamina, reflexes/reactions, coordination, balance and endurance",
        "Precognitive spider-sense ability, cling to most solid surfaces and webbing ability",
        "Utilizes wrist web-shooters to shoot spiderweb material"
    ),
    url = "https://en.wikipedia.org/wiki/Spider-Man"
)

val deadpool = Champion(
    id = 101,
    name = "Wade Wilson",
    madeUpName = "Deadpool",
    imageThumbId = R.drawable.deadpool_thumb,
    imageId = R.drawable.deadpool_champion,
    placeOfOrigin = "Canada",
    abilities = listOf(
        "Regenerative healing factor",
        "Extended longevity",
        "Skilled marksman, swordsman, and hand-to-hand combatant",
        "Uses magic satchel and devices granting teleportation and holographic disguise",
        "Fourth wall awareness",
        "Superhuman strength, durability, and agility"
    ),
    url = "https://en.wikipedia.org/wiki/Deadpool"
)

val captainamerica = Champion(
    id = 102,
    name = "Steve Rogers",
    madeUpName = "Captain America",
    imageThumbId = R.drawable.captain_thumb,
    imageId = R.drawable.captain_champion,
    placeOfOrigin = "New York, USA",
    abilities = listOf(
        "via Super-Soldier Serum; Peak human strength, speed, durability, agility, reflexes, senses, and mental processing",
        "Master martial artist and hand-to-hand combatant",
        "Accelerated healing factor",
        "Master tactician, strategist, and field commander",
        "Wields Vibranium-steel alloy shield"
    ),
    url = "https://en.wikipedia.org/wiki/Captain_America"
)

val wolverine = Champion(
    id = 103,
    name = "James Howlett",
    madeUpName = "Wolverine",
    imageThumbId = R.drawable.wolverine_thumb,
    imageId = R.drawable.wolverine_champion,
    placeOfOrigin = "Alberta, Canada",
    abilities = listOf(
        "Enhanced strength, speed, stamina, durability, endurance, agility, reflexes, dexterity, resilience, flexibility, coordination, balance, and reaction time",
        "Superhuman senses, and animal-like attributes",
        "Extended longevity via regenerative healing factor",
        "Nigh-Invulnerability",
        "Slowed aging",
        "Indestructible bones",
        "Adamantium-infused skeleton",
        "Retractable adamantium claws",
        "Retractable bone claws",
        "Master martial artist and hand-to-hand combatant"
    ),
    url = "https://en.wikipedia.org/wiki/Wolverine_(character)"
)

val doom = Champion(
    id = 104,
    name = "Victor Von Doom",
    madeUpName = "Dr. Doom",
    imageThumbId = R.drawable.doom_thumb,
    imageId = R.drawable.doom_champion,
    placeOfOrigin = "Romania",
    abilities = listOf(
        "Genius-level intellect",
        "Technopathy",
        "Energy absorption and projection, mind transference, and demonic summoning via dark mysticism and sorcery",
        "Superhuman strength and durability (Armor)",
        "Gauntlet lasers and force blasts (Armor)",
        "Flight via rocket boots",
        "Forcefield generation",
        "Various high-tech weapons and gadgets",
        "Diplomatic immunity"
    ),
    url = "https://en.wikipedia.org/wiki/Doctor_Doom"
)

val taskmaster = Champion(
    id = 105,
    name = "Tony Masters",
    madeUpName = "Taskmaster",
    imageThumbId = R.drawable.taskmaster_thumb,
    imageId = R.drawable.taskmaster_champion,
    placeOfOrigin = "Brooklyn",
    abilities = listOf(
        "Genius level intellect",
        "Master assassin and tactician",
        "Olympic level conditioning",
        "Exceptional athlete",
        "Master hand-to-hand combatant and martial artist",
        "Master swordsman and marksman",
        "Master archer and bowman",
        "Photographic reflexes",
        "Physical movement prediction",
        "Voice mimicry",
        "Master of disguise"
    ),
    url = "https://en.wikipedia.org/wiki/Taskmaster_(comics)"
)

val spidermanStory = Story(
    id = 200,
    champion = spiderman,
    imageId = R.drawable.spiderman_story
)

val deadpoolStory = Story(
    id = 201,
    champion = deadpool,
    imageId = R.drawable.deadpool_story
)

val captainamericaStory = Story(
    id = 202,
    champion = captainamerica,
    imageId = R.drawable.captain_story
)

val wolverineStory = Story(
    id = 203,
    champion = wolverine,
    imageId = R.drawable.wolverine_story
)

val doomStory = Story(
    id = 204,
    champion = doom,
    imageId = R.drawable.doom_story
)

val taskmasterStory = Story(
    id = 205,
    champion = taskmaster,
    imageId = R.drawable.taskmaster_story
)

val champions = listOf(
    spiderman,
    deadpool,
    captainamerica,
    wolverine,
    doom,
    taskmaster
)

val stories = listOf(
    spidermanStory,
    deadpoolStory,
    captainamericaStory,
    wolverineStory,
    doomStory,
    taskmasterStory
)