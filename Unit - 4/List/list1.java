import java.util.*;
public class list1
{
	public static void main(String[] args)
	{
		LinkedList<String> lst = new LinkedList<>();
		lst.add("A1");
		lst.add("A2");
		lst.add("A3");
		lst.add("A4");
		lst.add("A5");
		lst.add(0,"A6");
		lst.add(0,"A8");
		lst.add(3,"Abhishek");
		lst.add("Maurya");

		System.out.println(lst);
		System.out.println("Total Items: "+lst.size());
		for(int i =0 ; i<lst.size(); i++)
		{
			String a = lst.get(i);
			System.out.print(a+" ");
		}

		lst.set(4,"Abhishek");
		System.out.println();
		for(String item:lst)
		{
			System.out.print(item+" ");
		}

		lst.remove(5);
		lst.remove("Abhishek");
		System.out.println();
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
		{
			String a = itr.next();
			System.out.print(a+" ");
		}
		System.out.println();
		lst.clear();
		System.out.println("Total Elements "+lst.size());
	}
}