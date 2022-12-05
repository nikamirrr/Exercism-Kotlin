import java.util.Collections
import kotlin.random.Random

class Robot() {

    private var storedName = generateName()
    private companion object {
        val availableNames = (0 until 676000).toMutableList()
    }


    val name: String
        get() = storedName

    fun reset() {
        storedName = generateName()
    }

    private fun generateName(): String {
        Collections.swap(availableNames,
            Random.nextInt(availableNames.size),
            availableNames.lastIndex)
        availableNames.removeLast().let {
            return "%c%c%03d".format(
                Char(65 + it % 26),
                Char(65 + (it / 26) % 26),
                it / 676
            )
        }
    }
}
