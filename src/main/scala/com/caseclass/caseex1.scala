package com.caseclass

object caseex1 {

  def test(x:String):Unit=
    x match {
      case "r1" => println("hi")
      case "r2" => println("hello")
      case _ => println("not satisfied")


    }
  def main(args:Array[String]): Unit = {
    test("mange tak")
  }
}
