import java.io.*;
public class trywithresources_1{
    public static void main(String[] args) {
        try{
            BufferedReader bfr = new BufferedReader(new FileReader("T1.txt"));
            while(true){
                String line = bfr.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            bfr.close();
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
}