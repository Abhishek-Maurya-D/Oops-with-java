import java.util.*;
public class priority_queue{
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Abhishek");
        queue.add("Maurya");
        queue.add("Hero");
        queue.add("Gentalman");
        queue.add("Done");
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}