
// 숫자 입력 받을 때, 값이 없거나 숫자가 아니면 에러 메시지 보여주고 프로그램 종료
// 사칙연산이 아닌 다른 값도 에러 메시지 보여주고 프로그램 종료
fun main(args: Array<String>) {
    print("Enter 1st number: ")
    val num1_String: String? = readLine()

    print("Enter 2nd number: ")
    val num2_String: String? = readLine()

    print("What do you want to? (+ - * /): ")
    val cal: String? = readLine()

    var result: Double? = null
    val num1: Double = num1_String!!.toDouble()
    val num2: Double = num2_String!!.toDouble()

    when (cal) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> result = num1 / num2
    }

    println("The result = $result")
}

