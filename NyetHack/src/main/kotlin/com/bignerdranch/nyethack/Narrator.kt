package com.bignerdranch.nyethack

import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier: (String) -> String = {it}

inline fun narrate(
    message: String,
    modifier: (String) -> String = { narrationModifier(it) }
) {

    println(modifier(message))
}

fun changeNarratorMood() {
    val mood: String
    val modifer: (String) -> String
    when(Random.nextInt(1..5)){
        1 -> {
            mood = "loud"
            modifer = {message ->
                val numExclamationPoints = 3
                message.uppercase()+ "!".repeat(numExclamationPoints)
            }
        }
        2 -> {
            mood = "tired"
            modifer = {message ->
                message.lowercase().replace(" ", "... ")
            }
        }
        3 -> {
            mood = "unsure"
            modifer = {message ->
                "$message."
            }
        }
        4 -> {
            var narrationsGiven = 0
            mood = "like sending an itemized bill"
            modifer = {message ->
                narrationsGiven++
                "$message.\n(I have narrated $narrationsGiven things)"
            }
        }
        else -> {
            mood = "professional"
            modifer = {
                message ->
                "$message."
            }
        }
    }
    narrationModifier = modifer
    narrate("The narrator begins to feel $mood")
}