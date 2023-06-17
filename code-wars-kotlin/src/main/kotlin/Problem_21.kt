object Problem_21 {
    fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
        var count = 0
        var sum = 0
        var result = arrayOf(0, 0)

        if(input.isNullOrEmpty()) {
            return arrayOf(0, 0)
        }

        for (i in input.indices) {
            if (input[i] > 0) {
                count++
            } else {
                sum += input[i]
            }
        }

        result[0] = count
        result[1] = sum

        return result
    }
}