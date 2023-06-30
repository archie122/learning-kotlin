object Problem_34 {
    fun sumParts(ls: IntArray): IntArray {
        var sum = ls.sum()
        var list = mutableListOf<Int>()
        list.add(sum)

        for (i in 0 until ls.size) {
            sum -= ls[i]
            list.add(sum)
        }

        return list.toIntArray()
    }
}