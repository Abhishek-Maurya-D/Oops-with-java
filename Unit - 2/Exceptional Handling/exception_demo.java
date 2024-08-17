import java.util.*;

public class exception_demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("Enter Age");
		age =sc.nextInt();
		if(age<18 || age>=50)
		{
			System.out.println("Invalid Age");
			try{
				throw new InvalidAgeException();
			}catch(InvalidAgeException e){
				System.out.println(e);
			}
		}
		else
		{
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		}
	}
}

class InvalidAgeException extends Exception
{
	public String toString()
	{
		return "InvalidAgeException: Valid Age should be >=18 and <50";
	}
}