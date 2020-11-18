fun main(args: Array<String>) {
    print("Enter a country abbreviation: ")

    val state: String? = readLine() // 자바에서는 스캐너를 생성해야 하지만 kotlin에서는 top level function이라 곧바로 사용 가능함

    if (state == "CA") {
        println("The capital is Ottawa")
    } else if (state == "KR") {
        print("The capital is Seoul")
    } else {
        println("Sorry")
    }
}
