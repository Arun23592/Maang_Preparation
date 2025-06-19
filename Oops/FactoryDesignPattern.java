package Oops;
//1. create common interface
public interface Notification {
    void notifyUser();
  
}

//2. create concrete implementations
public class EmailNotification implements Notification{
  public void notifyUser(){
    System.out.println("Sending email Notification");
  }
}

public class SMSNotification implements Notification{
  public void notifyUser(){
    System.out.println("Sending SMS Notification");
  }
}

public class PushNotification implements Notification {
  public void notifyUser(){
    System.out.println("Sending Push Notification");
  }

  
}

//3. create a FactoryDesignPattern
public class NotificationFactory{
  public Notification createNotification(String type){
    if (type == null || type.isEmpty()) 
      return null;

    switch (type.toLowerCase()) {
      case "email":
          return new EmailNotification();
      case "sms":
          return new SMSNotification();
      case "push":
          return new PushNotification();
      default:
      throw new IllegalArgumentException("Unknown notification type: " + type); 
    }
  }
}

public class FactoryDesignPattern {
  public static void main(String[] args) {
    NotificationFactory factory = new NotificationFactory();

    Notification notification = factory.createNotification("email");
    notification.notifyUser();
  }

}
