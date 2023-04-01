public class Main {
  public static void main(String[] args) {
    // Pattern for implementing undo mechanisms
    var editor = new Editor();
    editor.setContent("a");
    editor.setContent("b");
    editor.setContent("c");

    editor.undo();
  }
}

