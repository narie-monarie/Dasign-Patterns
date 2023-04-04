public class SingleObject {
  // object of SingleObject
  private static SingleObject instance = new SingleObject();

  // Private Constructor so that this class cannot be instanciated
  private SingleObject() {
  }

  // Get the object available
  public static SingleObject getInstance() {
    return instance;
  }

  public void showMessage() {
    System.out.println("Hello People");
  }
}
