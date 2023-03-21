package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadDemo
{
	public ThreadDemo()
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{
			Thread thread = Thread.currentThread();
			for(int i=0;i<=100;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even number : "+i);
				}
			}
		});
		
		es.execute(()->{
			Thread thread = Thread.currentThread();
			for(int j=0;j<=100;j++)
			{
				if(j%2!=0)
				{
					System.out.println("Odd Number : "+j);
				}
			}
		});
		es.shutdown();
	}
}

public class EvenAndOdd {
	public static void main(String[] args) {
		new ThreadDemo();
		Thread thread = Thread.currentThread(); 
		
	}
}
