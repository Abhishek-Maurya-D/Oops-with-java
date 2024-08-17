class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i="+i);
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int j=11; j<=20; j++)
		{
			System.out.println("j="+j);
		}
	}
}
public class thread_demo_
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());
		System.out.println("Starting 1st");
		t1.start();
		System.out.println("Starting 2nd");
		t2.start();
		System.out.println("End of Main");
	}
}