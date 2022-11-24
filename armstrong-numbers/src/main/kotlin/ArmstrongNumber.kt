object ArmstrongNumber {

    fun check(input: Int): Boolean {
        if (input == 0) return true
        var inputVar = input

        val digs = ArrayList<Int>()
        while (inputVar > 0) {
            digs.add(inputVar % 10)
            inputVar /= 10
        }
        return digs.sumOf  {
            pow(it, digs.size)
        } == input
    }

    private fun pow(base: Int, power: Int) : Int {
        if (power == 0) return 1
        return if (power and 1 == 0) {
            val temp = pow(base, power shr 1)
            temp.times(temp)
        } else {
            pow(base, power - 1).times(base)
        }
    }

}
