class Anagram(source: String) {
    private val charCount = source.groupBy { it }

    fun match(anagrams: Collection<String>): Set<String> {
        return anagrams.filter{ it.groupBy { itw -> itw } == charCount }.toSet()
    }
}
