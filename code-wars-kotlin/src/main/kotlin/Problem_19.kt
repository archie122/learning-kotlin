object Problem_19 {
    fun reverseLetter(str: String): String {
        val nonAlphaNum = "[^a-zA-Z]".toRegex()
        val result = str.replace(nonAlphaNum, "")
        return result.reversed()
    }
}