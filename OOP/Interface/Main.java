public class Main {

  public static void main(String[] args) {
    // it specifies what a class has/must do
    // classes can apply more than 1 interface while inheritance
    // is limited to one super class

    Rabbit rabbit = new Rabbit("Rangged Rabbit");
    rabbit.flee();
  } 
  
}

public class Rabbit implements Prey {
  String name;

  Rabbit(String name) {
    this.name = name;
  }

  @Override
  public void flee() {
    System.out.println("The " + this.name + " is fleeing");
  }
}

public class Hawk implements Hunter {
  @Override
  public void hunt() {
    System.out.println("The Hawk is hunitng");
  }
}

public interface Hunter {
  void hunt();
}

public interface Prey {
  void flee();
}
