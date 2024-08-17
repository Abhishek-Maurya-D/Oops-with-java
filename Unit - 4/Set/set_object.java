class Student
{
	int rollno;
	String name;
	void printDetails()
	{
		System.out.println("Roll No." +rollno);
		System.out.println("Name:"+name);
	}
	void SetDetails(int r, String n)
	{
		rollno=r;
		name=n;
	}
}
public class set_object
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2, s3;
		s2 = new Student();
		s3 = new Student();
		s1.rollno = 45;
		s1.name = "Abhishek";
		s2.rollno = 54;
		s2.name = "Ankit";
		s3.rollno = 46;
		s3.name = "Anubhav";
		//System.out.println(s1.rollno);
		//System.out.println(s1.name);
		s1.SetDetails(345,"Ajay");
		s2.SetDetails(14,"Manoj");
		s3.SetDetails(45,"Ashish");
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
	}
}