fun main(args: Array<String>) {
    val states = arrayOf("CA", "KR", "NA")

    var counter = 0
/*    while(counter < states.size) {
        println("counter = $counter")
        println("state = ${states.get(counter)}")
        counter ++
    }
    */
    counter = 0
    printHeader(" Do / While loop")
    do {
        println("states = ${states.get(counter)}")
        counter ++
    } while(counter < states.size)
}

fun printHeader(label: String) {
    println("**************")
    println(label)
    println("**************")
}