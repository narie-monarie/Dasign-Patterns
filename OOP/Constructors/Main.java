//A  Constructor, initializes a newly created object
public class Main {
  public static void main(String[] args) {
    Human human = new Human("Monari", 26, 76.8);
    Human human1 = new Human("narie", 21, 56.8);
    System.out.println(human.age);
    System.out.println("The age of " + human1.name + " is " + human1.age);
    human.eat();
  }
}
