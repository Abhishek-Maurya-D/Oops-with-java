import java.io.*;
public class file_write
{
	public static void main(String[] args)
	{
		try{
			FileOutputStream fout = new FileOutputStream("T2.txt");
			fout.write(65);
			fout.write(66);
			fout.write(67);
			byte[] b = {97,98,99,100,101,102,103,104};
			fout.write(b);
			fout.write(b,2,3);
			fout.close();
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}