object Problem_28 {
    fun areaOrPerimeter(l:Int, w:Int):Int {
        return if (l == w) {
            l * w
        } else {
            (l + w) * 2
        }
    }
}