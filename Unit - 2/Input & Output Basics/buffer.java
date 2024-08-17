// Reading from the one file
import java.io.*;
import java.util.*;
public class buffer
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fr = new FileInputStream("line_read_write.java");
			//FileReader fr = new FileReader("16.java");
			InputStreamReader inr = new InputStreamReader(fr);// for the conversion of binary data to text one
			BufferedReader bfr = new BufferedReader(inr);
			String s1 = bfr.readLine();
			String s2 = bfr.readLine();
			String s3 = bfr.readLine();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			fr.close();
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}