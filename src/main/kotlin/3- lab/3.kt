package org.example.`3- lab`


fun main() {
    val num = readln().toInt()
    var res = "1, "
    for (i in 2..num/2) {
        if (num % i == 0){
            res += "$i, "
        }
        res += "$num"
    }
    println(res.removeSuffix(", "))
}