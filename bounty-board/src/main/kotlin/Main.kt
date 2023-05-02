const val HERO_NAME = "Madrigal"

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
    var playerLevel= 4
    println(playerLevel)

    if(playerLevel == 1){
        println("Meet Mr. Bubbles in the land of soft things")
    } else if (playerLevel <= 5){
        println("Save the town from the barbarian invasions.")
    } else if (playerLevel == 6) {
        println("Located the enchanted sword.")
    } else if (playerLevel == 7) {
        println("Recover the long-lost artifact of creation")
    } else if (playerLevel == 8) {
        println("Defeat Nogartse, bringer of death and eater of worlds")
    } else {
        println("Locate the enchanted sword.")
    }

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)
//  ch2 magic mirror challenge
//    println("The hero discovers a magic mirror!")
//    println("The hero's new name is " + HERO_NAME.reversed())
}