package spice

fun main(args: Array<String>) {
    testSimpleSpice()
}

private fun testSimpleSpice() {
    val spices = listOf(
            Spice("churry"),
            Spice("curry", "no spice"),
            Spice("murry", "spicy"),
            Spice("turry", "very spicy"),
            Spice("jumbo", "extreme spicy")
    )

    //Create a list of spices that are spicy (heat=6) or less than spicy
    println(spices.filter { it.heat <= 6 })

    val salt = makeSalt()
}