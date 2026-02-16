package Patterns;

class Singleton{
   //1. instance of the class
   private static final Singleton INSTANCE  = new Singleton();

   //2. private constructor to protect/avoid intanstiation/object

   public Singleton(){
     System.out.println("Singleton Instance created");
   }

   //3. provide access to the method
   public static Singleton getInstance(){
    return INSTANCE;
   }
}

public class SingletonPattern {
 
  public static void main(String[] args) {
    Singleton obj1 = new Singleton();
    Singleton obj2 = new Singleton();


    System.out.println(obj1 == obj2);
  }

}
