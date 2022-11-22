import java.io.File.separator

object Raindrops {

    fun convert(n: Int): String {
        val temp = ((3..7 step 2).zip(listOf("Pling", "Plang", "Plong")).filter{ n % it.first == 0 })
        if (temp.isEmpty())
            return n.toString()
        return temp.joinToString(separator=""){it -> it.second }
    }
}
