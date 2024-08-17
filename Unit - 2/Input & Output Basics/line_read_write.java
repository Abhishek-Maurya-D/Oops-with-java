// Reading from the one file
import java.io.*;
import java.util.*;
public class line_read_write
{
	public static void main(String[] args)
	{
		try
		{
			InputStreamReader inr = new InputStreamReader(System.in);// for the conversion of binary data to text one
			BufferedReader bfr = new BufferedReader(inr);
			String s1 = bfr.readLine();
			String s2 = bfr.readLine();
			String s3 = bfr.readLine();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}