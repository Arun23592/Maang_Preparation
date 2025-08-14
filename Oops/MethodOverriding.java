package Oops;

class Browser{
  public void launch(){
    System.out.println("Launching genric browser");
  }

  class Chrome extends Browser{
    @Override
    public void launch(){
      System.out.println("Launching chrome browser");
    }
  }
}

public class MethodOverriding {

    public static void main(String[] args) {
      Browser b1 = new Browser();
      b1.launch();

      Browser b2 = new Chrome();
      
    }
}


/*
 * 
 * 
 * 
 * ✅ Where to Use in Automation Framework?
Example Use Cases:

Cross-browser or cross-platform driver setup.

Base class methods like setup(), teardown() overridden in test classes.

Reusable test actions or hooks.

Example in Page Object Model:


public class BaseTest {
    public void launchApp() {
        System.out.println("Launching app in base way...");
    }
}

public class MobileTest extends BaseTest {
    @Override
    public void launchApp() {
        System.out.println("Launching app in mobile mode...");
    }
}

 * 
 * 
 * 
 * 
 */