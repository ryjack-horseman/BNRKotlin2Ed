package com.bignerdranch.nyethack

val player = Player()

fun main() {

    //changeNarratorMood()
    narrate("${player.name} is ${player.title}")
    player.changeName("Aurelia")

    narrate("${player.name}, ${player.title} heads to the town square.")
    visitTavern()

    player.castFireball()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?"){ message ->
        "\u001b[33;1m$message\u001b[0m"
    }

    /*input = readLine()

    require(heroName != null && heroName.isNotEmpty()) {
        "The hero must have a name."
    }

    return input*/

    println("Madrigal")
    return "Madrigal"

}