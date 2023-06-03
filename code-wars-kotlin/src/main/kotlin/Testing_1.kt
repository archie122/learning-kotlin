fun main (args: Array<String>) {
    val day : Int = 3

    val dayOfWeek = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println(dayOfWeek)


    var x = 0
    do {
        x++
        println(x)
    }  while (x < 10)
}