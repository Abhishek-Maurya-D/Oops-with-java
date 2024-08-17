import java.util.*;

public class Property1{
    public static void main(String[] args){
        var prop = System.getProperties();
        for (var entry : prop.entrySet()){
            var key = entry.getKey();
            var s = entry.getValue();
            System.out.println(key+" "+s);
        }
    }
}
