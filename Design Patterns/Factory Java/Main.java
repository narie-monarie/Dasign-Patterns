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

public interface Notification {
  void notifyUser();
}

public class SMSNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending an SMS notification");
  }
}

public class EmailNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending an e-mail notification");
  }
}

public class pushNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending a push notification");
  }
}

public class NotificationFactory {
  public Notification createNotification(String channel) {
    if (channel == null || channel.isEmpty()) {
      return null;
    } else if (channel.equalsIgnoreCase("SMS")) {
      return new SMSNotification();
    } else if (channel.equalsIgnoreCase("EMAIL")) {
      return new EmailNotification();
    } else if (channel.equalsIgnoreCase("PUSH")) {
      return new pushNotification();
    } else {
      return null;
    }
  }
}
