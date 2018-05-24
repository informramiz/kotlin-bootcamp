package spice

class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"

    val heat : Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> 0
        }
}