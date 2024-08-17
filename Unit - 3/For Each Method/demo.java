// package Unit - 3.For Each Method;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        for(int item: number){
            System.out.println(item*2);
        }
    }
}
