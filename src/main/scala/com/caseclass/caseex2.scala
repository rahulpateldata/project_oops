package com.caseclass

object caseex2 {

  def test1(x:Int):Unit=
    x match {
      case 1=>println("hi")
      case 2=>println("hello")
      case _=>println("not satisifed")
    }

  def main(args:Array[String]): Unit = {

    test1(1)
  }

}
