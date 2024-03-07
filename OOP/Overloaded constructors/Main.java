public class Main {
  public static void main(String[] args) {
    // Overloaded constructors same name but diff parameters
    Pizza pizza = new Pizza("Thicc Crust", "Tomato", "Pineaple Unknown", "Pepperoni");
    Pizza pizza1 = new Pizza("Thicc Crust", "Tomato", "Pineaple Unknown");
    System.out.println(pizza.bread + pizza1.bread);
  }
}


