object PigLatin {

    fun translate(phrase: String): String {
        val vowels = setOf('a', 'e', 'i', 'u', 'o')
        val vowelsMid = "aeiuoy".toCharArray()
        val vowelLikes = setOf("xr", "yt")

        return phrase.split(" ").joinToString(" ") {
            if (it[0] in vowels || (it.length > 1 && it.substring(0, 2) in vowelLikes)) {
                it + "ay"
            } else if (it.length > 3 && it.substring(1, 3) == "qu") {
                it.substring(3) + it.substring(0, 3) + "ay"
            } else if (it.length > 2 && it.substring(0, 2) == "qu") {
                it.substring(2) + it.substring(0, 2) + "ay"
            } else {
                var pos = it.indexOfAny(vowelsMid, 1)
                if (pos == -1) pos = 1
                it.substring(pos) + it.substring(0, pos) + "ay"
            }
        }
    }
}
