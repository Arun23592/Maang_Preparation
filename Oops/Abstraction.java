package Oops;


abstract class  Testing {
  //Abstract method(No implementation)
  public abstract void manual();

  //concrete method
  public void automation(){
    System.out.println("Selenium");
  }

}

class qa extends Testing{
//Implement abstract method
  @Override
  public void manual(){
  System.out.println("Regression Testing");
  }

  
}

public class Abstraction {

     public static void main(String[] args) {
      Testing test = new qa();
      test.manual();
      test.automation();
     }

}




// . Abstraction

// Definition: Hides internal implementation, shows only essential details.

// Usage in Framework:

// TestBase as an abstract class with setup() and abstract launchApp().

// ITestLogger as an interface for logging mechanisms.

// public abstract class TestBase {
//   WebDriver driver;
//   public void setup() { /* driver setup */ }
//   public abstract void launchApp();
// }