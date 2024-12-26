package controlflow;

public class IfElseExample {

  public static void main(String[] args) {
    checkVotingEligibility(20);
    checkPassOrFail(45);
    determineGrade(75);
    printDayOfWeek(3);
    checkEligibilityUsingTernary(20);
    demonstrateLogicalOperators(10, -5);
  }

  public static void checkVotingEligibility(int age) {
    if (age > 18) {
      System.out.println("You are eligible to vote.");
    }
  }

  public static void checkPassOrFail(int marks) {
    if (marks >= 50) {
      System.out.println("You passed.");
    } else {
      System.out.println("You failed.");
    }
  }

  public static void determineGrade(int grade) {
    if (grade >= 90) {
      System.out.println("Grade: A");
    } else if (grade >= 75) {
      System.out.println("Grade: B");
    } else if (grade >= 50) {
      System.out.println("Grade: C");
    } else {
      System.out.println("Grade: F");
    }
  }

  public static void printDayOfWeek(int day) {
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      default:
        System.out.println("Invalid day");
    }
  }

  public static void checkEligibilityUsingTernary(int age) {
    String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
    System.out.println(eligibility);
  }

  public static void demonstrateLogicalOperators(int a, int b) {
    if (a > 0 && b > 0) {
      System.out.println("Both numbers are positive.");
    } else if (a > 0 || b > 0) {
      System.out.println("At least one number is positive.");
    } else {
      System.out.println("Neither number is positive.");
    }

    if (!(a < 0)) {
      System.out.println("a is not negative.");
    }
  }
}
