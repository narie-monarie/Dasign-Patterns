public class Main {
  public static void main(String[] args) {
    // Overloaded constructors same name but diff parameters
    Pizza pizza = new Pizza("Thicc Crust", "Tomato", "Pineaple Unknown", "Pepperoni");
    Pizza pizza1 = new Pizza("Thicc Crust", "Tomato", "Pineaple Unknown");
  }
}

public class Pizza {
  String bread;
  String sauce;
  String cheese;
  String toppings;

  pizza(String bread,String sauce,String cheese,String toppings){
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.toppings = toppings;
  }

  pizza(String bread,String sauce,String cheese){
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.toppings = toppings;
  }

}
