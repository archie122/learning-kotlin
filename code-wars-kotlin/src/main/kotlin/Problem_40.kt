object Problem_40 {
    fun calculateYears(years: Int): Array<Int> {
        if (years == 1){
            return arrayOf(years, 15, 15)
        }

        else if(years == 2) {
            return arrayOf(years, 24, 24)
        }

        else {
            var dogYears = ((years - 2) * 5) + 24
            var catYears = ((years - 2) * 4) + 24
            return arrayOf(years, dogYears, catYears)
        }
    }
}