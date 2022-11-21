import kotlin.math.pow

class Squares(private val n : Long) {

    fun sumOfSquares() = ((n * (n + 1) * ((n shl 1) + 1)) shr 1) / 3

    fun squareOfSum() = (((n + 1) * n) shr 1).apply { return this.times(this) }

    fun difference() = squareOfSum() - sumOfSquares()
}
