import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(); 
    list.add("Hello ");
    list.add("World");
    list.forEach(System.out::print);
   } 
}
