import java.util.Scanner;
class Students
{
	String name;
	static String college;
}
public class class_object2
{
	public static void main(String[] args)
	{
		Student s1, s2;
		s1 = new Student();
		s2 = new Student();
		Student s3 = new Student();
		Student.college = "IIMT College of Engineering";
		s1.name = "Rajat";
		s2.name = "Amit";
		s3.name = "Sumit";
		System.out.println(s1.name);
		System.out.println(s1.college);
		System.out.println(s2.name);
		System.out.println(s2.college);
		System.out.println(s3.name);
		System.out.println(s3.college);
	}
}