import kotlin.math.roundToInt
fun main() {
    val mark1 = 3.0
    val mark2 = 4.0
    val mark3 = 3.0
    val mark4 = 5.0
    val numberOfStudents = 4

    val averageMark = (mark1 + mark2 + mark3 + mark4) / numberOfStudents  //ср. оценка дробное число
    val averageMark1 = (averageMark * 100).roundToInt() / 100.0  //округление до  2 знаков после запятой

    println(averageMark1)
}








