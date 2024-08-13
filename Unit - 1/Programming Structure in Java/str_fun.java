import java.util.Scanner;
public class str_fun
{
	public static void main(String[] args)
	{
		String s1 = "A quick brown for jumps over the lazy dog";
		int s2 = s1.length();
		String s3 = s1.toUpperCase();
		String s4 = s1.toLowerCase();
		char s5 = s1.charAt(3);
		String s6 = s1.substring(10);
		String s7 = s1.substring(10,22);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}
}