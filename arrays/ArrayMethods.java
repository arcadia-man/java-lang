package arrays;

import java.util.Arrays;

public class ArrayMethods {

  public void sortingFun() {
    int[] arr = { 9595, 98, 785 };
    // sorting
    Arrays.sort(arr);
    for (int i : arr) {
      System.err.println(i);
    }

    // converting array to string
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }

  // Method to demonstrate searching in a sorted array
  public void searchArray() {
    int[] numbers = { 1, 2, 3, 5, 8 };
    int index = Arrays.binarySearch(numbers, 5);
    if (index >= 0) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found.");
    }
  }

  // Method to demonstrate comparing two arrays
  public void compareArrays() {
    int[] array1 = { 1, 2, 3 };
    int[] array2 = { 1, 2, 3 };
    int[] array3 = { 1, 2, 4 };
    boolean areEqual1 = Arrays.equals(array1, array2);
    boolean areEqual2 = Arrays.equals(array1, array3);
    System.out.println("Arrays are equal: " + areEqual1);
    System.out.println("Arrays are equal: " + areEqual2);
  }

  // Method to demonstrate filling an array with a specific value
  public void fillArray() {
    int[] numbers = new int[5];
    Arrays.fill(numbers, 7);
    System.out.println("Array filled with 7s: " + Arrays.toString(numbers));
  }

  // Method to demonstrate copying an array
  public void copyArray() {
    int[] original = { 1, 2, 3 };
    int[] copy = Arrays.copyOf(original, original.length);
    System.out.println("Original array: " + Arrays.toString(original));
    System.out.println("Copied array: " + Arrays.toString(copy));
  }

  // Method to demonstrate stream an array
  public void streamOfArray() {
    int[] numbers = { 1, 2, 3, 4, 5 };

    // 1. Sum of all elements
    int sum = Arrays.stream(numbers).sum();
    System.out.println("Sum: " + sum);

    // 2. Find the maximum value
    int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
    System.out.println("Maximum: " + max);

    // 3. Filter even numbers
    int[] evenNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
    System.out.println("Even numbers: " + Arrays.toString(evenNumbers));

    // 4. Square each number
    int[] squaredNumbers = Arrays.stream(numbers).map(n -> n * n).toArray();
    System.out.println("Squared numbers: " + Arrays.toString(squaredNumbers)); // Output: [1, 4, 9, 16, 25]

    // 5. Check if all numbers are positive
    boolean allPositive = Arrays.stream(numbers).allMatch(n -> n > 0);
    System.out.println("All numbers are positive: " + allPositive); // Output: true

    // 6. Check if any number is greater than 10
    boolean anyGreaterThan10 = Arrays.stream(numbers).anyMatch(n -> n > 10);
    System.out.println("Any number greater than 10: " + anyGreaterThan10); // Output: false
  }

  public static void main(String[] args) {
    ArrayMethods am = new ArrayMethods();
    am.sortingFun();
    am.searchArray();
    am.copyArray();
    am.fillArray();
    am.compareArrays();
    am.streamOfArray();
  }
}
