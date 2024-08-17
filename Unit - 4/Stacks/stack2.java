import java.util.*;
public class stack2
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		s.push(100);
		s.push(345242);
		s.push(35);
		System.out.println(s);
		System.out.println("Total Items "+s.size());

		int a = s.pop();
		System.out.println(a*100);
	}
}
