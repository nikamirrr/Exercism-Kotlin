object Pangram {

    fun isPangram(input: String): Boolean {
        val flags = Array<Boolean>(26){true};
        input.forEach {
            when(it) {
                in 'a'..'z' -> flags[it.code - 97] = false
                in 'A'..'Z' -> flags[it.code - 65] = false
            }
        }
        return !flags.any { it };
    }
}
