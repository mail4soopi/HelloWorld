package Test

import org.apache.flink.api.common.typeinfo.TypeInformation
import org.apache.flink.api.scala.ExecutionEnvironment

/**
 * Hello world!
 *
 */
object Application{
  def main(args: Array[String]): Unit = {
    implicit val typeInfo = TypeInformation.of(classOf[Char])
    implicit val typeInfo1 = TypeInformation.of(classOf[String])
    val env = ExecutionEnvironment.getExecutionEnvironment
    val values = env.fromElements("Foo", "bar", "foobar", "fubar")

    val counts = values
      .print()


    env.execute("Sampling")
  }

}
