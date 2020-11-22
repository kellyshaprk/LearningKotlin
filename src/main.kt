import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
        print("Value1: ")
        val value1:String? = readLine()
        val d1 = value1!!.toDouble()

        print("Value2: ")
        val value2:String? = readLine()
        val d2 = value2!!.toDouble()

        val sum = d1 + d2
        println("Answer: $sum")
    } catch (e:KotlinNullPointerException) { //catch (e: java.lang.NullPointerException)
        println("Value was null")
    } catch (e:NumberFormatException) {
        println("${e.message} is not a number")
    }
}

