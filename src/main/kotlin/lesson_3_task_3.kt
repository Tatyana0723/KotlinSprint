fun main() {

    val number = readLine()!!.toInt()
    val result1 = number
    val result2 = result1 + number
    val result3 = result2 + number
    val result4 = result3 + number
    val result5 = result4 + number
    val result6 = result5 + number
    val result7 = result6 + number
    val result8 = result7 + number
    val result9 = result8 + number

    val multiplicationTable = """
        |$number * 1 = $result1
        |$number * 2 = $result2
        |$number * 3 = $result3
        |$number * 4 = $result4
        |$number * 5 = $result5
        |$number * 6 = $result6
        |$number * 7 = $result7
        |$number * 8 = $result8
        |$number * 9 = $result9
        """.trimMargin()

    println(multiplicationTable)


}