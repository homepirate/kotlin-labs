package org.example.`1-lab`


fun main(){
    val day_count = 2642
    val years = day_count / 365
    val weeks = (day_count % 365) / 7
    val days = (day_count % 365) % 7
    println("Лет: $years, недель: $weeks, дней: $days")
}