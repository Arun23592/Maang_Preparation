package Oops;

interface A{
   void methodA();
}

interface B{
  void methodB();
}

class C implements A, B{
  public void methodA(){
    System.out.println("Method A from interface A");
  }

  public void methodB(){
    System.out.println("Method B from interface B");
  }
}

public class MultipleInheritance {

  public static void main(String[] args) {
    C obj = new C();   // Create object of class C  
    obj.methodA();    // Call method from Interface A
    obj.methodB();    // Call method from Interface B
  }

}


// Write code to achieve multiple inheritance using interface ?

// In Java, multiple inheritance is not possible with classes due to ambiguity problems (commonly known as the Diamond Problem), 
// but it can be achieved using interfaces. Interfaces allow a class to inherit behavior from multiple sources because Java permits a class to implement multiple interfaces.