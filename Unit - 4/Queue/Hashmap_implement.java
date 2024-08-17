import java.util.*;
public class Hashmap_implement{
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("UP","Lucknow");
        map.put("MP","Bhopal");
        map.put("HP","Shimla");
        map.put("UK","Dehradun");
        map.put("HR","Chandigarh");
        map.put("PB","Chandigarh");
        map.put("UP","Noida");
        // Set set = map.entrySet();
        var set = map.entrySet();
        // Iterator itr = set.Iterator();
        var itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}