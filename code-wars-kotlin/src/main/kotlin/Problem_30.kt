object Problem_30 {
    fun encryptThis(text: String): String {
        if (text.isEmpty()) {
            return ""
        } else if (text.length == 1) {
            val letter = text[0].toInt().toString()
            return letter
        }

        val arr = text.split(" ")
        val encryptedArr = mutableListOf<String>()

        for (word in arr) {
            val encryptedWord = when (word.length) {
                1 -> word[0].toInt().toString()
                2 -> word[0].toInt().toString() + word[1]
                else -> word[0].toInt().toString() + word.last() + word.substring(1, word.length - 1) + word[word.length - 2]
            }
            encryptedArr.add(encryptedWord)
        }

        return encryptedArr.joinToString(" ")
    }



}