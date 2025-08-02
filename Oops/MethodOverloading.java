package Oops;

public class MethodOverloading {
    public int add(int a, int b){
      return a+b;
    }

    public double add(double a, double b){
      return a + b;
    }

    public int add(int a, int b, int c){
      return a + b + c;
    }
}


/*
 * Another example:
 * 
 * public class LoginPage {

    // Login with username & password
    public void login(String username, String password) {
        System.out.println("Login with username and password");
    }

    // Overloaded: Login with username, password & OTP
    public void login(String username, String password, int otp) {
        System.out.println("Login with username, password, and OTP");
    }
    
    // Overloaded: Login with email
    public void login(String email) {
        System.out.println("Login with email only");
    }
}


 *
 * 
 * ✅ Where to Use in Automation Framework?
Example Use Cases:

Page class methods for different variations of the same action.

click(), click(String locator), click(By locator) in utility/helper classes.

Overloading waitForElement() with different parameters.
 * 
 *  
 * 
 */