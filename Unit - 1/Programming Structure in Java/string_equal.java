import java.util.Scanner;
public class string_equal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.print("Enter a String: ");
		s1 = sc.nextLine();
		System.out.print("Enter a String: ");
		s2 = sc.nextLine();
		//boolean b = s1.equals(s2);
		//if(b == true)
		//if(b)
		if(s1.equals(s2))
			System.out.println("Same");
		else
			System.out.println("Different");
	}
}