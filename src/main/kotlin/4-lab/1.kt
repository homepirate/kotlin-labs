package org.example.`4-lab`


fun main() {
    val first: Int = 10;
    val second: Int = 13;

    val min_ = minOf(first, second)
    val max_ = maxOf(first, second)

    val array = IntRange(min_, max_).toList();
    println(array)
}