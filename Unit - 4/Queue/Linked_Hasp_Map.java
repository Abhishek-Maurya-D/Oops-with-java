import java.util.*;
public class Linked_Hasp_Map{
    public static void main(String[] args){
        Map<String, String> map = new LinkedHashMap<>();
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