package org.example.`3- lab`


fun main() {
    val num = readln().toInt()
    var res = ""
    for (i in 1..num) {
        if (num % i == 0){
            res += "$i, "
        }
    }
    println(res.removeSuffix(", "))
}