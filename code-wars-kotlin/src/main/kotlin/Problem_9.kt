object Problem_9 {
    fun addrevName(name: String): String {
        val words = name.split(" ")
        return words[0][0] + "." + words[1][0]
    }
}