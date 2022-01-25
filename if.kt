package fundamental

fun main(){
    val openHours = 7
    val now = 20
    val office: String
    office=if (now > openHours) {
        "Office already open"
    } else if(now == openHours){
        "Office tipis tipis"
    } else {
        "Office is closed"
    }

    print(office)

}