import java.util.*;
public class TreeMap_implement{  
    public static void main(String[] args){
        Map<String, Integer> map = new TreeMap<>();
        map.put("Second", 2);
        map.put("First", 1);
        map.put("Forth", 4);
        map.put("Third", 3);
        System.out.println("Map using TreeMap : "+ map);

        map.replace("First", 11);
        map.replace("Third", 33);
        System.out.println("New Map: "+map);
        
        int rval = map.remove("First");
        System.out.println("The Removed Value is : "+rval);
    }
}