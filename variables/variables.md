# Java Variables and Data Types  

## **Variables in Java**  
A **variable** in Java is a container that holds data during program execution. Each variable has a specific data type that determines the kind of value it can store.  

### **Types of Variables**  
1. **Instance Variables**  
   - Declared inside a class but outside any method, constructor, or block.  
   - Each object has its own copy.  
   - Default values are assigned if not initialized.  
   - **Example**:  
     ```java
     public class MyClass {
         int age; // Instance variable
     }
     ```  

2. **Static Variables**  
   - Declared using the `static` keyword.  
   - Shared among all objects of the class.  
   - **Example**:  
     ```java
     public class MyClass {
         static int count = 0; // Static variable
     }
     ```  

3. **Local Variables**  
   - Declared inside methods, constructors, or blocks.  
   - Must be initialized before use.  
   - **Example**:  
     ```java
     public void display() {
         int number = 10; // Local variable
         System.out.println(number);
     }
     ```  

4. **Final Variables**  
   - Declared using the `final` keyword.  
   - Value cannot be changed after initialization.  
   - **Example**:  
     ```java
     public class MyClass {
         final int MAX_VALUE = 100; // Final variable
     }
     ```  

---

## **Data Types in Java**  
Java data types are divided into two categories:  

1. **Primitive Data Types**  
2. **Non-Primitive (Reference) Data Types**  

---

### **1. Primitive Data Types(intrinsic)**  
Primitive data types are predefined by the language.  

| **Type**     | **Size**   | **Default Value** | **Example**       | **Description**                                      |
|--------------|------------|-------------------|-------------------|----------------------------------------------------|
| `byte`       | 1 byte     | 0                 | `byte b = 10;`    | Stores small integers (-128 to 127).               |
| `short`      | 2 bytes    | 0                 | `short s = 1000;` | Stores larger integers (-32,768 to 32,767).        |
| `int`        | 4 bytes    | 0                 | `int i = 100000;` | Commonly used to store integers.                  |
| `long`       | 8 bytes    | 0L                | `long l = 100000L;`| Stores very large integers.                       |
| `float`      | 4 bytes    | 0.0f              | `float f = 10.5f;`| Stores decimal numbers (6-7 decimal digits).       |
| `double`     | 8 bytes    | 0.0d              | `double d = 20.99;`| Stores precise decimal numbers (15 decimal digits).|
| `char`       | 2 bytes    | '\u0000'          | `char c = 'A';`   | Stores a single character.                        |
| `boolean`    | 1 bit      | false             | `boolean b = true;`| Stores `true` or `false`.                         |

---

### **2. Non-Primitive Data Types(Derived)**  
Non-primitive types are created by the programmer and include classes, arrays, interfaces, etc.  

| **Type**        | **Description**                                 | **Example**                         |
|-----------------|------------------------------------------------|-------------------------------------|
| `String`        | Sequence of characters.                        | `String str = "Hello";`            |
| `Array`         | Collection of fixed-size elements of the same type.| `int[] arr = {1, 2, 3};`          |
| `Class`         | Blueprint for creating objects.                | `class MyClass { }`                |
| `Interface`     | Abstract type that defines a contract.         | `interface MyInterface { }`        |

---

## **Type Casting in Java**  
Type casting is converting a value from one data type to another.  

### **1. Implicit Casting (Widening)**  
- Automatically performed when converting a smaller type to a larger type.  
- **Example**:  
  ```java
  int num = 10;
  double d = num; // Implicit casting

### **2. Explicit Casting (Narrowing) in Java**  

- Explicit casting, also known as narrowing conversion, is a process of converting a larger data type into a smaller data type. 
- Since this conversion may lead to data loss, it must be explicitly specified in the code using a **cast operator** `(type)`.  
- **Example**:  
  ```java
  public class ExplicitCastingExample {
    public static void main(String[] args) {
        double largeValue = 99.99;
        int smallValue = (int) largeValue; // Explicit casting
        
        System.out.println("Original double value: " + largeValue);
        System.out.println("After casting to int: " + smallValue);
    }
  }
  
