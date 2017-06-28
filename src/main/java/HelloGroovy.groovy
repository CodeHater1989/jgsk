class HelloGroovy {
    static void main(String[] args) {
        println("Hello, Groovy!")
        HelloJava.sayHello()

        println([1, 2, 3] as int[])
        println([3, 4, 5])
        println(["one": 1])
        println([:])
        println(new Tuple(1, 2, 3, [1, 23]))

        println(1..30)
    }
}