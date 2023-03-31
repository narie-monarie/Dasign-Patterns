public class Main {
  public static void main(String[] args) {
    // Objects are instances of a class that may contain attributes and methods
    // Attributes - Characteristics
    // Methods - Actions the object can perform

    Car myCar = new Car();
    myCar.brake();
  }
}

public class Car {
  // Characteristics
  String make = "Chevrolet";
  String model = "Corvette";
  int year = 2020;
  String color = "blue";
  double price = 50000.00;

  void drive() {
    System.out.println("You Drive the Car");
  }

  void brake() {
    System.out.println("You Stepped on the Brake!");
  }
}
