import kotlinversion.Node


import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Example
        val node = Node(1, 10)
        node.appendToEnd(6, 5)
        node.appendToEnd(1, 4)
        node.appendToEnd(8, 9)
        node.appendToEnd(5, 2)
        node.appendToEnd(8, 4)
        node.appendToEnd(2, 1)
        node.appendToEnd(9, 2)
        node.printNodes()
        println("Dealer Lenght: ${node.length(node)}")
        println("Dealer Sum: ${node.sumOfNodes()}")
        node.deleteNode(node, 6, 5)
        node.printNodes()
        // End of Example
    }
}