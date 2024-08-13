// Final Keyword explaination
final class A
{
}
//class B extends A
//{
//}
class C
{
	void f1()
	{
	}
	final void f2()
	{
	}
}
class D extends C
{
	void f1()
	{
	}
	//void f2()
	//{
	//}
}
public class final1
{
	public static void main(String[] args)
	{
		final int x = 45;
		//x = 45;
		System.out.println(x);
	}
}