class Dna(s : String) {
    private val result by lazy { "ATGC".map{ it to 0}.toMap().toMutableMap() }
    init {
        s.forEach {
            result[it]?.let { itc->
                result[it] = itc + 1
            } ?: run {
                throw IllegalArgumentException()
            }
        }
    }

    val nucleotideCounts
        get() = result
}
