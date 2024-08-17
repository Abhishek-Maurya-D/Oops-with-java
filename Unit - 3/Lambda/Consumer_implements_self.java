import java.util.*;
import java.util.function.*;

public class Consumer_implements_self{
    public static void main(String[] args){
        List<String> lst = new ArrayList<>();
        lst.add("First");
        lst.add("Second");
        lst.add("Third");
        lst.add("Fourth");
        lst.add("Fifth");
        lst.add("Sixth");
        // Consumer<String> ff = (item)->System.out.println(item);
        // lst.forEach(ff);
        lst.forEach((item)->
        {
            System.out.println(item)
        });
    }
}