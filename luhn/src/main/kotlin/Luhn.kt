object Luhn {

    fun isValid(candidate: String): Boolean {
        val filtered = candidate.reversed().filter{ it != ' '}
        if (filtered.length < 2) return false
        return filtered.mapIndexed{index, c ->
            if (c.isDigit()) {
                var d = c.digitToInt()
                if ((index and 1) == 1) {
                    d = d shl 1
                    if (d > 9) d - 9 else d
                } else {
                    d
                }
            } else {
                return false
            }
        }.sum() % 10 == 0
    }
}
