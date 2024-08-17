import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek", "Maurya", "Don");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        Runnable r = () -> {
            System.out.println("This is lambda Expression.");
        };

        Thread t = new Thread(() -> {
            System.out.println("This is a lambda running in a thread.");
        });

        t.start();
    }
}
