object Reverse{
    fun reverseWords(str:String):String{
        val result : List<String> = str.split(" ").reversed()
        return result.joinToString(" ")
    }
}