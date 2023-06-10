object Problem_11 {
    fun nextBiggerNumber(n: Long): Long {
        val nString = n.toString()
        val length = nString.length

        // Check if the number is a single digit or empty
        if (length <= 1) {
            return -1
        }

        val digits = nString.toCharArray()

        // Find the first pair of adjacent digits to swap
        var swapIndex = -1
        for (i in length - 2 downTo 0) {
            if (digits[i] < digits[i + 1]) {
                swapIndex = i
                break
            }
        }

        // If no adjacent digits found, it's not possible to create a bigger number
        if (swapIndex == -1) {
            return -1
        }

        // Find the smallest digit greater than the digit at the swap index
        var nextBiggerIndex = swapIndex + 1
        for (i in swapIndex + 1 until length) {
            if (digits[i] > digits[swapIndex] && digits[i] <= digits[nextBiggerIndex]) {
                nextBiggerIndex = i
            }
        }

        // Swap the digits
        val temp = digits[swapIndex]
        digits[swapIndex] = digits[nextBiggerIndex]
        digits[nextBiggerIndex] = temp

        // Sort the digits after the swap index in ascending order
        val sortedDigits = digits.copyOfRange(swapIndex + 1, length)
        sortedDigits.sort()

        // Reconstruct the number
        val resultDigits = digits.copyOfRange(0, swapIndex + 1) + sortedDigits
        val resultString = String(resultDigits)

        return resultString.toLong()
    }



    fun swapDigits(number: Long, index1: Int, index2: Int): Long {
        val numberString = number.toString()
        return if (index1 in 0 until numberString.length && index2 in 0 until numberString.length) {
            val chars = numberString.toCharArray()
            val temp = chars[index1]
            chars[index1] = chars[index2]
            chars[index2] = temp
            String(chars).toLong()
        } else {
            number
        }
    }

}