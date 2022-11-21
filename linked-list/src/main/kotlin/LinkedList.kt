class Deque<T> {
    private data class Node<T>(val value : T?=null) {
        var prev  = this
        var next  = this
    }

    private var dummy = Node<T>(null)

    fun push(value: T) {
        val newNode = Node<T>(value)
        newNode.next = dummy
        newNode.prev = dummy.prev
        newNode.prev.next = newNode
        newNode.next.prev = newNode
    }

    fun pop(): T? {
        if (dummy.next == dummy) {
            return null
        }
        val oldNode = dummy.prev
        dummy.prev = oldNode.prev
        dummy.prev.next = dummy
        return oldNode.value
    }

    fun unshift(value: T) {
        val newNode = Node<T>(value)
        newNode.prev = dummy
        newNode.next = dummy.next
        newNode.next.prev = newNode
        newNode.prev.next = newNode
    }

    fun shift(): T? {
        if (dummy.next == dummy) {
            return null
        }
        val oldNode = dummy.next
        dummy.next = oldNode.next
        dummy.next.prev = dummy
        return oldNode.value
    }
}
