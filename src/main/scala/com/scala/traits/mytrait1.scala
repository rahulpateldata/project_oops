package com.scala.traits
// Scala program to illustrate
// concrete and abstract fields in traits

trait MyTrait1 {

  // Abstract field
  var value: Int

  // Concrete field
  var Height = 10
  val Width = 30
}

class MyClass extends MyTrait1 {

  // Overriding MyTrait's fields
  var value = 12
  Height = 40
  override val Width = 10

  // Method to display the fields
  def Display() {
    printf("Value:%d", value);
    printf("\nHeight:%d", Height);
    printf("\nWidth:%d", Width);
  }
}

object Main {

  // Main method
  def main(args: Array[String]) {
    val obj = new MyClass();
    obj.Display();
  }
}
