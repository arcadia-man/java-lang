package oops;

import oops.inheritance.Inheritance;
import oops.polymorphism.PolyMorphism;

public class Demo {
  public static void main(String[] args) {
    PolyMorphism pm = new PolyMorphism();
    pm.polymorphism();

    Inheritance ih = new Inheritance();
    ih.inheritance();
  }
}