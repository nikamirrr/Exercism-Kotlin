class BankAccount {
    // TODO: implement read access to 'balance'
    private var pbalance = 0L
    private var pclosed = false


    val balance : Long
    @Synchronized get() {
            if (pclosed) {
                throw IllegalStateException()
            }
            return pbalance
        }

    @Synchronized fun adjustBalance(amount: Long){
        if (pclosed) {
            throw IllegalStateException()
        }
        pbalance += amount
    }

    @Synchronized fun close() {
        if (pclosed) {
            throw IllegalStateException()
        }
        pclosed = true
    }
}
