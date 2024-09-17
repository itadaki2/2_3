fun main() {
    print("Введите число: ")
    val number = readLine()!!.toInt()

    print("Введите количество умножений: ")
    val stepen = readLine()!!.toInt()

    var result = number
    for (i in 1 until stepen) {
        result *= number
    }

    println("$number умноженное на себя $stepen раз равно $result")
}
