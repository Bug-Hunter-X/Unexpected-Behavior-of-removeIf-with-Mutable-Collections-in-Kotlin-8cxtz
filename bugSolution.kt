fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (element in list) {
        if (element > 2) {
            toRemove.add(element)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = mutableSetOf<Int>()
    for (element in set) {
        if (element > 2) {
            toRemoveSet.add(element)
        }
    }
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val toRemoveMapKeys = mutableSetOf<Int>()
    for ((key, value) in map) {
        if (key > 2) {
            toRemoveMapKeys.add(key)
        }
    }
    toRemoveMapKeys.forEach { map.remove(it) }
    println(map) // Output: {1=one, 2=two}
} 