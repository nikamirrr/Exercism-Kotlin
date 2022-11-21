import java.lang.IllegalArgumentException

class Triangle<out T : Number>(private val a: T, private val b: T, private val c: T) {
    val isEquilateral : Boolean
    val isIsosceles : Boolean
    val isScalene : Boolean


    init {
        // val sides = listOf(a, b, c).map{ it.toDouble() }.sorted().toDoubleArray()
        val sides = listOf(a, b, c).map{ it.toDouble() }.sorted()
        if (sides[0] < 0.0 || sides[2] == 0.0 || sides[2] >= sides[0] + sides[1]) {
            throw IllegalArgumentException()
        }
        isEquilateral = sides[0] == sides[2]
        isIsosceles = isEquilateral || (sides[0] == sides[1] || sides[1] == sides[2])
        isScalene = !isEquilateral && !isIsosceles

    }

}
