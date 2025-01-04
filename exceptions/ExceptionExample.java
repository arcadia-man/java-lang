package exceptions;

public class ExceptionExample {
  public static void main(String[] args) {
    try {
      int result = 10 / 0;
      System.err.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
