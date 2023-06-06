object Problem_6 {
    fun removeChar(str: String): String {
        return str.replaceFirst("^.(.*).$".toRegex(), "$1").toString()
    }
}