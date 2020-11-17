import kotlin.math.*

// import java.lang.Math.abs
// import java.lang.Math.round

//val myName = "Kelly"
// [val or var]  identifier: (data Type) = initial value

fun main(args: Array<String>) {
    var aString = "Hello"

    println(aString)

    //val empty = String()
    //println("'$empty'")

    //var charArray = aString.toCharArray()
    //println(charArray.toList())

    //var byteArray = aString.toByteArray()
    //println(byteArray.toList())

    aString += " and Welcome"
    println(aString)
/*
    val len = aString.length
    for (i in 0 until len) {
        val c = aString.get(i)
        println(c)
    }
*/
    val p = aString.indexOf("W")
    println(p)
    val sub = aString.substring(p)
    println(sub)

    val aString2 = aString
    var match = aString.equals(aString2)
    println(match) // kotlin은 primitive type이 없고 class만 있다고 했던듯? 그래서인지 결과는 true로 나옴... 오호!?

    val aString3 = aString.toUpperCase()
    match = aString.equals(aString3)
    println(match) // false: uppercase니까

    val aString4 = aString.toUpperCase()
    match = aString.equals(aString4, true)
    println(match) // true: ignoreCase




    /*
    var num1 = 15
    val num2 = 10
    val sum:Int = num1.plus(num2)
    println("sum = $sum")

    val difference = num1.minus(num2)
    println("difference = $difference")

    val product = num1.times(num2)
    println("product = $product")

    val quotient = num1.toDouble().div(num2)
    println("quotient = $quotient")

    val reminder = num1.rem(num2)
    println("reminder = $reminder")

    val neg = -15.2
    val ab = abs(neg) // or Math.abs when using Java functions
    println("absolute = $ab")
    println("rounded = ${round(ab)}")

    println("Have a piece of $PI")



    val sum = num1 + num2
    println("sum = $sum")

    // 더하는 것은 + 나 plus나 동일함
    val sum2 = num1.plus(num2)
    println("sum2 = $sum2")

    num1 ++
    println("num1 = $num1") // 11
    num1.inc()
    println("num1 = $num1") // incremental 을 사용하여 12가 나올것을 예상했지만 11이 나옴
    // inc()는 다른 임시 함수에 값을 assign 해주는 방식임
    // 따라서 다음과 같이 써야 함
    val num3 = num1.inc()
    println("num3 = $num3")





    val match: Boolean = (num1 == num2)
    println("Match = $match")

// kotlin에서는 equals보다는 == 이 더 효과적임
//    val match2:Boolean = num1.equals(num2)
//    println("Match2 = $match2")


    println("Comparison result = ${num1.compareTo(num2)}")
    // 15 vs 10: 1
    // 10 vs 10: 0
    // 10 vs 15: -1


    val myInt = 42
    val myLong: Long = myInt.toLong()
    // java에서는 굳이 toLong()을 해주지 않아도 가능. long이 int를 포함하니까. 하지만 kotlin에서는 명시해줘야 함

    println("The type of myLong is ${myLong::class.qualifiedName}")

    val myLong2 = 42.9
    var myInt2 = myLong2.toInt()

    // downcast: long에서 int로 바꿀 때도 명시해 줘야 하는데, 결과값 보면 0.9 잘림. 당연한 얘기지만 주의할 것
    println("The value of myLong is $myLong2")
    println("The value of myInt2 is $myInt2")

    val myInt3 = 568
    var myDouble = myInt3.toDouble()

    // upcast
    println("The value of myDouble is $myDouble")


    var num1 = 45
    println("The initial value of num1 is $num1")
    num1++
    println("The new value of num1 is $num1")

    val num2: Double = 5.toDouble()
    /*  assign해주는 값에 따라서 자동으로 데이터 타입 처리
        하지만 꼭 지정해주고 싶다면 var num: 데이터타입 = 5 이런식으로 처리
        그런데 위 예제에서 5는 integer이므로 Double이 아니라서 오류가 남
        이럴 때 5.toDouble()을 넣어줌
    */
    println("The value of num2 is $num2")

    println("My name is $myName")

    // Kotlin doesn't support primitive types
    // 만약 var myVariable: Int? = null 이렇게 데이터 아비에 물음표를 넣어주면 int형에도 null을 넣을 수 있음
     */
}
