object Bob {
    fun hey(input: String): String {
        var inputClean = input.trim()
        if (inputClean.length == 0) {
            return "Fine. Be that way!"
        } else {
            val allCaps = inputClean.all { !it.isLowerCase() } && inputClean.any { it.isUpperCase()  }
            val question = inputClean.last() == '?'
            if (question) {
                return if (allCaps)
                   "Calm down, I know what I'm doing!"
                else
                    "Sure."
            } else if (allCaps) {
                return "Whoa, chill out!"
            }
            return "Whatever."
        }
    }
}
