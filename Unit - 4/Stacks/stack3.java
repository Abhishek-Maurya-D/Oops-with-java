import java.util.*;
public class stack3
{
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<>();
		s.push("Abhishek");
		s.push("Ankur");
		s.push("Raman");
		System.out.println(s);
		System.out.println("Total Items "+s.size());

		while(!s.isEmpty())
		{
			String a = s.pop();
			System.out.println(a);
		}
	}
}
