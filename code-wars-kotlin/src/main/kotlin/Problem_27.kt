object Problem_27 {
    fun getMiddle(word : String) : String {
        if(word.length % 2 == 0){
            return word[word.length / 2 - 1] + word[word.length / 2].toString()
        } else {
            return word[word.length / 2].toString()
        }
    }
}