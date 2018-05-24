package spice

fun main(args: Array<String>) {
    testSimpleSpice()
}

private fun testSimpleSpice() {
    val spice = SimpleSpice()
    println("spice name is ${spice.name} and heat is ${spice.heat}")
}