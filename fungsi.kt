package com.dicoding.kotlin

fun main() {
    var nilai :Number = 10
    var tampung=fungsi1(nilai)
    println(tampung)

    var nama ="TEGUH"
    var tampung2=fungsi2(nama)
    println(tampung2)

    var name ="PERMANA"
    fungsi3(name)

    var namee="I Gede\"KIMOCI\""
    fungsi4(namee)
}
//fungsi dengan return value
fun fungsi1(nilai :Number):Number{
    return nilai
}

fun fungsi2(nilai:String):String=nilai

//fungsi dengan tanpa return value
fun fungsi3(name :String){
    println(name)
}

fun fungsi4(name :String):Unit{
    println(name)
}
