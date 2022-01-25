package com.dicoding.kotlin

fun main() {
    //Access variable
    val a : Number = 10
    print(a)
    println()
    //Kotlin dapat secara eksplisist tidak usah menuliskan tipe data nya karena sudah diketahui otomatis
    var nama = "Teguh"
    nama="Teguh Permana"
    println(nama)

    /*
     var dapat dirubah atau di change nilai nya pada suatu variabel
     val tidak dapat dirubah nilainya pada suatu variabel =>cant be resigned
     */
    /**
    val nilai : Number= 30
    nilai = 10
    */

    //Unicode -> A= 0041
    var vocal ='A'
    println(++vocal)

    //String
    var name = "BULU"
    val noomber = name[3]
    println("INDEX DARI String of array adalah $noomber")

    var adan = "KETIAK BASAH"
    for(huruf in adan){
        print("$huruf")
    }
    println()
    //escape string
    var aku = "HAI MANIS \"KIMOCI\"\n"
    print(aku)

    //raw string
    var saya ="""
    Tipe1
    Tipe2    
    Tipe3
    """
    print(saya)



}