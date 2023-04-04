public class Main {
  public static void main(String[] args) {
    var dog = new Dog();
    dog.digHole();
  }
}

public class Animal {
  private String name;
  private String sound;

  public Flys flyingType;

  public getName(){
    return this.name;
  }

  public setName(String name){
    this.name = name;
  }

  public getSound(){
    return this.name;
  }

  public setSound(String name){
    this.name = name;
  }

  // Bad Design pattern because a Bird does not BARK!
  // One class does not need to affect others
  /**
   * void fly() {
   * System.out.println("It Barks!");
   * }
   * 
   **/
  // instead
  public String tryToFly() {
    return flyingType.fly();
  }

  public void setFlyingAbility(Flys newFlyType) {
    flyingType = newFlyType;
  }
}

public interface Flys {
  String fly();
}

class ItFlys implements Flys {
  public String fly() {
    return "Flying High";
  }
}

public class CantFly implements Flys {

  public String fly() {
    return "I cant Fly";
  }
}

public class Dog extends Animal {

  public Dog() {
    super();
    setSound("Bark");
  }

  public void digHole() {
    System.out.println("The Dog is digging a hole");
  }
}

public class Bird extends Animal {
  public void fly() {
    System.out.println("The Bird Flies");
  }
}
