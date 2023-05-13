object PrintTriangle
{

  def main(args: Array[String])
  {
    for(i <-5 to 1  by -1)
    {
      for(j <- 1 to i)
      {
        print("*")

      }
      println("")
    }
  }
}

