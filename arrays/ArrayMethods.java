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

  public static void main(String[] args) {
    ArrayMethods am = new ArrayMethods();
    am.sortingFun();
    am.searchArray();
    am.copyArray();
    am.fillArray();
    am.compareArrays();
  }
}
