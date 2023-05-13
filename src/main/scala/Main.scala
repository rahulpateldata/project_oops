import scala.util.control.Breaks._


object Main
{
  def main(args:Array[String]): Unit = {

    var l1 =List(1,2,3,4)
    var l2=List(11,12,13)

    //var inloop=new Breaks
    //var outloop =new Breaks

   breakable {
      for (i <- l1)
        {
          println(i)

          breakable{
            for (j <- l2)
              {
                println(j)

                if (j ==12)
                  {
                    break;
                  }
              }


          }
        }
    }

  }
}