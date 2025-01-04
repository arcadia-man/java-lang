# Inheritance in Java

Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class to acquire the properties and behaviors of another class. It promotes code reusability, modular design, and the establishment of hierarchical relationships between classes.

---

## **What is Inheritance?**

Inheritance is a mechanism where one class (child or subclass) inherits fields and methods from another class (parent or superclass). This enables the child class to:

- Reuse the code of the parent class.
- Add its own unique features.
- Override existing methods to provide specialized behavior.

---

## **Types of Inheritance in Java**

Java supports the following types of inheritance:

### 1. **Single Inheritance**

- A child class inherits from a single parent class.
- This is the simplest form of inheritance.

**Example:**
Parent class `Animal` is inherited by child class `Dog`.

### 2. **Multilevel Inheritance**

- A class inherits from a class that has already inherited from another class.
- Forms a chain of inheritance.

**Example:**
Class `Grandchild` inherits from `Child`, which inherits from `Parent`.

### 3. **Hierarchical Inheritance**

- Multiple classes inherit from a single parent class.
- Common functionality can be reused by all child classes.

**Example:**
Classes `Dog` and `Cat` inherit from `Animal`.

### 4. **Multiple Inheritance (via Interfaces)**

- Java does not support multiple inheritance with classes to avoid ambiguity (diamond problem).
- Java allows multiple inheritance through interfaces, where a class can implement multiple interfaces.

**Example:**
Class `Vehicle` implements interfaces `Engine` and `Transmission`.

---

## **Why Use Inheritance?**

1. **Code Reusability:**

   - Write common functionality in a parent class and reuse it in child classes.

2. **Polymorphism:**

   - Achieved via method overriding, allowing dynamic method dispatch.

3. **Hierarchical Structure:**

   - Organize related classes into a logical hierarchy.

4. **Extensibility:**
   - Add or modify behavior in child classes without affecting parent class code.

---

## **Key Terminology**

1. **Superclass (Parent Class):**

   - The class being inherited from.

2. **Subclass (Child Class):**

   - The class inheriting from the parent class.

3. **`extends` Keyword:**

   - Used to denote inheritance from a class.

4. **`super` Keyword:**

   - Used to access members (fields or methods) of the parent class.

5. **Method Overriding:**

   - Subclass provides a specific implementation of a method defined in the parent class.

6. **Constructor Chaining:**
   - Inheritance involves invoking parent class constructors, explicitly or implicitly.

---

## **Benefits of Inheritance**

- Reduces code duplication.
- Improves code readability and maintainability.
- Encourages modular and organized code.

---

## **Limitations of Inheritance**

1. **Tight Coupling:**

   - Changes in the parent class can affect child classes.

2. **Inflexibility:**

   - Inheritance requires a strict hierarchy; alternatives like composition offer more flexibility.

3. **Complexity:**

   - Deep inheritance chains can make the code harder to understand and maintain.

4. **Overhead:**
   - Unnecessary inheritance can lead to unused fields and methods in child classes.

---

## **Inheritance vs Composition**

- **Inheritance:**

  - "Is-a" relationship.
  - Example: `Dog` is an `Animal`.

- **Composition:**

  - "Has-a" relationship.
  - Example: `Car` has an `Engine`.

  When designing systems, prefer composition over inheritance unless a clear "is-a" relationship exists.

---

## **Important Notes**

- **Final Classes:**

  - Cannot be extended. Declared using the `final` keyword.

- **Private Members:**

  - Private fields and methods of the parent class are not accessible to the child class directly.

- **Object Class:**
  - Every class in Java implicitly extends the `Object` class, which is the root of the class hierarchy.

---# Inheritance in Java

Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class to acquire the properties and behaviors of another class. It promotes code reusability, modular design, and the establishment of hierarchical relationships between classes.

---

## **What is Inheritance?**

Inheritance is a mechanism where one class (child or subclass) inherits fields and methods from another class (parent or superclass). This enables the child class to:

- Reuse the code of the parent class.
- Add its own unique features.
- Override existing methods to provide specialized behavior.

---

## **Types of Inheritance in Java**

Java supports the following types of inheritance:

### 1. **Single Inheritance**

- A child class inherits from a single parent class.
- This is the simplest form of inheritance.

**Example:**
Parent class `Animal` is inherited by child class `Dog`.

### 2. **Multilevel Inheritance**

- A class inherits from a class that has already inherited from another class.
- Forms a chain of inheritance.

**Example:**
Class `Grandchild` inherits from `Child`, which inherits from `Parent`.

### 3. **Hierarchical Inheritance**

- Multiple classes inherit from a single parent class.
- Common functionality can be reused by all child classes.

**Example:**
Classes `Dog` and `Cat` inherit from `Animal`.

### 4. **Multiple Inheritance (via Interfaces)**

- Java does not support multiple inheritance with classes to avoid ambiguity (diamond problem).
- Java allows multiple inheritance through interfaces, where a class can implement multiple interfaces.

**Example:**
Class `Vehicle` implements interfaces `Engine` and `Transmission`.

---

## **Why Use Inheritance?**

1. **Code Reusability:**

   - Write common functionality in a parent class and reuse it in child classes.

2. **Polymorphism:**

   - Achieved via method overriding, allowing dynamic method dispatch.

3. **Hierarchical Structure:**

   - Organize related classes into a logical hierarchy.

4. **Extensibility:**
   - Add or modify behavior in child classes without affecting parent class code.

---

## **Key Terminology**

1. **Superclass (Parent Class):**

   - The class being inherited from.

2. **Subclass (Child Class):**

   - The class inheriting from the parent class.

3. **`extends, implements` Keyword:**

   - extends used to denote inheritance from a class.
   - implements used to denote inheritance from a interface.

4. **`super` Keyword:**

   - Used to access members (fields or methods) of the parent class.

5. **Method Overriding:**

   - Subclass provides a specific implementation of a method defined in the parent class.

6. **Constructor Chaining:**
   - Inheritance involves invoking parent class constructors, explicitly or implicitly.

---

## **Benefits of Inheritance**

- Reduces code duplication.
- Improves code readability and maintainability.
- Encourages modular and organized code.

---

## **Limitations of Inheritance**

1. **Tight Coupling:**

   - Changes in the parent class can affect child classes.

2. **Inflexibility:**

   - Inheritance requires a strict hierarchy; alternatives like composition offer more flexibility.

3. **Complexity:**

   - Deep inheritance chains can make the code harder to understand and maintain.

4. **Overhead:**
   - Unnecessary inheritance can lead to unused fields and methods in child classes.

---

## **Inheritance vs Composition**

- **Inheritance:**

  - "Is-a" relationship.
  - Example: `Dog` is an `Animal`.

- **Composition:**

  - "Has-a" relationship.
  - Example: `Car` has an `Engine`.

  When designing systems, prefer composition over inheritance unless a clear "is-a" relationship exists.

---

## **Important Notes**

- **Final Classes:**

  - Cannot be extended. Declared using the `final` keyword.

- **Private Members:**

  - Private fields and methods of the parent class are not accessible to the child class directly.

- **Object Class:**
  - Every class in Java implicitly extends the `Object` class, which is the root of the class hierarchy.

---
