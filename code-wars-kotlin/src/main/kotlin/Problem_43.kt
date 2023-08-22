object Problem_43 {
    fun chess_coords(){
        val list1 = listOf("A", "B", "C", "D", "E", "F", "G", "H")
        val list2 = listOf(1, 2, 3, 4, 5, 6, 7, 8)

        for (i in list1.indices){
            for (j in list2.indices){
                println(list1[i] + list2[j])
            }
        }
    }
}