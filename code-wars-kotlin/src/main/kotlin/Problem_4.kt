object Problem_4 {
    fun spinWords(sentence: String): String {
        val list = sentence.split(" ").toMutableList()
        for (i in list.indices) {
            if (list[i].length >= 5) {
                list[i] = list[i].reversed()
            }
        }

        return list.joinToString(" ");
    }
}