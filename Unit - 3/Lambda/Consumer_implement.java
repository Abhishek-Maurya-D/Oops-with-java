import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_implement{
    public static void main(String[] agrs){
        List<String> names = Arrays.asList("UP", "Delhi", "MP");

        Consumer<String> ff = name->System.out.println(name);
        names.forEach(ff);
    }
}