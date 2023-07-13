object Problem_42 {
    fun squareSum(n: Array<Int>): Int {
        var sum = 0
        for (i in n.indices) {
            sum += (n[i] * n[i])
        }

        return sum
    }
}