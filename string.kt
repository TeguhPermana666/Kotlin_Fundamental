package fundamental

fun main(){
    //indexing
    var nama : String ="Teguh"
    val index=nama[0]
    println(index)

    //Dua jenis string literal
    //1.Escaped string
    var kelas : String ="Teguh \"Tokyo Manji\""
    println(kelas)
    var line : String ="Line 1\n"+
            "Line2\n"+
            "Line3\n"//primitif
    println(line)
    //2.raw string
    var raw_line :String="""
line1
line2
line3
line4
"""
    println(raw_line)
}