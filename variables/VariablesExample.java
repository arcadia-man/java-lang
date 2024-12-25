package variables;

public class VariablesExample {
  final int MAX_SPEED = 120;

  // Static variable
  static int counter = 0;
  String name;
  int age;

  public VariablesExample(String name, int age) {
    this.name = name;
    this.age = age;
    counter++;
  }

  public void changeCounterValue(int value) {
    counter = value;
  }

  // Constructor that increments static counter
  public void variablesExample() {
    counter++; // Increment the static variable
  }

  // Method to display static variable
  public void displayCounter() {
    System.out.println("Counter: " + counter);
  }

  public void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }

  public void localVar() {
    // Local variable
    String message = "Hello, Local Variable!";
    System.out.println(message);
  }

  public void finaVar() {
    // Final variable
    System.err.println(MAX_SPEED);
    // MAX_SPEED = 9585;
    // The final field VariablesExample.MAX_SPEED cannot be assignedJava
  }

  public void parameterVar(String name) {
    // Parameter variable
    System.out.println("Hello, " + name + "!");
  }

  public void blockVar() {
    int number = 10; // Variable in the main method

    // Block
    {
      int blockVar = 20; // Block variable
      System.out.println("Block Variable: " + blockVar);
    }

    System.err.println(number);
    // blockVar is not accessible here
    // System.out.println(blockVar); // Error: blockVar cannot be resolved
  }

  public static void main(String[] args) {
    VariablesExample variablesExample = new VariablesExample("Alice", 25);
    VariablesExample obj1 = new VariablesExample("ram", 12000);
    VariablesExample obj2 = new VariablesExample("arjun", 5000);
    obj1.changeCounterValue(985);
    VariablesExample obj3 = new VariablesExample("visnu", 888888888);
    obj1.displayCounter(); // Output: Counter: 986
    obj2.displayCounter(); // Output: Counter: 986
    obj3.displayCounter(); // Output: Counter: 986
    obj1.displayInfo();
    obj2.displayInfo();
    obj3.displayInfo();
    variablesExample.localVar();
    variablesExample.finaVar();
    variablesExample.parameterVar("pritam");
    variablesExample.blockVar();
  }
}
