object Problem_39 {
    fun findScreenHeight(width: Int, ratio: String): String {
        val x = ratio.split(":")[0].toInt()
        val y = ratio.split(":")[1].toInt()

        val height = width * y / x
        val result = width.toString() + "x" + height.toString()

        return result

    }
}