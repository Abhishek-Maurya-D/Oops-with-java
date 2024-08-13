import java.util.Scanner;
public class table_by_loop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			int b=a*i;
			System.out.println(a+"X"+i+"="+b);
		}
	}
}