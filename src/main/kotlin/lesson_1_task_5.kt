fun main() {

    val minutes = 6480 / 60 //минуты в полете
    val hours = minutes / 60 //часы в полете
    val restOfMinutes = minutes % 60 //остаток минут за минусом часов
    val restOfSeconds = 6480 - (3600 * hours + 60 * restOfMinutes ) //остаток секунд за минусом часов и минут

    val a = "%02d".format(hours)  //часы в двух цифрах
    val b = "%02d".format(restOfMinutes) //минуты в двух цифрах
    val c = "%02d".format(restOfSeconds)//секунды в двух цифрах
    println("$a:$b:$c")

    //или так
    print("%02d".format(hours))
    print(":")
    print("%02d".format(restOfMinutes))
    print(":")
    println("%02d".format(restOfSeconds))


}
