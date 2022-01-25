package com.dicoding.kotlin

fun main(){
    //array with mixarray
    val array= arrayOf(1,2,3,4,"TEGUH",'A')
    println(array[0])
    //Array with arrayof of spesifik
    val array1= intArrayOf(1,2,3,4,5)
    println(array1[2])
    //penggunaan harus dengan Array lamda
    val intArray=Array(4){
            i -> i*i
    }
    println(intArray)
    for(j in intArray){
        println(j)
    }


}