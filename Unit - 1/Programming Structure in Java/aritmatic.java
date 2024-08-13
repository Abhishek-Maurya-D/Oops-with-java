import java.util.Scanner;
public class aritmatic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		System.out.println("Submittion is: "+sum);
		System.out.println("Subtraction is: "+sub);
		System.out.println("Multiplication is: "+mul);
		System.out.println("Division is: "+div);
	}
}