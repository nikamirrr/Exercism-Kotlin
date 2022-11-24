object Acronym {
    fun generate(phrase: String) = phrase.split(' ', '-')
        .map{ it.trimStart('_') }.
        filter{ it.isNotEmpty() && it[0].isLetter() }.
        joinToString(""){ it[0].uppercase() }
}
