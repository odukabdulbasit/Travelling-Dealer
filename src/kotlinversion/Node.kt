package kotlinversion


class Node(var x:Int, var y:Int) {

    var following: Node? = null
    var head: Node? = this

    fun appendToEnd(x:Int,y:Int) {

        val end = Node(x,y)
        var n: Node? = this

        while (n!!.following != null) {
            n = n.following
        }
        n.following = end

    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var current = head
        while(current != null) {
            println("Dealer: ${current.x}, ${current.y} ")
            current = current?.following
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var result=0
        var current = h

        while(current != null) {
            current = current?.following
            result++
        }

        return result
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var result=0
        var current = head

        while(current != null) {
            result += calculateDistance(current.x,current.y)
            current = current?.following
        }

        return result
    }

    fun deleteNode(head: Node, x: Int, y: Int) :Node?{
        val n: Node = head
        var tempNode: Node? = head
        var prevNode: Node? = null

        if(tempNode != null && n.x==x && n.y==y) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
        while (tempNode != null && !(tempNode.x == x && tempNode.y == y)) {
            prevNode = tempNode
            tempNode = tempNode.following
        }

        if (tempNode == null)
            return head

        prevNode?.following = tempNode?.following

        return tempNode
    }

    fun calculateDistance(x:Int,y:Int): Int{

        var xValue = Math.pow(x-3.toDouble(), 2.0)
        var yValue = Math.pow(y-7.toDouble(), 2.0)
        var distance = Math.sqrt(xValue + yValue).toInt()

        return distance * 2
    }
}