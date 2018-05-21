import java.util.*

fun main(args: Array<String>) {
    testWhatShouldIDoToday()
}

fun testWhatShouldIDoToday() {
    println(whatShouldIDoToday())
}

fun whatShouldIDoToday(mood: String = getMoodStringFromUser(), weather: String = "sunny", temperature: Int = 24) = when {
    shouldGoForAWalk(mood, weather) -> "go for a walk"
    shouldStayInBed(mood, weather, temperature) -> "stay in bed"
    shouldGoSwimming(temperature) -> "go swimming"
    else -> "Stay at home and read"
}

fun getMoodStringFromUser(): String {
    print("Enter mode string: ")
    return readLine()!!
}

private fun shouldGoSwimming(temperature: Int) = temperature > 35

private fun shouldStayInBed(mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0

private fun shouldGoForAWalk(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun testAddFish() {
    println(canAddFish(10.0, listOf(3,3,3))) // false
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false)) //true
    println(canAddFish(9.0, listOf(1,1,3), 3)) //false
    println(canAddFish(10.0, listOf(), 7, true)) //true
}

fun canAddFish(tankSize: Double,
               currentFishesLengths: List<Int>,
               fishToAddSize: Int = 2,
               hasDecorations: Boolean = true): Boolean {
    //allowed fish length is = 1 inch of fish per gallon of water

    //if tank has decorations then only 80% of the tank can be filled with fishes
    val validTankSize = if (hasDecorations) tankSize.times(0.8) else tankSize
    //remove the already fishes in tank lengths (inches) from valid tank size
    val availableTankSize = validTankSize - currentFishesLengths.sum()

    //now if new fish size (inches) is greater than or equal to available tank size
    //then we can fit the fish
    return availableTankSize >= fishToAddSize
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