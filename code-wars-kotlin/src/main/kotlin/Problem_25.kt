object Problem_25 {
    fun fizzBuzz(n: Int): Array<String> {
        var array = arrayOf<String>()

        for (i in 1..n) {
            if (i % 15 == 0) {
                array += "FizzBuzz"
            } else if (i % 3 == 0) {
                array += "Fizz"
            } else if (i % 5 == 0) {
                array += "Buzz"
            } else {
                array += i.toString()
            }
        }

        return array
    }
}