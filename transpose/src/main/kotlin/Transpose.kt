import java.lang.Integer.max

object Transpose {

    fun transpose(input: List<String>): List<String> {

        val result = ArrayList<ArrayList<Char>>()
        result.addAll((0 until input.maxOf{it.length}).map{ ArrayList() })
        for (v in input.withIndex().reversed()) {
            for (vc in v.value.withIndex()) {
                val row = result[vc.index]
                row.addAll((0 until max(0, v.index + 1 - row.size)).map{ ' '})
                row[v.index] = vc.value
            }
        }


        return result.map{ it.joinToString("") }

    }
}
