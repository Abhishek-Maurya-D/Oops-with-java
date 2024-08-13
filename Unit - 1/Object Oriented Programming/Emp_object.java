class Emp
{
	int E_id;
	String name;
	String department;
	Emp(String nm)
	{
		name = nm;
	}
	Emp(int id, String nm)
	{
		name = nm;
		E_id = id;
	}
}
public class Emp_object
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp("Ravi");
		Emp e2 = new Emp(67,"Ankit");
		System.out.println(e1.E_id);
		System.out.println(e1.name);
		System.out.println(e2.E_id);
		System.out.println(e2.name);
	}
}