object Problem_35 {
    fun maxPizza(cuts: Int): Int {
        if (cuts == 0) {
            return 1
        } else if (cuts < 0){
            return -1
        }

        return (cuts * cuts + cuts + 2) / 2
    }
}