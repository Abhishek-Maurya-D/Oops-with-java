// Default
interface A
{
	void f1();
	default void f2()
	{
		System.out.println("Default function");
	}
}
class B implements A
{
	public void f1()
	{
		System.out.println("B");
	}
}
class C implements A
{
	public void f1()
	{
		System.out.println("C");
	}
}
class D implements A
{
	public void f1()
	{
		System.out.println("D");
	}
}
public class Default_interface
{
	public static void main(String[] args)
	{
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		a1.f1();
		a2.f1();
		a3.f1();
		a1.f2();
		a2.f2();
		a3.f2();
	}
}