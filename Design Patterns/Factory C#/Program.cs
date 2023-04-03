using System;

class Program
{
    static void Main(string[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notify notification = notificationFactory.createNotification("SMS");
        notification.notifyUsers();
    }
}

public interface Notify
{
    void notifyUsers();
}

class SMSNotification : Notify
{
    public void notifyUsers()
    {
        Console.WriteLine("SMS Notification Received");
    }
}

class EmailNotification : Notify
{
    public void notifyUsers()
    {
        Console.WriteLine("Email Notification Reached");
    }
}

class NotificationFactory
{
    public Notify createNotification(string channel)
    {
        if (channel == null || channel.Length == 0)
        {
            return null;
        }

        if (channel == "SMS")
        {
            return new SMSNotification();
        }
        else if (channel == "EMAIL")
        {
            return new EmailNotification();
        }
        else
        {
            return null;
        }
    }
}
