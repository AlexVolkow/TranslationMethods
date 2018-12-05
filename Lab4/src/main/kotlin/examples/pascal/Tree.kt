package examples.pascal


class Tree(val node: String, vararg val children: Tree) {
    override fun toString(): String {
        return if (children.isEmpty()) {
            node
        } else {
            "$node(${children.joinToString("")})"
        }
    }

    fun toPrettyString(): String {
        return if (children.isEmpty()) {
            node
        } else {
            children
                .map { it.toPrettyString() }
                .filter { !it.isEmpty() }
                .joinToString(" ")
        }
    }

    fun print() {
        print("", true)
    }

    private fun print(prefix: String, isTail: Boolean) {
        println(prefix + (if (isTail) "└── " else "├── ") + node)
        for (i in 0 until children.size - 1) {
            children[i].print(prefix + if (isTail) "    " else "│   ", false)
        }
        if (children.isNotEmpty()) {
            children.last().print(prefix + if (isTail) "    " else "│   ", true)
        }
    }
}
