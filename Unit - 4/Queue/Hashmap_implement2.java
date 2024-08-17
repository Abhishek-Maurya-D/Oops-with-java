import java.util.*;
public class Hashmap_implement2{
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("UP","Lucknow");
        map.put("MP","Bhopal");
        map.put("HP","Shimla");
        map.put("UK","Dehradun");
        map.put("HR","Chandigarh");
        map.put("PB","Chandigarh");
        map.put("UP","Noida");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}