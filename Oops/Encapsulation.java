package Oops;

public class Encapsulation {
 // Private variables – hidden from outside
  static class Employe{
    private String name;
    private int age;

       // Public setter methods
    public void setName(String name){
      this.name = name;
    }

    public void setAge(int age){
      if (age > 18) {
        this.age = age;
      }
    }

 // Public getter methods
    public String getName(){
      return name;
    }

    public int getAge(){
      return age;
    }
  }
  
  public static void main(String[] args) {
      Employe emp = new Employe();

      emp.setName("Arun");
      emp.setAge(25);

      System.out.println("Name: " + emp.getName());
      System.out.println("Name: " + emp.getAge());
  }
}


/*
 * 
 * ✅ What is Encapsulation in Java?
Encapsulation is an Object-Oriented Programming (OOP) principle where the data (variables) and code (methods) that operate on the data are bundled together into a single unit (class), and the data is kept private to protect it from outside interference.

It helps in:

Data hiding

Improved security

Controlled access via getters/setters

Modular and maintainable code
 * 
 * 
 * 
 * 
 * ✅ Encapsulation in Automation Frameworks
In a Test Automation Framework (especially using Java with Selenium or any other tools), encapsulation is commonly used in the following areas:

1. Page Object Model (POM)
Each page is represented by a class, and the WebElements are made private, while interactions are provided through public methods.

public class LoginPage {

    private WebDriver driver;

    // Private WebElements
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Public methods to interact with the page
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}


Why encapsulation here?

The internal structure (locators) is hidden.

External test classes can't manipulate elements directly.

Cleaner and more maintainable test code.


2. Data Handling Classes
When you read test data from Excel/JSON/DB, encapsulate the fields in a POJO class with private variables and public getters/setters.

public class TestData {
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}


3. Reusable Utility Classes
Encapsulate reusable methods (e.g., wait handling, dropdown selection, reading config files) to abstract away internal logic.

public class WaitUtils {
    private WebDriver driver;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementVisible(By locator, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout))
            .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

✅ Benefits of Using Encapsulation in Automation:
Protects internal structure of classes.

Prevents test code from directly manipulating page elements.

Promotes reusability and modularization.

Improves maintainability and scalability of test framework.


 */