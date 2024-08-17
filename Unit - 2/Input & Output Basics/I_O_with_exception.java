import java.io.*;
public class I_O_with_exception
{
	public static void main(String[] args)
	{
		try{
			FileInputStream f1 = new FileInputStream("C:/Users/Abhishek/OneDrive/Desktop/Java/T1.txt");
			int a1 = f1.read();
			int a2 = f1.read();
			int a3 = f1.read();
			f1.skip(5);
			byte[] b = new byte[4];
			f1.read(b);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(b[0]);
			System.out.println(b[1]);
			System.out.println(b[2]);
			System.out.println(b[3]);
			int a4 = f1.available();
			System.out.println("Remaining: "+a4);
			f1.close();
		}catch(Exception ee)
		{
			System.out.println("There is some error");
		}
	}
}