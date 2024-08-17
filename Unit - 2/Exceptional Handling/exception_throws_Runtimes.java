import java.util.*;

public class exception_throws_Runtimes
{
	public static void main(String[] args) throws InvalidAgeException
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("Enter Age");
		age =sc.nextInt();
		if(age<18 || age>=50)
		{
			System.out.println("Invalid Age");
			InvalidAgeException ee = new InvalidAgeException();
			throw ee;
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

class InvalidAgeException extends RuntimeException
{
	public String toString()
	{
		return "InvalidAgeException: Valid Age should be >=18 and <50";
	}
}