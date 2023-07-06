package com.bignerdranch.nyethack

lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
    //changeNarratorMood()

    Game.play()
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

object Game {
    private var currentRoom: Room = TownSquare()
    init {
        narrate("Welcome, adventurer")

        val mortality = if(player.isImmortal) "an immortal" else "a mortal"
        narrate("${player.name}, $mortality has ${player.healthPoints} health points")
    }

    fun play() {
        while(true) {
            //Do something
            narrate("${player.name} of ${player.homeTown}, ${player.title} is in ${currentRoom.description()}")
            currentRoom.enterRoom()

            print("> Enter your command: ")
            println("Last command: ${readLine()}")
        }
    }
}