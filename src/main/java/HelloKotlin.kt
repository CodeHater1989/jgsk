fun main(args: Array<String>) {
    HelloJava.sayHello()

    println(arrayOf(1, 2, 3))
    println(arrayOfNulls<Int>(3))

    println(listOf("one", "two"))

    println(emptyMap<String, Int>())
    println(mapOf("one" to 1, "two" to 2))
    println(hashMapOf("tt" to 23))

    println(Pair(1, 1.1))
    println(Triple(1, 1.1, hashMapOf("ji" to 2)))
}