public class thread_sleep
{
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			
			try{
				System.out.println(i);
				Thread.sleep(100);
			}catch(Exception ee){
				System.out.println(ee);
			}
		}
	}
}