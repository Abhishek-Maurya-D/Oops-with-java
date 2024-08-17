// C:/Users/Abhishek/OneDrive/Desktop/CV.docx
// C:/Users/Abhishek/OneDrive/Desktop/Java/16.java
import java.io.*;
public class file_with_string_read
{
	public static void main(String[] args)
	{
		try{
			FileInputStream fin = new FileInputStream("C:/Users/Abhishek/OneDrive/Desktop/OOP's Programming/Unit - 2/Input & Output Basics/T1.txt");
			int size = fin.available();
			byte[] data = new byte[size];
			fin.read(data);
			String str = new String(data);
			System.out.println(str);
			fin.close();
		}catch(Exception ee)
		{
			System.out.println("There is some error");
		}
	}
}