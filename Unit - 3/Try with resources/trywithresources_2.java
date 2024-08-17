import java.io.*;
public class trywithresources_2{
    public static void main(String[] args) {
        BufferedReader bfr
        try{
            bfr = new BufferedReader(new FileReader("T1.txt"));
            while(true){
                String line = bfr.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch(Exception ee){
            System.out.println(ee);
        }finally{
            if(bfr!=null)
                bfr.close();
        }
    }
}