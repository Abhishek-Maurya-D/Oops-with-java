import java.util.Scanner;
public class in_out
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		if (age>=18)
		{
			System.out.println("Eligible for Vote");
		}
		else
		{
			System.out.println("Not eligible for Vote");
		}
	}
}