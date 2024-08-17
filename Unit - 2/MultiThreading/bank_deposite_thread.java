class Customers
{
	int amount=0;
	synchronized void deposit(int amt)
	{
		System.out.println("Initial:"+amount);
		amount=amount+amt;
		System.out.println("After Deposit:"+amount);
		// notify();
	}
	synchronized void withdrawl(int amt)
	{
		// try{
		// 	wait();
		// }catch(Exception ee){}
		System.out.println("Initial:"+amount);
		amount=amount-amt;
		System.out.println("After Withdraw:"+amount);
	}
}
class Thread1 extends Thread
{
	Customers cc;
	Thread1(Customers c)
	{
		cc=c;
	}
	public void run()
	{
		cc.withdrawl(2000);
	}
}
class Thread2 extends Thread
{
	Customers cc;
	Thread2(Customers c)
	{
		cc=c;
	}
	public void run()
	{
		cc.deposit(5000);
	}
}
public class bank_deposite_thread
{
	public static void main(String[] ar)
	{
		Customers c=new Customers();
		Thread1 t1=new Thread1(c);
		Thread2 t2=new Thread2(c);
		t1.start();
		t2.start();
	}
}