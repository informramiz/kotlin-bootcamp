package spice

class Spice(val name: String, val spiciness: String = "mild") {

    val heat : Int
        get() = when (spiciness) {
            "no spice" -> 0
            "mild" -> 5
            "spicy" -> 6
            "very spicy" -> 7
            "extreme spicy" -> 8
            else -> 0
        }

    //called after primary constructor and before any secondary
    //constructor
    init {
//        println("Spice name is $name, spiciness is $spiciness and heat is $heat")
    }

    override fun toString(): String {
        return "Spice name is $name, spiciness is $spiciness and heat is $heat"
    }
}

fun makeSalt() = Spice("salt")