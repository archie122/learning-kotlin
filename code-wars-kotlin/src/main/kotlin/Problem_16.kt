import java.math.BigInteger

object Problem_16 {
    fun printerError(s: String): String {
        val list = s.trim().toList()
        var errors = 0

        for (i in list) {
            when (i) {
                in 'n'..'z' -> {
                    errors++
                }
            }
        }

        return "$errors/${list.size}"
    }

}