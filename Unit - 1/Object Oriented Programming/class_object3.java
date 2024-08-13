class Person
{
	void f1()
	{
		System.out.println("Person F1");
	}
	void f2() //Note the changes after commenting this functions
	{
		System.out.println("Person F1");
	}
}
class Student extends Person
{
	void f3()
	{
		System.out.println("Student F3");
	}
	void f2() // function overriding
	{
		System.out.println("Student F2");
	}
}
public class class_object3
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.f1();
		s.f2();
		s.f3();
		Person p = s;
		p.f1();
		p.f2();
		//p.f3();
	}
}