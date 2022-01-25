package fundamental

fun main(){
    val nama : String ? = null
    val namaa= nama?.length
    println(namaa)
    println(nama?.length)
    //Safecalls operator -> ?
    val test = nama?.length//bisa juga dengan cara ini untuk menghindari nullabel exception
    println(test)
    //Non null assertion-> !! =>tidak disarankan karena dapat berjumpa exception lagi
    //val tast =nama!!.length
    //Nullabel excption menggunakan if untuk pengaksesan
    if(nama!=null){
        val panjang = nama.length
        println(panjang)
    }
    else{
        println("Nullable execption")
    }
    val nilai= if(nama!=null){
        nama.length
    }
    else{
        7//default value elsevis operator
    }
    println(nilai)
    println(asu)
}
val a : String ?= null
//Safe calls operator (?.)
val text= a?.length
//elsevies operator (?:)=>sama kayak if else diatas
val taxt = a?.length ?:7
//a?.length -> jika nilai tidak null maka return a.leght
//jika tidak ?: kayak else diatas maka return default value yakni sejumlah 7(bersifat normative case)

val asu = a

