object Problem_23 {
    fun wave(str: String): List<String> {
        val result = ArrayList<String>()
        for (i in 0 until str.length) {
            if (str[i].isLetter()) {
                val modifiedStr = str.replaceRange(i, i + 1, str[i].uppercase())
                result.add(modifiedStr)
            }
        }
        return result
    }

}