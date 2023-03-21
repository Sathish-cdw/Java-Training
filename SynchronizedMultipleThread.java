package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SynchronizedThread
{
	synchronized public void hello()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("[-----hello-----]");
		}
	}
	synchronized public void welcome()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("[-----welcome-----]");
		}
	}
	synchronized public void thanks()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("[-----Thankyou-----]");
		}
	}
}
public class SynchronizedMultipleThread {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		SynchronizedThread synchronizedThread = new SynchronizedThread();
		es.execute(()->{
			synchronizedThread.hello();
		});
		es.execute(()->{
			synchronizedThread.welcome();
		});
		es.execute(()->{
			synchronizedThread.thanks();
		});
		es.shutdown();
		
	}
}