---

## **Key Points**  
1. Explicit casting is **manual** and requires the programmer to specify the target type.  
2. It is commonly used when assigning a **larger data type** (like `double`) to a **smaller data type** (like `int`).  
3. **Data loss** can occur if the value being cast exceeds the range of the target type.  

---

# Java Literals

In Java, **literals** are constant values assigned directly to variables or constants. They represent fixed data values of various types and are used to initialize variables.

### Types of Literals in Java:

## 1. Integer Literals
- **Definition:** These literals represent whole numbers (positive or negative) without any decimal points.
- **Formats:**
  - Decimal (Base 10): Regular integer values.
  - Octal (Base 8): Represented by prefix `0`.
  - Hexadecimal (Base 16): Represented by prefix `0x` or `0X`.
  - Binary (Base 2): Represented by prefix `0b` or `0B`.

  **Example:** 
  - Decimal: `100`
  - Octal: `012`
  - Hexadecimal: `0x7F`
  - Binary: `0b1010`

---

## 2. Floating-Point Literals
- **Definition:** These literals represent real numbers (numbers with decimals).
- **Types:** Java has two types of floating-point literals:
  - `float` literals are suffixed with `f` or `F`.
  - `double` literals (default for floating-point numbers) are not suffixed, but can optionally be suffixed with `d` or `D`.

  **Example:**
  - `float` literal: `10.5f`
  - `double` literal: `20.99`
  - `double` literal with `D` suffix: `3.14D`

---

## 3. Character Literals
- **Definition:** These literals represent a single character enclosed in single quotes (`' '`).
- **Formats:** 
  - A single character, e.g., `'A'`
  - An escape sequence (special characters), e.g., `'\n'` (new line), `'\t'` (tab), etc.

  **Example:**
  - Single character: `'A'`
  - Escape sequence: `'\n'` (newline), `'\t'` (tab)

---

## 4. String Literals
- **Definition:** A string literal is a sequence of characters enclosed in double quotes (`" "`).
- **Formats:** A string can consist of letters, numbers, symbols, or spaces.

  **Example:** 
  - `"Hello, World!"`
  - `"Java Programming"`
  - `"This is line 1.\nThis is line 2."` (using escape character for newline)

---

## 5. Boolean Literals
- **Definition:** These literals represent the two possible values of the `boolean` data type: `true` and `false`.
- **Formats:** The literals are always in lowercase.

  **Example:**
  - `true`
  - `false`

---

## 6. Null Literal
- **Definition:** The `null` literal is used to represent the absence of an object or value. It points to no object or instance.

  **Example:** 
  - `null` (indicating no object is assigned)

---

## 7. Underscore in Numeric Literals (Java 7 and above)
- **Definition:** Starting from Java 7, underscores can be used in numeric literals to enhance readability. These are ignored during compilation.

  **Example:**
  - `1_000_000` (for one million)
  - `1234_5678_9101L` (large number with underscores for readability)
  - `3_14D` (using underscores for floating-point literals)

---

## Summary of Literal Types:
1. **Integer Literals:** Represent whole numbers (e.g., `100`, `012`, `0x7F`, `0b1010`).
2. **Floating-Point Literals:** Represent real numbers (e.g., `10.5f`, `3.14D`).
3. **Character Literals:** Represent single characters (e.g., `'A'`, `'\n'`).
4. **String Literals:** Represent a sequence of characters (e.g., `"Hello, World!"`).
5. **Boolean Literals:** Represent boolean values (`true`, `false`).
6. **Null Literal:** Represents a null reference (`null`).
7. **Underscore in Literals:** Used for improving readability in numeric literals (e.g., `1_000_000`).

### Conclusion:
Literals in Java are constant values that directly represent data of specific types. They make it easier to assign fixed values to variables or constants in the program. Each type of literal serves its purpose in representing integer, floating-point, character, string, boolean, or null values, and their usage is essential for defining data in Java applications.

