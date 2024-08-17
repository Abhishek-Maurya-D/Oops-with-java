public class Anonymous_Class2
{
	public static void main(String[] args)
	{
		System.out.println("A1");
		new Thread()// Anonymous Class
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("Abhishek");
				}
			}
		}
		.start();
		System.out.println("A2");
	}
}