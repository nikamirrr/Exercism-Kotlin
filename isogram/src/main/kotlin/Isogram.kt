object Isogram {

    fun isIsogram(input: String): Boolean {
        val temp = input.filter{ it.isLetter() }.lowercase()
        return temp.length == temp.toSet().size
    }
}
