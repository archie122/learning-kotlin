object Problem_12 {
    fun accum(s: String): String {
        val arr = s.toCharArray()
        val result = StringBuilder()

        for (i in arr.indices) {
            val repeatedChar = arr[i].toString().repeat(i + 1)
            result.append(Capitalize(repeatedChar))

            if (i < arr.size - 1) {
                result.append("-")
            }
        }

        return result.toString()
    }

    fun Capitalize(s: String): String {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()
    }

}

