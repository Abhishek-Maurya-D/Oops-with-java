import java.io.*;
public class full_file_read
{
	public static void main(String[] args)
	{
		try{
			FileInputStream fin = new FileInputStream("C:/Users/Abhishek/OneDrive/Desktop/OOP's Programming/Unit - 2/Input & Output Basics/T1.txt");
			int a1 = fin.read();
			while(a1>=0)
			{
				System.out.print((char)a1);
				a1 = fin.read();
			}
			fin.close();
		}catch(Exception ee)
		{
			System.out.println("There is some error");
		}
	}
}