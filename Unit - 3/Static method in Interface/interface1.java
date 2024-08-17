interface A
{
	static void f1()
	{
		System.out.println("Static F1");
	}
	static void f2()
	{
		System.out.println("Static F2");
	}
}
public class interface1
{
	public static void main(String[] args)
	{
		A.f1();
		A.f2();
	}
}