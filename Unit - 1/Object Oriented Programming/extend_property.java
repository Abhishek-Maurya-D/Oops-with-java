// Super keyword
public  class extend_property
 {
	 public static void main(String[] args)
	 {
		 B b1 = new B();
		 System.out.println();
		 B b2 = new B(45.34);
		 System.out.println();
		 B b3 = new B("Abhishek", 43);
		 System.out.println();
	 }
 }
 class A
 {
	/*A()
 	{
		System.out.println("A1");
	}
	*/
	A(int x)
	{
		System.out.println("A2");
	}
	A(String s)
	{
		System.out.println("A3");
	}
}
class B extends A
{
	B()
	{
		super(43);
		System.out.println("B1");
	}
	B(double a)
	{
		super(43);
		System.out.println("B2");
	}
	B(String s, int a)
	{
		super(s);
		System.out.println("B3");
	}
}