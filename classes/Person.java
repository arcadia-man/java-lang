package classes;

public class Person {
  String name;
  int age;

  // Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Method to print details
  public void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}
