object Problem_15 {
    fun outed(meet: Map<String, Int>, boss: String): String {
        var averageOfHappniess = 0

        for (i in meet) {
            if (meet.keys.contains(boss)) {
                averageOfHappniess += i.value * 2
            }
            averageOfHappniess += i.value
        }

        averageOfHappniess /= meet.size

        if (averageOfHappniess <= 5) {
            return "Get Out Now!"
        } else {
            return "Nice Work Champ!"
        }
    }
}