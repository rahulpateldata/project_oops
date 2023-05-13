// Scala program for Banking System

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt, readLine}

class Account {

  // Creating four ListBuffer which stores
  // the initial details of customer
  var name = new ListBuffer[String]()
  name += ("Ankit", "Rohit", "Rahul")
  var balance_current = new ListBuffer[Int]()
  balance_current += (20000, 30000, 40000)
  var account_number = new ListBuffer[Int]()
  account_number += (1234, 5678, 9101)
  var phone_number = new ListBuffer[Long]()
  phone_number += (9998273493L, 5569392838L, 6651299039L)

  // details() method is used to show
  // the details of all customer
  def details(): Unit = {
    println("Details of customer is\nNames of customer: " + name +
      "\nBalance list" + "is respectively: " + balance_current +
      "\nAccount number is respectively: " + account_number +
      "\nPhone number" + "is respectively: " + phone_number)
  }

  // Used to add money to a particular account
  def credit(): Unit = {
    var credit_amount: Int = 0
    println("Enter the account number you want to credit in: ")
    // readInt is used to take integer
    // value as input from user
    val acc_num1 = readInt()

    // indexOf() method returns the index
    // of particular element
    val index1 = account_number.indexOf(acc_num1)
    println("Enter the amount you want to credit: ")
    credit_amount = readInt()
    balance_current(index1) += credit_amount
    println("Amount added successfully\nNew Balance is: " +
      balance_current(index1))
  }

  // Used to withdraw money from an account
  def debit(): Unit = {
    var debit_amount: Int = 0
    println("Enter the account number " +
      "you want to withdraw from: ")
    val acc_num2 = readInt()
    val index2 = account_number.indexOf(acc_num2)
    println("Enter the amount you want to withdraw: ")

    debit_amount = readInt()
    balance_current(index2) -= debit_amount
    println("Money withdrawn successfully\n" +
      "Remaining balance is: " +
      balance_current(index2))
  }
}

// Child class of class Account()
class SavingsAccount extends Account {
  var interest: Double = 2

  // Method used to calculate interest
  def interest_amount(): Unit = {
    println("Enter the account number " +
      "to see the interest amount: ")

    val acc_num3 = readInt()
    val index3 = account_number.indexOf(acc_num3)
    interest = (balance_current(index3) * 2) / 100
    println("The interest amount is: " + interest)
  }

  // Method used to view the details of
  // any particular account
  // using method overriding
  override def details(): Unit = {
    println("Enter the account_number to see its details: ")
    val acc_num4 = readInt()
    val index4 = account_number.indexOf(acc_num4)

    println("Details of this account is\n" +
      "Name of customer is: " + name(index4) +
      "\nAccount number is: " + account_number(index4) +
      "\nPhone number is: " + phone_number(index4) +
      "\nAccount balance is: " + balance_current(index4))
  }
}

// Child class of class Account()
class CurrentAccount extends Account {
  var overdraft_limit: Int = 2000

  // Using method overriding
  // method used to withdraw money
  override def debit(): Unit = {
    println("Enter the account number " +
      "you want to withdraw from: ")

    val acc_num5 = readInt()
    val index5 = account_number.indexOf(acc_num5)
    println("Enter the amount you want to withdraw: ")
    var debit_amount = readInt()

    if (balance_current(index5) - debit_amount < 2000) {
      println("Overdraft limit exceeded " +
        "transaction declined")
    }
    else {
      balance_current(index5) -= debit_amount
      println("Transaction successful\n" + "" +
        "Remaining balance is: " +
        balance_current(index5))
    }
  }
}

// Child class of class Account()
class Bank extends Account {

  // Method to open an account
  def opening(): Unit = {

    // readLine() method is used to
    // take a string as input from user
    var new_name = readLine("Enter the name: ")
    name += new_name
    println("Enter the opening balance: ")
    var opening_balance = readInt()
    balance_current += opening_balance
    account_number += 1908
    println("Account added successfully")
  }

  // Method used to close an existing account
  def closing(): Unit = {
    println("Enter the account number: ")
    val acc_num6 = readInt()
    val index6 = account_number.indexOf(acc_num6)
    name -= name(index6)
    balance_current -= balance_current(index6)
    account_number -= account_number(index6)
    println("Account removed successfully")
  }
}
