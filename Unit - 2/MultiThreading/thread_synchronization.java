class Shared
{
	int x = 10;
}
class Thread1 extends Thread
{
	Shared ss;
	Thread1(Shared s)
	{
		ss=s;
	}
	public void run()
	{
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		// Critical Section Start
		synchronized(ss)
		{
			System.out.print("{");
			System.out.print("X = "+ss.x);
			ss.x = ss.x*2;
			System.out.print("X = "+ss.x);
		}
		// Critical Section End
		System.out.println("}");
		System.out.println("A4");
		System.out.println("A5");
		System.out.println("A6");
	}
}
class Thread2 extends Thread
{
	Shared ss;
	Thread2(Shared s)
	{
		ss=s;
	}
	public void run()
	{
		System.out.println("B1");
		System.out.println("B2");
		System.out.println("B3");
		// Critical Section Start
		synchronized(ss)
		{
			System.out.print("[");
			System.out.print("x = "+ss.x);
			ss.x = ss.x+2;
			System.out.print("x = "+ss.x);
		}
		// Critical Section End
		System.out.println("]");
		System.out.println("B4");
		System.out.println("B5");
		System.out.println("B6");
	}
}

public class thread_synchronization
{
	public static void main(String[] args)
	{
		Shared s = new Shared();
		Thread1 t1 = new Thread1(s);
		Thread2 t2 = new Thread2(s);
		t1.start();
		t2.start();
	}
}