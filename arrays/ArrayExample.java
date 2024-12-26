package arrays;

public class ArrayExample {

  // Main method to execute examples
  public static void main(String[] args) {
    ArrayExample example = new ArrayExample();
    example.oneDimensionalArrays();
    example.twoDimensionalArrays();
    example.arrayProperties();
  }

  public void oneDimensionalArrays() {
    // Declaration without initialization
    int[] array1;

    // Initialization with specified size
    array1 = new int[5];

    System.err.println(array1[3]); // uninitalized value is 0
    // System.err.println(array1[6]); Exception in thread "main"
    // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

    // Declaration and initialization with values
    int[] array3 = { 1, 2, 3, 4, 5 };

    // Declaration and initialization using 'new' keyword with values
    int[] array4 = new int[] { 9, 2, 3, 4, 5 };

    // Accessing array elements
    System.out.println("First element of array3: " + array3[0]);
    array3[0] = 10;
    System.out.println("Modified first element of array3: " + array3[0]);
    System.out.println("Modified first element of array4: " + array4[0]);
  }

  // Method demonstrating declaration and initialization of two-dimensional arrays
  public void twoDimensionalArrays() {
    // Declaration without initialization
    int[][] matrix1;

    // Initialization with specified size
    matrix1 = new int[3][3]; // 3x3 matrix

    // Declaration and initialization with size
    int[][] matrix2 = new int[2][3]; // 2 rows, 3 columns

    // Declaration and initialization with values
    int[][] matrix3 = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };

    // Accessing array elements
    System.out.println("Element at row 1, column 2 of matrix3: " + matrix3[0][1]);
    matrix3[0][1] = 20;
    System.out.println("Modified element at row 1, column 2 of matrix3: " + matrix3[0][1]);
    System.out.println("Modified element at row 1, column 2 of matrix2: " + matrix2[0][1]);
    System.out.println("Modified element at row 1, column 2 of matrix1: " + matrix1[0][1]);
  }

  // Method demonstrating properties of arrays
  public void arrayProperties() {
    int[] array = { 10, 20, 30, 40, 50 };

    // Length property
    System.out.println("Length of array: " + array.length); // Outputs 5

    // Iterating over array using for loop
    System.out.print("Array elements: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();

    // Iterating over array using enhanced for loop
    System.out.print("Array elements using enhanced for loop: ");
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
