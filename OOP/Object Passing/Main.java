public class Main {
  public static void main(String[] args) {
    Garage garage = new Garage();
    Car car = new Car("BMW");
    garage.park(car);
  }
}

public class Car {
  String name;

  Car(String name) {
    this.name = name;
  }
}

public class Garage {
  void park(Car car) {
    System.out.println("The " + car.name + " is parked in the garage");
  }
}
