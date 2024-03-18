import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> largerThan5 = s -> s.length() > 5;
        boolean result = largerThan5.test("Hellooo");
        System.out.println(result);

        Consumer<String> printUppercase = s -> System.out.println(s.toUpperCase());
        printUppercase.accept("hello");
    }

}
