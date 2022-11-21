object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        var lpos = 0
        var rpos = list.size - 1
        while (lpos <= rpos) {
            val mpos = (lpos + rpos) shr 1
            var d = list[mpos] - item
            if (d < 0) {
                lpos = mpos + 1
            } else if (d > 0) {
                rpos = mpos - 1
            } else {
                return mpos
            }
        }
        throw NoSuchElementException()

    }
}
