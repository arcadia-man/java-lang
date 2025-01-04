package oops.inheritance;

public class Inheritance {
  public void demoSingleInheritance() {
    oops.inheritance.singleInheritance.Child child = new oops.inheritance.singleInheritance.Child();
    child.display();
    child.show();
  }

  public void demoMultilevelInheritance() {
    oops.inheritance.mulilevelInheritance.Child child = new oops.inheritance.mulilevelInheritance.Child();
    child.grandparentMethod();
    child.parentMethod();
    child.childMethod();
  }

  public void demoHierarchicalInheritance() {
    oops.inheritance.hierarchical.Child1 child1 = new oops.inheritance.hierarchical.Child1();
    oops.inheritance.hierarchical.Child2 child2 = new oops.inheritance.hierarchical.Child2();
    child1.commonMethod();
    child1.child1Method();
    child2.commonMethod();
    child2.child2Method();
  }

  public void demoMultipleInheritance() {
    oops.inheritance.multipleIheritance.ImplementingClass obj = new oops.inheritance.multipleIheritance.ImplementingClass();
    obj.method1();
    obj.method2();
  }

  public void demoHybridInheritance() {
    oops.inheritance.hybrid.ImplementingClass obj = new oops.inheritance.hybrid.ImplementingClass();
    obj.method1();
    obj.method2();
    obj.combinedMethod();

  }
  
  public void inheritance(){
    main(null);
  }

  public static void main(String[] args) {
    Inheritance ih = new Inheritance();
    ih.demoSingleInheritance();
    ih.demoMultilevelInheritance();
    ih.demoHierarchicalInheritance();
    ih.demoMultipleInheritance();
    ih.demoHybridInheritance();
  }
}
