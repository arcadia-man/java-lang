package controlflow;

public class LoopExample {

  // Method demonstrating a while loop
  public void whileLoopExample() {
    int count = 0;
    while (count < 5){ //always need boolean
      System.out.println("Count is: " + count);
      count++;
    }
  }

  // Method demonstrating a do-while loop
  public void doWhileLoopExample() {
    int count = 0;
    do {
      System.out.println("Count is: " + count);
      count++;
    } while (count < 5);
    
    do {
      System.out.println("Count is: " + count);
      count++;
    } while (count < 3);
  }

  // Method demonstrating a for loop
  public void forLoopExample() {
    for (int i = 0; i < 5; i++) {
      System.out.println("i is: " + i);
    }
  }

  // Method demonstrating an enhanced for loop (for-each loop)
  public void enhancedForLoopExample() {
    int[] numbers = { 1, 2, 3, 4, 5 };
    for (int number : numbers) {
      System.out.println("Number: " + number);
    }
  }

  // Method demonstrating the use of 'continue' in a for loop
  public void continueInForLoopExample() {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        continue; // Skip the rest of the loop when i is 5
      }
      System.out.println("i is: " + i);
    }
  }

  // Method demonstrating the use of 'continue' in a while loop
  public void continueInWhileLoopExample() {
    int i = 0;
    while (i < 10) {
      i++;
      if (i % 2 == 0) {
        continue; // Skip the rest of the loop for even numbers
      }
      System.out.println("i is: " + i);
    }
  }

  // Main method to execute examples
  public static void main(String[] args) {
    LoopExample example = new LoopExample();
    example.whileLoopExample();
    example.doWhileLoopExample();
    example.forLoopExample();
    example.enhancedForLoopExample();
    example.continueInForLoopExample();
    example.continueInWhileLoopExample();
  }
}
