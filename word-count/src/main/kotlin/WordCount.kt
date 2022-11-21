import java.util.regex.Pattern


object WordCount {
    private val splitPat = Pattern.compile("[^\\w']+")

    fun phrase(phrase: String): Map<String, Int> {
        return phrase.split(splitPat).map{
            it.trim { c -> !c.isLetterOrDigit() }.lowercase()
        }.filter{ !it.isEmpty() }.groupingBy { it }.eachCount()
    }
}
