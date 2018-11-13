package Test

import org.scalatest.FlatSpec

/**
  * Created by vn000de on 11/13/2018.
  */
class MainTest extends FlatSpec {
  "Application" should "add correctly" in {
    assert(Application.add(1,2)==3)
    println("In Test files")
  }
}
