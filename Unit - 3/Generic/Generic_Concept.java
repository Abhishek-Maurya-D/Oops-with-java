// Generic Concept
import java.util.*;
class Mycollection<T>
{
		T x;
}

public class Generic_Concept
{
	public static void main(String[] args)
	{
		Mycollection m1 = new Mycollection();
		Mycollection<String> m2 = new Mycollection<>();
		Mycollection<Integer> m3 = new Mycollection<>();

		/*m1.x = 4;
		System.out.println(m1.x);
		m1.x = "Abhishek";
		System.out.println(m1.x);
		m1.x = 34.34;
		System.out.println(m1.x*2);
		*/
		//m2.x = 45';
		m2.x = "Hello";
		System.out.println(m2.x.toUpperCase());
		//m3.x = "Abhishek";
		m3.x = 445;
	}
}