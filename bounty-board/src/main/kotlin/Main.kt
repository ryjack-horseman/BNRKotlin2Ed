const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world")
    println(HERO_NAME)

    var hasSteed = false
    val pubName = "The Unicorn's Horn"
    var currentPublican = "John"
    var currGold = 50
    val drinkList: List<String> = listOf("mead", "wine", "LaCroix")
    var playerLevel= 4
    println(playerLevel)

    println("The hero embarks on her journey to locate the enchanted sword")
    playerLevel++
    println(playerLevel)

    println("The hero discovers a magic mirror!")
    println("The hero's new name is " + HERO_NAME.reversed())
}