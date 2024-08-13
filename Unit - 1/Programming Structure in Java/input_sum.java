import java.util.Scanner;
public class input_sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number:");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Sum="+c);
	}
}