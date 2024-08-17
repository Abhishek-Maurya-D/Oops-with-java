import java.util.*;
public class exception2
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr={23,45,67,78,34,12,47,78};
		int i,a,ans=0;
		System.out.println("Enter Index:");
		try{
			i=sc.nextInt();
			System.out.println("Enter Value:");
			a=sc.nextInt();
			ans=arr[i]/a;
		}catch(Exception ee)
		{
			System.out.println("Some Error Occurred");
		}
		System.out.println("Ans="+ans);
	}
}