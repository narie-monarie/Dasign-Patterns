import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
   public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(); 
    list.add("Hello ");
    list.add("World");
    list.forEach(System.out::print);

    Employee[] arrayOfEmps = {
    new Employee(1, "Jeff Bezos", 100000.0), 
    new Employee(2, "Bill Gates", 200000.0), 
    new Employee(3, "Mark Zuckerberg", 300000.0),
    };

    Stream.of(arrayOfEmps).forEach(e -> System.out.println(e.getName()));
   } 
}
