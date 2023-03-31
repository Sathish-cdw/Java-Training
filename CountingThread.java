package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread
{
	public static void main(String[] args)
	{
		ExecutorService es = Executors.newFixedThreadPool(1);
		ThreadClass threadClass = new ThreadClass();
		es.execute(()->
		{
			threadClass.thread();
		});
		es.shutdown();
	}
}
class ThreadClass
{
	public void thread()
	{
		int i = 0;
		while(i <= 100)
		{
			System.out.println(++i);
			if(i % 10 == 0)
			{
				System.out.println("you count is currently " + i);
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
