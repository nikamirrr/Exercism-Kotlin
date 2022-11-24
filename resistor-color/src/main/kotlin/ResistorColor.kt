object ResistorColor {
    private val resColors = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
    private val resColorMap = resColors.mapIndexed{ index, value -> value to index}.toMap()

    fun colorCode(input: String): Int {
        return resColorMap.getValue(input)
    }

    fun colors() = resColors

}
