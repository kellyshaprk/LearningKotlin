import java.lang.NumberFormatException

// 숫자 입력 받을 때, 값이 없거나 숫자가 아니면 에러 메시지 보여주고 프로그램 종료
// 사칙연산이 아닌 다른 값도 에러 메시지 보여주고 프로그램 종료
fun main(args: Array<String>) {
    var num1_String: String? = null
    var num2_String: String? = null
    var result: Double? = null
    var num1: Double? = null
    var num2: Double? = null
    var cal: String? = null

    try {
        print("Enter 1st number: ")
        num1_String = readLine()
        num1 = num1_String!!.toDouble()


        print("Enter 2nd number: ")
        num2_String = readLine()
        num2 = num2_String!!.toDouble()

        print("Select an operation (+ - * /): ")
        cal = readLine()

        when (cal) {
            "+" -> result = num1 + num2 // addValues(num1, num2)
            "-" -> result = num1 - num2 // subtractValues(num1, num2)
            "*" -> result = num1 * num2 // multiplyValues(num1, num2)
            "/" -> result = num1 / num2 // divideValues(num1, num2)
            else -> throw Exception ("Unknown operation")
        }
        println("The result = $result")
    }
    catch (e:NumberFormatException) {
        println("${e.message} is not a number")
    }
    catch (e:Exception) {
        println(e.message)
    }
}

/*
fun addValues (num1: Double, num2: Double) = num1 + num2
fun subtractValues (num1: Double, num2: Double) = num1 - num2
fun multiplyValues (num1: Double, num2: Double) = num1 * num2
fun divideValues (num1: Double, num2: Double) = num1 / num2
*/