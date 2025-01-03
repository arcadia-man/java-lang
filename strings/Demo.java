package strings;

public class Demo {
  public void declearString() {
    String name = "Pritam";
    System.out.println(name);

    String age = new String("0595");
    System.out.println(age);

    String[] nameArr = { "pritam", "sai" };
    for (String nam : nameArr) {
      System.out.println(nam);
    }
  }

  public void stringMethods() {
    String name = "Pritam";
    System.out.println(name.toUpperCase() + name.toLowerCase() + name.length() + name.replace('P', 'N'));
  }

  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.declearString();
    demo.stringMethods();
  }

}
