package com.scala.traits

// Scala Program that illustrates sealed trait
// language.scala
sealed trait Geeks {
  val article = "not done"
}

// Class extends trait
class Scala extends Geeks {
  override val article = "scala article"
}

// Class extends trait
class Java extends Geeks {
  override val article = "java article"
}

// Class extends trait
class Csharp extends Geeks {
  override val article = "csharp article"

}

// Creating object
object GFG {
  // Main method
  def main(args: Array[String]) {
    val s = new Scala
    val j = new Java
    val c = new Csharp
    val r=new myclass
    println(checkArticle(s))
    println(checkArticle(j))
    println(checkArticle(c))
    println(checkArticle(r))
  }

  // Defined function
  def checkArticle(article: Geeks): String =
    article match {
    case s => s.article
    case j=> j.article
    case c=> c.article
    case r=> r.article
    //exclusion of <strong>line 45</strong> would lead to warning
  }
}
