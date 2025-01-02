package arrays;

public class VarArgs {
  public void sumOfNumbers(int... args) {
    int ans = 0;
    for (int i : args) {
      ans += i;
    }
    System.out.println(ans);
  }
  
  public void sumOfNumbersWithOneCompulsoryVar(int x, int... args) {
    int ans = x;
    for (int i : args) {
      ans += i;
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    VarArgs varArgs = new VarArgs();
    varArgs.sumOfNumbers(885, 34, 443, 5234, 2345);
    varArgs.sumOfNumbers(885, 34, 443, 5234, 2345, 2345);
    varArgs.sumOfNumbers(885, 34, 443, 5234, 2345, 23445325, 23454325);
    varArgs.sumOfNumbersWithOneCompulsoryVar(48, 94);
  }
}
