public class Main {
  public static void main(String[] args) {
    var dog = new Dog();
    dog.digHole();
  }
}

public class Animal {
  private String name;
  private String sound;

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
  void bark() {
    System.out.println("It Barks!");
  }

}

public class Dog extends Animal {
  public void digHole() {
    System.out.println("The Dog is digging a hole");
  }
}

public class Bird extends Animal{
  public void fly(){
    System.out.println("The Bird Flies");
  }
}
