import java.lang.Long.max

class Series(private val input: String) {
    fun getLargestProduct(span: Int): Long {
        if (span < 0 || span > input.length) {
            throw IllegalArgumentException()
        }
        if (span == 0) {
            return 1
        }


        var maxProd : Long = 0
        var curProd : Long = 1
        var l : Int = 0
        var r : Int = 0
        while (r < input.length) {
            val c = input[r++]
            if (!c.isDigit()) {
                throw IllegalArgumentException()
            }
            if (c == '0') {
                curProd = 1
                l = r
            } else {
                curProd *= c.digitToInt()
                val d = r - l
                if (d >= span) {
                    if (d > span) {
                        curProd /= input[l++].digitToInt()
                    }
                    maxProd = max(maxProd, curProd)
                }
            }
        }



        return maxProd
    }
}
