object ResistorColorDuo {
    private val resColorMap = Color.values().mapIndexed{ index, value -> value to index}.toMap()

    fun value(vararg colors: Color): Int {
        return resColorMap.getValue(colors[0]) * 10 + resColorMap.getValue(colors[1])
    }
}
