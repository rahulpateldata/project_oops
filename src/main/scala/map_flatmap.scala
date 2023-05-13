/*
// Scala program of flatMap

// Creating object
object GfG {

  // Main method
  def main(args: Array[String]) {

    // Creating a list of numbers
    val list = Seq(8, 15, 22, 23, 24)

    // Defining a function
    val f = (x: Int) => if ((x % 3) == 0) x else -x

    // Applying flatMap
    val result = list.map(y => f(y))

    // Displays output
    println(result)

  }
}






*/



////////////////////////////
import scala.None

/*
object map_flatmap
{
  class phone (val name:String,val models:List[String]) {


  }

  def main (args:Array[String]):Unit=
  {
    val apple =new phone("Apple",List("iphonex","iphone8"))

    val mi =new phone ("MI",List("redmi9","pocof1"))

    val phonelist=List(apple,mi)


    val m=phonelist.map(phone=>phone.models)
    val m1=phonelist.flatMap(phone=>phone.models)

    println(m)
    println(m1)
  }


}*/

/*
object map_flatmap{

  def main(args:Array[String]): Unit = {

    val f= (n:Int) => if((n/3.0).isWhole) Some(n)  else None

    val m =List.range(1,10).map(list=>f(list))
    println(m)

    val f1=List.range(1,10).flatMap(list=>f(list))

    println(f1)
  }

}*/

/////////////////////////////////////////////////

/*
object filters extends App
{
  val m=Map("geeks"->5,"for"->3)

  val fitr =m.filter(x=>x._1=="geeks" && x._2==5)

  println(fitr)
}*/
/////////////////////////

object map_flatmap extends  App
{
  val f =List.range(1,101).filter(num => Math.sqrt(num).isWhole)

  val fn=List.range(1,101).filterNot(num=>Math.sqrt(num).isWhole)

  println(f)

  println(fn)
}

