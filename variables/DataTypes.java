package variables;

public class DataTypes {
  public void litrals() {
    // Integer Literals
    int decimal = 100;
    int octal = 012; // Octal literal
    int hexadecimal = 0x7F; // Hexadecimal literal
    int binary = 0b1010; // Binary literal

    // Floating-Point Literals
    float floatValue = 10.5f;
    double doubleValue = 20.99;

    // Character Literals
    char letter = 'A';
    char newline = '\n';

    // String Literals
    String greeting = "Hello, World!";

    // Boolean Literals
    boolean isTrue = true;
    boolean isFalse = false;

    // Null Literal
    String emptyString = null;

    // Output
    System.out.println("Decimal: " + decimal);
    System.out.println("Octal: " + octal);
    System.out.println("Hexadecimal: " + hexadecimal);
    System.out.println("Binary: " + binary);
    System.out.println("Float Value: " + floatValue);
    System.out.println("Double Value: " + doubleValue);
    System.out.println("Character: " + letter);
    System.out.println("Newline Character: " + newline);
    System.out.println("Greeting: " + greeting);
    System.out.println("Boolean True: " + isTrue);
    System.out.println("Boolean False: " + isFalse);
    System.out.println("Null String: " + emptyString); // Outputs: Null String: null
  }

  byte byteVar = 100;
  short shortVar = 20000;
  int intVar = 123456;
  long longVar = 123456789L;
  float floatVar = 12.34f;
  double doubleVar = 1234.56789;
  char charVar = 'A';
  boolean booleanVar = true;
  String stringVar = "Hello, Java!";
  int[] intArray = { 1, 2, 3, 4, 5 };

  public static void main(String[] args) {
    DataTypes example = new DataTypes();
    System.out.println("Primitive Data Types:");
    System.out.println("byte: " + example.byteVar);
    System.out.println("short: " + example.shortVar);
    System.out.println("int: " + example.intVar);
    System.out.println("long: " + example.longVar);
    System.out.println("float: " + example.floatVar);
    System.out.println("double: " + example.doubleVar);
    System.out.println("char: " + example.charVar);
    System.out.println("boolean: " + example.booleanVar);
    System.out.println("\nNon-Primitive Data Types:");
    System.out.println("String: " + example.stringVar);
    System.out.print("Array: ");
    for (int num : example.intArray) {
      System.out.print(num + " ");
    }
    System.out.println("\n\nType Casting:");
    int smallNumber = 10;
    double widenedNumber = smallNumber; // Implicit casting
    System.out.println("Widening (int to double): " + widenedNumber);

    double largeNumber = 99.99;
    int narrowedNumber = (int) largeNumber; // Explicit casting
    System.out.println("Narrowing (double to int): " + narrowedNumber);
    example.litrals();
  }
}
