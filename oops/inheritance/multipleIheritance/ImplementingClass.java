package oops.inheritance.multipleIheritance;

public class ImplementingClass implements Interface1, Interface2 {
  public void method1() {
    System.out.println("Method1 from Interface1");
  }

  public void method2() {
    System.out.println("Method2 from Interface2");
  }
  
  public void commonMethod(){
    System.out.println("Common Method");
  }
}
