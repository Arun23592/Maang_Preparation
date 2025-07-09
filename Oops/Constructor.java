package Oops;

public class Constructor {

  String model;
  String test;

  //Constructor
  public Constructor(String model, String test){
    this.model = model;
    this.test = test;
  }

  //Method
  public void  showModel(){
    System.out.println("Car :"+ model);
    System.out.println("Testing :"+test);
  }

  
  public static void main(String[] args) {
    Constructor myCar = new Constructor("Honda City", "Regression");
    myCar.showModel();
  }

}



/*
 * 
 * Constructors in Java are used to initialize objects. In automation frameworks, 
 * I use constructors in Page Object Model classes to inject the WebDriver instance. 
 * This helps maintain reusable and clean page object structures. 
 * I’ve also used constructors to pass config paths and test data into utility classes.”
 * 
 * 
 * 
 * Automation:
 * 
 * public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("user")).sendKeys(username);
    }
}

 */