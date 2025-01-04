# Class and Interface in Java

## **What is a Class?**
- A **class** is a blueprint for creating objects, encapsulating data (fields) and behavior (methods).
- It provides the structure to define and organize the properties and operations of objects.
- Classes are a foundational concept in Object-Oriented Programming (OOP), supporting features like inheritance and encapsulation.

## **What is an Interface?**
- An **interface** is a reference type that defines a contract for classes to implement.
- It contains abstract methods and static constants. Starting from Java 8, it can also include default and static methods.
- Interfaces support multiple inheritance, enabling classes to inherit behavior from multiple sources without ambiguity.

---

## **When We Can Initialize and When We Cannot**

### **Initialization Allowed:**
1. **Concrete Classes:** Classes that are not abstract can be instantiated using the `new` keyword.
2. **Constructors:** Objects of a class are initialized via its constructor.
3. **Static Initialization:** Static fields or blocks in a class are initialized when the class is loaded.

### **Initialization Not Allowed:**
1. **Abstract Classes:** Abstract classes cannot be instantiated directly; they must be subclassed.
2. **Interfaces:** Interfaces must be implemented by a class to provide concrete behavior before they can be used.
3. **Private Constructors:** Classes with private constructors (e.g., singletons) cannot be instantiated outside their scope.

---

## **Constructor, `super`, `this`, and Annotation**

### **Constructor**
- A constructor is a special member of a class used to initialize objects.
- It shares the class name and has no return type.
- Overloaded constructors provide multiple ways to initialize an object.

### **`super` Keyword**
- Refers to the parent class.
- Used to access parent class constructors, methods, or fields.
- Ensures clarity when parent and child classes have members with the same name.

### **`this` Keyword**
- Refers to the current instance of a class.
- Differentiates between instance variables and parameters with the same name.
- Enables constructor chaining within the same class.

### **Annotations**
- Metadata added to classes, methods, fields, or parameters to provide additional information.
- Common annotations include `@Override`, `@Deprecated`, and `@FunctionalInterface`.
- Custom annotations can be defined for specific use cases.

---

## **Dynamic Method Dispatching**
- Also known as **runtime polymorphism**.
- Determines which method implementation to invoke at runtime based on the actual object type, not the reference type.
- Achieved through method overriding.
- Key to enabling extensibility and flexibility in object-oriented systems. `Parent child = new Child();`


---
