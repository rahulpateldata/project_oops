import scala.io.StdIn.readInt

// Main class
object Banking_System {
  def main(args: Array[String]): Unit = {

    // Object of all classes
    val obj1 = new Account()
    val obj2 = new SavingsAccount()
    val obj3 = new CurrentAccount()
    val obj4 = new Bank()

    println("Enter 1 for account details, " +
      "2 for SavingsAccount, " +
      "3 for CurrentAccount and " +
      "4 for closing or opening account")

    val choice = readInt()
    if (choice == 1) {
      obj1.details()
    }

    if (choice == 2) {
      println("Enter 1 for checking the interest " +
        "amount and 2 if you want to see the " +
        "details of any particular account: ")

      val choice1 = readInt()
      if (choice1 == 1) {
        obj2.interest_amount()
      }
      else if (choice == 2) {
        obj2.details()
      }
    }

    if (choice == 3) {
      println("Enter 1 for credit and 2 for debit: ")
      val choice2 = readInt()

      if (choice2 == 1) {
        obj3.credit()
      }
      if (choice2 == 2) {
        obj3.debit()
      }
    }

    if (choice == 4) {
      println("Enter 1 for opening account " +
        "and 2 for closing an account: ")

      val choice3 = readInt()
      if (choice3 == 1) {
        obj4.opening()
      }
      else {
        obj4.closing()
      }
    }
  }
}
