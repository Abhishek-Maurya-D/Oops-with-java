import java.util.Scanner;
public class min_in_array
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values:");
		for(int i=0; i<10; i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Values are: ");
		for(int item : x)
		{
			System.out.print(item+" ");
		}
		/*System.out.println("Values are: ");
		for(int i=0; i<10; i++)
		{
			System.out.print(x[i]+" ");
		}*/
		int min=x[0];
		for(int item:x)
		{
			if(min>item)
			{
				min=item;
			}
		}
		System.out.println();
		System.out.println("Minimum value is "+min);
	}
}