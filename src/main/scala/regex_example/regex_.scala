package regex_example

import scala.util.matching.Regex

object regex_  extends  App {



  var name = "rahul".r //r ,method

  var name2 = new Regex("(r|R)ahul")

  var name3 = new Regex("rahul")

  var fullname = "rahul chhotu patel Rahul"

  println((name findAllIn fullname).mkString(","))
  println((name2 findAllIn fullname).mkString(","))
  println((name2 findFirstIn fullname).mkString(","))
  println((name3 findAllIn fullname).mkString(","))
  println(name3 replaceAllIn(fullname, "prabhat"))

}
