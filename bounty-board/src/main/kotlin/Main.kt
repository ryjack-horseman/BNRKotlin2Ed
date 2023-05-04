import java.lang.IllegalArgumentException

const val HERO_NAME = "Madrigal"
var playerLevel = 0

fun main() {
    println("$HERO_NAME announces her presence to the world")
    println("What level is $HERO_NAME?")
    playerLevel = readLine()?.toIntOrNull() ?: 0

    println("$HERO_NAME's level is $playerLevel")

  //Ch2 hasSteed challenge
//    var hasSteed = false
    //Ch2 Unicorn's horn challenge
//    val pubName = "The Unicorn's Horn"
//    var currentPublican = "John"
//    var currGold = 50
//    val drinkList: List<String> = listOf("mead", "wine", "LaCroix")
    readBountyBoard()

    println("Time passes...")
    println("$HERO_NAME returns from her quest.")

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
): String? {
    if(playerLevel <= 0){
        throw InvalidPlayerLevelException()
    }
    return when(playerLevel) {
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
        else -> null
    }
}

class InvalidPlayerLevelException() :
    IllegalArgumentException("Invalid player level (must be at least 1)")

private fun readBountyBoard(){
    val message: String = try{
        val quest: String? = obtainQuest(playerLevel)
        quest?.replace("Nogartse", "xxxxxxxx")
            ?.let { censoredQuest ->
                """
            |$HERO_NAME approaches the bounty board. It reads:
            |   "$quest"
            """.trimMargin()
            } ?: "$HERO_NAME approaches the bounty board, but it is blank"
    }catch (e: Exception){
        "$HERO_NAME can't read what's on the bounty board"
    }
    print(message)
}
// |   "${obtainQuest(playerLevel).replace("Nogartse", "xxxxxxxx")}"