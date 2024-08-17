import java.util.*;
import java.io.*;
public class Property2{
    public static void main(String[] args){
        try{

            FileReader fr = new FileReader("p1.properties");
            Properties prop = new Properties();
            prop.load(fr);
            for (var entry : prop.entrySet()){
                var key = entry.getKey();
                var s = entry.getValue();
                System.out.println(key+" "+s);
            }
        }catch(Exception ee){

        }
    }
}
