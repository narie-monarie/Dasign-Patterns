public class Main {
  public static void main(String[] args) {

    // Food[] refrigerator = new Food[3];

    Food food1 = new Food("Pizza");
    Food food2 = new Food("Rice");
    Food food3 = new Food("Beans");

    Food[] refrigerator = { food1, food2, food3 };

    System.out.println(refrigerator[0].name);
  }
}

public class Food {
  String name;

  Food(String name) {
    this.name = name;
  }
}
