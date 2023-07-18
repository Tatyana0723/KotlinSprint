import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    val presentValue = 70000 //вклад сейчас
    val rate = 16.7 //процентная ставка
    val numberOfYears = 20 //количество лет
    val futureValue = presentValue * (1+rate/100).pow(numberOfYears) //вклад через 20 лет с учетом сложных процентов

    println((futureValue * 1000.0).roundToInt() / 1000.0) //округление до 3 цифр после запятой


}