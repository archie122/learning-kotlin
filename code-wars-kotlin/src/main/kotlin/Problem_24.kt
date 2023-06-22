object Problem_24 {
    fun persistence(num: Int): Int {
        var list = num.toString()
        var count = 0
        var result = num

        while (result > 10) {
            result = 1

            for (digitChar in list) {
                val digit = Character.getNumericValue(digitChar)
                result *= digit
            }

            list = result.toString()
            count++
        }

        return count
    }


}