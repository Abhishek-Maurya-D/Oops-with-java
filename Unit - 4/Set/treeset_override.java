import java.util.*;
class Products implements Comparable
{
	private int pcode;
	private String name;
	private int price;
	Products(int pcode, String name, int price)
	{
		this.pcode = pcode;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return pcode+":"+name+":"+price;
	}
	@Override
	public int compareTo(Object a)
	{
		Products p = (Products)a;
		if(price> p.price)
			return 1;
		else if(price == p.price)
			return 0;
		else
			return -1;
	}
}
public class treeset_override
{
	public static void main(String[] args)
	{
		Products p1 = new Products(12,"Computer",67000);
		Products p2 = new Products(35,"Keyboard",1000);
		Products p3 = new Products(53,"Mouse",600);
		Products p4 = new Products(36,"Moniter",4000);
		Products p5 = new Products(76,"CPU",20000);
		Products p6 = new Products(87,"Pen Drive",900);
		Products p7 = new Products(16,"SSD",4000);
		Products p8 = new Products(56,"HDD",2800);
		System.out.println(p1);
		TreeSet <Products> Ist = new TreeSet<>();
		Ist.add(p1);
		Ist.add(p2);
		Ist.add(p3);
		Ist.add(p4);
		Ist.add(p5);
		Ist.add(p6);
		Ist.add(p7);
		Ist.add(p8);
		for(Products p:Ist)
		{
			System.out.println(p);
		}
	}
}