class C1
{
	C11 c = new C11();
	//C14 d = new C14();
	C13 d = new C13();
	class C11
	{
		void f1()
		{
			System.out.println("F1 in C11");
		}
	}
	class C12
	{
	}
	class C13
	{
		class C14
		{
		}
	}
}
class C2
{
	void f1()
	{
		class C21
		{
		}
	}
}
public class class_to_class_calling
{
	public static void main(String[] args)
	{
		C1 c = new C1();
		C1.C11 m = c.new C11();
		m.f1();
		// c.C11 m = new c.C11();
		//C1.C11 a = new C1.C11();
	}
}