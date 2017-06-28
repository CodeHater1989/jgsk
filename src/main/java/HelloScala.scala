import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object HelloScala {
  def main(args: Array[String]): Unit = {
    HelloJava.sayHello()

    println(Array(1, 2, "i").mkString)
    println(Map())
    println(Map("name" -> "peter", "age" -> 12))

    println(mutable.HashMap("name" -> "peter"))
    println((1, 2, 3, ArrayBuffer("ii", "jj")))
  }
}