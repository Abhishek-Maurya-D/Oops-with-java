// Generic Concept
import java.util.*;
class Mycollection<T>
{
	T[] arr = new T[10];
}

public class Generic_Concept1
{
	public static void main(String[] args)
	{
		Mycollection m = new Mycollection();
		m.arr[0] = 45;
		m.arr[1] = 55.45;
		m.arr[2] = "Abhishek";
		m.arr[3] = 456;
		m.arr[4] = "Fifth Element";
		for(Object item:m.arr)
		{
			System.out.println(item);
		}
	}
}