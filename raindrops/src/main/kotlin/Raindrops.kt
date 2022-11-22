import java.io.File.separator

object Raindrops {

    fun convert(n: Int): String {
        return ((3..7 step 2)
            .zip(listOf("Pling","Plang", "Plong"))
            .filter{ n % it.first == 0 })
            .joinToString(separator=""){it -> it.second }
            .takeIf{ it.isNotEmpty() }?:n.toString()
    }
}
