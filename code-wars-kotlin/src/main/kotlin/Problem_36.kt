object Problem_36 {
    fun thirt(n: Long): Long {
        var list = mutableListOf<Long>()
        var nCopy = n
        var result: Long = 0
        var result2: Long

        do {
            result2 = result
            list.clear()

            while (nCopy != 0L) {
                val digit = nCopy % 10
                list.add((Math.pow(10.0, list.size.toDouble()).toLong() % 13) * digit)
                nCopy /= 10
            }

            result = list.sum()
            nCopy = result
        } while (result != result2)

        return result
    }


}