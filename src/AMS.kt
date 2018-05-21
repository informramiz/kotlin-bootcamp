import java.util.*

fun main(args: Array<String>) {
    swim()
    swim(speed = "slow")
}

fun swim(speed: String = "fast") {
    println("Fish is swimming $speed")
}

fun printFortune() {
    val day = getBirthday();
    val fortune = getFortune(day)
    println("Your fortune is: $fortune")
}

fun getFortune(day: Int) = when(day) {
    in 0..7 -> "Take it easy and enjoy life!"
    in 28..31 -> "You will have a great day!"
    else -> "Treasure your friends because they are your greatest fortune."
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    val birthday = getBirthday()
    val remainder = birthday % fortunes.size
    return fortunes[remainder]
}

private fun getBirthday(): Int {
    print("Enter your birthday: ")
    val birthdayStr = readLine()
    return birthdayStr?.toIntOrNull() ?: 1
}

fun feedTheFish() {
    val day = randomDay();
    val food = fishFood(day);
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val days = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return days[Random().nextInt(days.size)];
}

fun fishFood(day: String) = when(day) {
    "Monday" -> "flakes"
    "Tuesday" -> "pellets"
    "Wednesday" -> "redworms"
    "Thursday" -> "granules"
    "Friday"   -> "mosquitoes"
    "Saturday" -> "lettuce"
    "Sunday" -> "plankton"
    else -> "fasting"
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