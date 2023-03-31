public class Main {
  public static void main(String[] args) {
    // Objects are instances of a class that may contain attributes and methods
    // Attributes - Characteristics
    // Methods - Actions the object can perform

    Car myCar = new Car();
    myCar.brake();
    System.out.println(myCar.model);
    System.out.println(myCar.price);
    System.out.println(myCar.toString());
  }
}

public class Car {
  // Characteristics
  String make = "Chevrolet";
  String model = "Corvette";
  int year = 2020;
  String color = "blue";
  double price = 50000.00;

  // Methods
  void drive() {
    System.out.println("You Drive the Car");
  }

  void brake() {
    System.out.println("You Stepped on the Brake!");
  }

  public String toString() {
    String myString = make + "\n" + model + "\n" + color + "\n" + year;
    return myString;
  }
}
