import java.util.Scanner;
public class arrrev
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array are: ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		// for(int i=0; i<(n/2); i++)
		// {
    }
}