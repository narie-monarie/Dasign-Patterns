public class Main {
  public static void main(String[] args) {
    // Constructor, special method that is created when an object is created
    Human human = new Human("Monari", 26, 76.8);
    Human human1 = new Human("narie", 21, 56.8);
    System.out.println(human.age);
    System.out.println("The age of " + human1.name + " is " + human1.age);
    human.eat();
  }
}

public class Human {
  String name;
  int age;
  double weight;

  Human(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void eat() {
    System.out.println(this.name + " is eating");
  }
}
