fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val wayTime: Int = 457 //время в пути 457 минут
    val arrivalHour1 = departureHour + wayTime / 60 //подсчет часов (9 + целое от деления 457 на 60)
    val arrivalMinute1 = departureMinute + wayTime % 60 //подсчет минут (39 + остаток от деления 457 на 60)
    val arrivalHour2 = arrivalHour1 + arrivalMinute1 / 60 //если минуты больше 60, получаем часы, добавляем к полученным ранее
    val arrivalMinute2 = arrivalMinute1 % 60 //остаток от деления на 60 олученных ранее минут
    println("$arrivalHour2:$arrivalMinute2")

}