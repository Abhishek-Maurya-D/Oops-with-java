import java.util.*;
public class exception_final
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {23,45,67,78,34,12,47,78};
		int i, a, ans= 0;
		System.out.println("Enter Index:");
		try
		{
			i = sc.nextInt();
			System.out.println("Enter Value:");
			a = sc.nextInt();
			ans = arr[i]/a;
		}catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("Index should be less than 8");
		}catch(InputMismatchException ee)
		{
			System.out.println("Enter Number Only");
		}finally
		{
			System.out.println("Finally");
		}
		System.out.println("Answer="+ans);
	}
}