object Problem_32 {
    fun isLeapYear(year: Int) : Boolean {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true
        } else {
            return false
        }
    }
}