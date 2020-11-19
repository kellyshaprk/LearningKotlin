fun main(args: Array<String>) {
    // kotlin은 null 오류를 처리하기 쉬움
    // 기본적으로 String은 null을 허용하지 않지만 데이터 타입 뒤에 물음표를 넣으면 null을 기본값으로 넣을 수 있음
    var nullValue: String? = null
    println(nullValue)

    // Int도 마찬가지. 그런데 여기서 nullValue의 length라니 말도 안되는 코드인데
    // nullValue에도 물음표를 붙여주면 Int 형 변수값도 null이 됨
    val l:Int? = nullValue?.length
    println("The length is $l")

    if (l == null) {
        println("Length is null")
    }

    val message = if(l != null) {
        "Length is $l"
    } else {
        "l is null"
    }
    println(message)

    // l의 값을 l2에 넣어줌
    // l2의 값이 null이면 -1, null이 아니면 l2 본인의 값을 출력
    val l2:Int = l ?: -1
    println("The value of l2 is $l2")

    try {
        // null assertion
        // 변수값이 null이 아닌것을 확신할때 느낌표 두개 붙여줌
        // 그런데 null이라면? 오류 방지를 위해 try-catch 를 사용함
        val l3 = l!!
        println("The value of l3 is $l3")
    } catch (e: java.lang.NullPointerException) {
        println("l3 is null")
    }

}
