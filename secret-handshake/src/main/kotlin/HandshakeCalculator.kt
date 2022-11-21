object HandshakeCalculator {
    fun calculateHandshake(number: Int) : List<Signal> {
        val result = (Signal.values().filter{
            number and (1 shl it.ordinal) != 0
        })
        if (number and 0b10000 != 0) {
            return result.asReversed()
        }
        return result
    }
}
