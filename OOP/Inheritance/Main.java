public class Main {
  public static void main(String[] args) {
    var textBox = new TextBox();
    textBox.enable();
  }
}

public class UIControl {
  public void enable() {
    System.out.println("Enabled");
  }
}

public class TextBox extends UIControl {

}
