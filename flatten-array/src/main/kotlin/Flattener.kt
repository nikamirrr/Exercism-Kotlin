import java.util.*

object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        return source.filterNotNull().flatMap {
                when (it) {
                    is Collection<Any?> -> flatten(it)
                    else -> listOf(it)
                }
            }
        }
}
