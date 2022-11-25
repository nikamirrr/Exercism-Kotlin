class IsbnVerifier {

    fun isValid(number: String): Boolean {

        return number.filter{ it != '-'}
            .mapIndexed{
                index, value -> (10 - index) * when(value) {
                    in '0'..'9' -> value - '0'
                    'X' -> 10
                    else -> return false
                }
            }.sum() % 11 == 0
    }
}
