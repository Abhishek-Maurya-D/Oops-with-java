import java.util.*;
public class hash
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Fourth");
		hs.add("Fifth");
		hs.add("First");
		hs.add("Last");
		// hs.add(0,"Second-Last");
		System.out.println(hs);
		System.out.println("Total Items : "+ hs.size());


		System.out.println();
//		for(int i = 0; i<hs.size(); i++)
//		{
//			String s = hs.get(i);
//			System.out.println(s);
//		}
		for(String item:hs)
		{
			System.out.print(item+ " ");
		}


		System.out.println();
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.print(s+ " ");
		}


		System.out.println();
		hs.remove("Third");
		System.out.println(hs);
	}
}