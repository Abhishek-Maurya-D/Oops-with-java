public class class_object
{
	public static void main(String agrs[])
	{
		//Studnet.name="A";
		Student.college="IIMT";
		//Student.f1();
		Student.f2();
		System.out.println();
		Student s1, s2;
		s1 = new Student();
		s2 = new Student();
		Student s3 = new Student();
		s1.name = "Abhishek";
		s2.name = "Sumit";
		s3.name = "Ankur";
		s1.f1();
		s2.f1();
		s3.f1();
		System.out.println();
		s1.name="Abhishek Maurya";
		s1.college="XYZ College";
		s1.f1();
		s2.f1();
		s3.f1();
	}
}
class Student
{
	String name;
	static String college;
	void f1()
	{
		System.out.println(name);
		System.out.println(college);
	}
	static void f2()
	{
		// System.out.println(name);
		System.out.println(college);
	}
}