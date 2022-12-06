import java.util.Collections
import kotlin.random.Random
import kotlin.random.nextInt

class Robot() {

    private var storedName = generateName()
    private companion object {
        val availableNames = (0 until 676000).shuffled().iterator()
    }


    val name: String
        get() = storedName

    fun reset() {
        storedName = generateName()
    }

    private fun generateName(): String {
        availableNames.next().run {
            return "%c%c%03d".format(
                Char(65 + this % 26),
                Char(65 + (this / 26) % 26),
                this / 676
            )
        }
    }
}
