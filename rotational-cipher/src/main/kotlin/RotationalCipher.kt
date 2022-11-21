class RotationalCipher(private val key: Int) {

    private val normkey = key % 26
    private val lckey = normkey - 97
    private val hckey = normkey - 65

    fun encode(text: String): String {
        if (normkey == 0) {
            return text
        }
        return text.map{
            when(it) {
                in 'A'..'Z' -> Char(65 + (it.code + hckey) % 26)
                in 'a'..'z' -> Char(97 + (it.code + lckey) % 26)
                else -> it
            }
        }.joinToString("")
    }
}
