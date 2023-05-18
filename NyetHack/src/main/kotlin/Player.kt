class Player {
    val name = "madrigal"
        get() = field.replaceFirstChar { it.uppercase() }
    fun castFireball(numFireballs: Int = 2){
        narrate("A glass of Fireball springs into existence (x$numFireballs)")
    }
}