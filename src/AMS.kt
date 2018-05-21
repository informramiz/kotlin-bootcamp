import java.util.*

fun main(args: Array<String>) {
    printGreetingMsg(args)
}

fun printGreetingMsg(args: Array<String>) {
    println("Good ${if(args[0].toInt() < 12) "morning" else "night, Kotlin"}")
}

fun dayOfWeek() {
    println("What day is it today?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val currentDay = when(dayOfWeek) {
        Calendar.SUNDAY -> "Sunday"
        Calendar.MONDAY -> "Monday"
        Calendar.TUESDAY -> "Tuesday"
        Calendar.WEDNESDAY -> "Wednesday"
        Calendar.THURSDAY -> "Thursday"
        Calendar.FRIDAY -> "Friday"
        Calendar.SATURDAY -> "Saturday"
        else -> "Sunday"
    }

    println("Today is $currentDay")
}