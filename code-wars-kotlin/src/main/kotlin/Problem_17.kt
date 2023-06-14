object Problem_17 {
    fun findSmallestInt(nums: List<Int>): Int {
        var smallest = nums[0]

        for (i in nums){
            if (i < smallest){
                smallest = i
            }
        }

        return smallest
    }

}