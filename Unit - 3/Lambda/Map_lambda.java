import java.util.HashMap;
import java.util.Map;

public class Map_lambda {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Abhishek", 21);
        ages.put("Ankur", 19);
        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
    }
}