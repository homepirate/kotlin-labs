package org.example.`4-lab`

fun main() {
    val array: MutableList<Int> = mutableListOf();

    array.addAll(listOf(8, 21, 5, 90, 11, 0))
    array.add(0, 90)
    array.removeAt(4)
    array.add(-35)
    println(array)

}