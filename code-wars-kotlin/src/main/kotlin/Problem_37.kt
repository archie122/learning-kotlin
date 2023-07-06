object Problem_37 {
    fun checkPerfectSquare(number:Double):Boolean{
        //Square Root of Number
        val sq= Math.sqrt(number)

        //Floor value, nearest Integer Part  floor(983.2) = 983
        val f = Math.floor(sq)

        return sq==f
    }

    fun nbDig(n:Int, d:Int):Int {
        var count = 0

        for(i in 1..n){
            val square = i * i
            square.toString().forEach {
                if (it.toString().toInt() == d) {
                    count++
                }
            }
        }

        return count
    }
}