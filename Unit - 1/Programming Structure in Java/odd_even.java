import java.util.Scanner;
public class odd_even
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = sc.nextInt();
		if(a%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}