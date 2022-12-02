import javax.management.Query.div
import kotlin.random.Random

class Robot() {

    private var storedName = generateName()
    private companion object {
        val takenNames = HashSet<Int>()
    }


    val name: String
        get() = storedName

    fun reset() {
        storedName = generateName()
    }

    private fun generateName(): String {
        var digitName : Int
        do {
            digitName = Random.nextInt(676000)
        } while (!takenNames.add(digitName))
        return "%c%c%03d".format(Char(65 + digitName % 26),
            Char(65 + (digitName / 26) % 26),
            digitName / 676)
    }
}
