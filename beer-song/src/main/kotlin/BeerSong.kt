
class Bottles(private val count:Int) {
    override fun toString() = when (count) {
            0 -> "no more bottles"
            1 -> "1 bottle"
            else -> "$count bottles"
        }
}

class Verse(private val startBottles: Int) {
    override fun toString(): String {
        val line1 = "%s of beer on the wall, %<s of beer.%n".format(Bottles(startBottles)).replaceFirstChar { it.uppercaseChar() }

        val line2 = if (startBottles == 0) {
            "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
        } else {
            "Take %s down and pass it around, %s of beer on the wall.%n".format(if (startBottles == 1) "it" else "one", Bottles(startBottles - 1))
        }
        return line1 + line2
    }
}


object BeerSong {
    fun verses(startBottles: Int, takeDown: Int) : String {
        val result = (startBottles downTo takeDown).map{ Verse(it) }
        return result.joinToString("\n")
    }
}
