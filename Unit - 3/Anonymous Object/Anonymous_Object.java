// Anonymous Object
class A1
{
	void f1()
	{
		System.out.println("Hello");
	}
}

public class Anonymous_Object
{
	public static void main(String[] args)
	{
		//A1 a;
		//a = new A1();
		//a.f1();
		new A1().f1();
	}
}