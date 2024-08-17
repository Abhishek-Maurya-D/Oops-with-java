import java.io.*;
import java.util.Scanner;
public class file_in_out_other
{
	public static void main(String[] args)
	{
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Source File: ");
			String src = sc.nextLine();
			System.out.println("Destination File: ");
			String dstn = sc.nextLine();
			FileInputStream fin = new FileInputStream(src);
			int size = fin.available();
			byte[] data = new byte[size];
			fin.read(data);
			fin.close();
			FileOutputStream fout = new FileOutputStream(dstn);
			fout.write(data);
			fout.close();
			System.out.println("Done");
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}