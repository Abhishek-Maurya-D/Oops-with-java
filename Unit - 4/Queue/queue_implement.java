import java.util.*;
public class queue_implement{
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}