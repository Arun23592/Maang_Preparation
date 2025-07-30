package Oops;

// Step 1: Define the Interface
interface Testing{
  void manual();
  void automated();
}
// Step 2: Implement the Interface
class  Regression implements Testing{
  public void manual(){
    System.out.println("Manual test executed");
  }

  public void automated(){
    System.out.println("Automated test executed");
  }
}

// Step 3: Use It 
public class Interface {

  public static void main(String[] args) {
    Testing test = new Regression();
    test.manual();
    test.automated();
  }

}


/*
 * Interface:
 * An interface is like a contract that defines a set of methods that a class must implement.
 * it only contains method signatures(no method bodies), and the implementing class provide tha actual logic.
 * 
 * Think of its blueprint: if you build a car, it must have start(), stop() and accelarate() method.
 * 
 * 
 * 
 * Automation:
 * public interface LoginPage{
 *    void enterUsername(String username);
 *    void enterPassWord(String password);
 *    void clickLogin();
 * }
 * 
 * public class DesktopLogin implements LoginPage{
 *    public void enterUsername(String username){
 *      //selenium code
 * }
 * 
 *    public void enterPassword(String password){
 *      //selenium code
 * }
 * 
 *    public void clickLogin(){
 *      //selenium code
 * }
 * }
 * 
 */