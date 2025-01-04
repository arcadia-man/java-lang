package oops.polymorphism;

public class PolyMorphism {
  interface Shape {
    void draw();
  }

  class Circle implements Shape {
    @Override
    public void draw() {
      System.out.println("Drawing a Circle");
    }
  }

  class Rectangle implements Shape {
    @Override
    public void draw() {
      System.out.println("Drawing a Rectangle");
    }
  }

  class Calculator {
    // Overloaded methods - Compile time
    void add(int a, int b) {
      System.out.println(a + b);
    }

    void add(double a, double b) {
      System.out.println(a + b);
    }

    void add(int a, int b, int c) {
      System.out.println(a + b + c);
    }
  }

  public void polymorphism() {
    Calculator calculator;
    Shape shape;

    PolyMorphism pm = new PolyMorphism();

    Circle circle = pm.new Circle();
    circle.draw();

    Rectangle rectangle = pm.new Rectangle();
    rectangle.draw();

    // Can be initialized as parant
    shape = pm.new Circle();
    shape.draw();

    shape = pm.new Rectangle();
    shape.draw();

    calculator = pm.new Calculator();
    calculator.add(998.9, 989.08);
    calculator.add(998, 989);
    calculator.add(45, 55, 53);
  }

}
