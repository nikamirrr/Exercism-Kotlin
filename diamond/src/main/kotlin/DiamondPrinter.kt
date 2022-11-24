class DiamondPrinter {
    fun printToList(c: Char): List<String> {
      /*  if (c == 'A') return listOf("A")
        var sideCount = c - 'A'


        val result = ArrayList<String>()

        result.add(" ".repeat(sideCount) + 'A' + " ".repeat(sideCount))

        sideCount--
        var midCount = 1
        for (tc in 'B' until c) {
            result.add(" ".repeat(sideCount) + tc + " ".repeat(midCount) + tc + " ".repeat(sideCount))
            sideCount--
            midCount += 2
        }
        val temp = result.reversed()
        result.add(c + " ".repeat(midCount) + c)
        result.addAll(temp)*/

        if (c == 'A') return listOf("A")
        val result = ArrayList<String>()
        helper(result, 'A', c, c - 'A', -1)

        return result
    }

    private fun helper(result: ArrayList<String>, fin: Char, cur: Char, sideCount: Int, midCount: Int) {

        if (cur == fin) {
            result.add(cur + " ".repeat(midCount) + cur)
        } else {
            val curLine = if (cur == 'A') {
                " ".repeat(sideCount) + cur + " ".repeat(sideCount)
            } else {
                " ".repeat(sideCount) + cur + " ".repeat(midCount) + cur + " ".repeat(sideCount)
            }
            result.add(curLine)
            helper(result, fin, cur + 1, sideCount - 1, midCount + 2)
            result.add(curLine)
        }

    }
}
