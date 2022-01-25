package fundamental

fun main(){
    val nama:String="BAMBANG"
    val nilai :Number=10
    //1.like a java
    println("Nama saya adalah ="+nama+"nilai saya adalah "+nilai)
    //2.pakai operator $
    println("nama saya adalah $nama nilai saya adalah $nilai")
    //3.dapat digunakannya sebuah argument
    val hour =10//harus bernilai value yang general kalau spesifikasi :number adalah error!!
    println("Kantor ${
        if (hour > 7){
            "Open"
        }
        else{
            "Close"
        }
    }")
}