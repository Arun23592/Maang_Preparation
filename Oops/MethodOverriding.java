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
