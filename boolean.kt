package fundamental

fun main(){
    //program deteksi jam kerja
    println("Program deteksi jam kerja")
    val kerja=8
    val tutup=15
    val now=20
    val isopen=if(kerja>now && tutup<now){
        true
    }else{
        false
    }
    println("Kantor anda sekarang buka? => $isopen")
    //or dan not nanti aja deh
}