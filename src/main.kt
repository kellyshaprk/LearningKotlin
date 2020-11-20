fun main(args: Array<String>) {
    val colors = arrayOf("Red", "Green", "Blue")
    val values = intArrayOf(1,3,5,7,9)

    printHeader("For each loop")
    for (color in colors) {
        println(color)
    }

    for (value in values) {
        println(value)
    }
    printHeader("For loop with indices")

    // index 의 복수형 indices
    // step 2: instead of seeing every item in the array, I'll see every other item
    for (i in values.indices step 2){
        println(values[i])
    }

    // 또는 0..colors.size-1: colors.size 는 3인데, 0부터 3까지 하면 indexOutOfBounds 오류 남, 이에 -1을 붙여줌
    for (i in 0 until colors.size) {
        println(colors[i])
    }
}

fun printHeader(label: String) {
    println("**************")
    println(label)
    println("**************")
}