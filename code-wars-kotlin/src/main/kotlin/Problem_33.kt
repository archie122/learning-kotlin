import java.math.BigInteger

object Problem_33 {
    fun perimeter(n: Int): BigInteger {
        var x = BigInteger.ZERO
        var y = BigInteger.ONE
        var z = BigInteger.ZERO
        var result = BigInteger.ZERO

        for (i in 1..n + 1) {
            x = y
            y = z
            z = x + y
            result += z
        }

        return result.multiply(BigInteger.valueOf(4))
    }
}