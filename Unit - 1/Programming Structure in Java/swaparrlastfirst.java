// array swap

import java.util.Scanner;
public class swaparrlastfirst
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i =0 ; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int temp;
		temp = arr[0];
		arr[0] = arr[n-1];
		arr[n-1] = temp;
		System.out.println("The Array is : ");
		for (int i = 0; i<n; i++)
		{
			System.out.println(arr[i] +" ");
		}
	}
}