private val resColorMap = Color.values().mapIndexed{ index, value -> value to index}.toMap()
private val unitArray = Unit.values().map{ it.toString().lowercase() }

object ResistorColorTrio {
    fun text(vararg input: Color): String {
        var res = resColorMap.getValue(input[0])
        val secondDigit = resColorMap.getValue(input[1])
        var zeros = resColorMap.getValue(input[2])

        if (secondDigit == 0) {
            zeros++
        } else {
            res = 10 * res + secondDigit
        }
        return "%d%s %s".format(res, "0".repeat(zeros % 3), unitArray[zeros / 3])
    }
}
