class Matrix(private val matrixAsString: String) {
    private var rows  = matrixAsString.lines().map{ rowString ->
        ArrayList<Int>(rowString.split(" ").map{
            Integer.parseInt(it)
        })
    }.toTypedArray()
    private var cols  = Array<List<Int>>(rows[0].size){ col_index->
        rows.map{ row -> row[col_index] }
    }

    fun column(colNr: Int) = cols[colNr - 1]
    fun row(rowNr: Int) = rows[rowNr - 1]
}
