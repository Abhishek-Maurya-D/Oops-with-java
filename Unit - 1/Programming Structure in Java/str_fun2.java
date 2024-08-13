import java.util.Scanner;
public class str_fun2
{
	public static void main(String[] args)
	{
		String s1="A quick brown fox jumps over the lazy dog";
		int p1 = s1.indexOf("fox");
		int p2 = s1.indexOf("tiger");
		int p3 = s1.indexOf("o");
		int p4 = s1.indexOf("o",17);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}