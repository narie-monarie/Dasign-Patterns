// It is a Creational Design pattern
// Define an interface on an abstract Class for creating an object and
// let the subclasses choose which class to instanciate

public class Main {
  public static void main(String[] args) {
    var notificationFactory = new NotificationFactory();
    Notification notification = notificationFactory.createNotification("SMS");
    notification.notifyUser();
  }
}