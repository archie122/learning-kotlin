object Problem_29 {
    fun decode(str: String): Int {
        var arr = str.toCharArray()
        var count = 0

        var i = 0
        while (i < arr.size) {
            when (arr[i]) {
                'I' -> {
                    if (i + 1 < arr.size && (arr[i + 1] == 'V' || arr[i + 1] == 'X')) {
                        count += if (arr[i + 1] == 'V') 4 else 9
                        i += 2
                    } else {
                        count++
                        i++
                    }
                }
                'V' -> {
                    count += 5
                    i++
                }
                'X' -> {
                    if (i + 1 < arr.size && (arr[i + 1] == 'L' || arr[i + 1] == 'C')) {
                        count += if (arr[i + 1] == 'L') 40 else 90
                        i += 2
                    } else {
                        count += 10
                        i++
                    }
                }
                'L' -> {
                    count += 50
                    i++
                }
                'C' -> {
                    if (i + 1 < arr.size && (arr[i + 1] == 'D' || arr[i + 1] == 'M')) {
                        count += if (arr[i + 1] == 'D') 400 else 900
                        i += 2
                    } else {
                        count += 100
                        i++
                    }
                }
                'D' -> {
                    count += 500
                    i++
                }
                'M' -> {
                    count += 1000
                    i++
                }
                else -> {
                    return 0
                }
            }
        }

        return count
    }

}