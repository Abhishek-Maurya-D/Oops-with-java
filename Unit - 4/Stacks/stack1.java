import java.util.*;
public class stack1
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(100);
		s.push(345.345);
		s.push(35);
		s.push("Hello");
		s.push("Abhishek");
		System.out.println(s);
		System.out.println("Total Items "+s.size());

		// String s1 = s.pop();
		Object s1 = s.pop();
		Object s2 = s.pop();
		Object s3 = s.pop();
		Object s4 = s.pop();
		System.out.println(s);
		System.out.println("Total Items "+s.size());

		String a1 = (String)s1;
		int a2 = (int)s3;
		System.out.print(a1.toUpperCase());
		System.out.println(a2*100);
	}
}
