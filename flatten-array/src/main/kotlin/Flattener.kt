import java.util.*

object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val myStack = Stack<Iterator<Any?>>()
        myStack.push(source.iterator())
        val result = ArrayList<Any>()

        while (!myStack.empty()) {
            val curIt = myStack.pop()
            while (curIt.hasNext()) {
                var curVal = curIt.next()

                if (curVal is Collection<Any?>) {
                    myStack.push(curIt)
                    myStack.push(curVal.iterator())
                    break
                } else if (curVal != null) {
                    result.add(curVal)
                }

            }
        }
        return result
    }
}
