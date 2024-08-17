interface A1
{
	void f1();
}
public class Anonymous_Class
{
	public static void main(String[] args)
	{
		 new A1() // Anonymous Class
		 {
			 public void f1()
			 {
				 System.out.println("Abhishek");
			 }
		 }
		 .f1();
	}
}