package Test

/**
 * Hello world!
 *
 */
object Application{
  def main(args: Array[String]): Unit = {
    println("Hellow world")
    println(s"Number is ${add(10,20)}")
  }
  def add(a:Int,b:Int):Int = {
    a+b
  }
}
