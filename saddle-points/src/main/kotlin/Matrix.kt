import kotlin.math.max

data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(matrixData: List<List<Int>>) {

    val saddlePoints = HashSet<MatrixCoordinate>()
    init {
        if (matrixData.isNotEmpty()) {
            if (matrixData[0].isNotEmpty()) {
                val maxRowValues = matrixData.map{ it[0] }.toIntArray()
                val minColValues = matrixData[0].toIntArray()
                matrixData.forEachIndexed{row_index, row ->
                    row.forEachIndexed{col_index, value ->
                        maxRowValues[row_index] = maxRowValues[row_index].coerceAtLeast(value)
                        minColValues[col_index] = minColValues[col_index].coerceAtMost(value)
                }}
                maxRowValues.forEachIndexed{row_index, max_row ->
                    minColValues.forEachIndexed{col_index, min_col ->
                        if (max_row == min_col) {
                            saddlePoints.add(MatrixCoordinate(row_index + 1, col_index + 1))
                        }
                    }
                }
            }
        }
    }
}
