const val HERO_NAME = "Madrigal"
var playerLevel = 5

fun main() {
    println("The hero announces her presence to the world")
    println(HERO_NAME)

  //Ch2 hasSteed challenge
//    var hasSteed = false
    //Ch2 Unicorn's horn challenge
//    val pubName = "The Unicorn's Horn"
//    var currentPublican = "John"
//    var currGold = 50
//    val drinkList: List<String> = listOf("mead", "wine", "LaCroix")
    readBountyBoard()

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)

    readBountyBoard()
//  ch2 magic mirror challenge
//    println("The hero discovers a magic mirror!")
//    println("The hero's new name is " + HERO_NAME.reversed())
}

private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasBefriendedBarbarians: Boolean = true,
    hasAngeredBarbarians: Boolean = false
): String = when(playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things"
        in 2..5 -> {
            //try diplomacy
            val canTalktoBarbarians = !hasAngeredBarbarians &&
                    (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTalktoBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        }

        6 -> "Located the enchanted sword."
        7 -> "Recover the long-lost artifact of creation"
        8 -> "Defeat Nogartse, bringer of death and eater of worlds"
        else -> "There are no quests right now"
    }

private fun readBountyBoard(){
    println("The hero approaches the bounty board. It reads:")
    println(obtainQuest(playerLevel))
}