package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumer
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		Inventory inventory = new Inventory();
		es.execute(()->{
			for(int i=0;i<5;i++)
			{
				try {
					inventory.producer();
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		es.execute(()->
		{
			for(int i=0;i<5;i++)
			{
				try {
					inventory.consumer();
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		es.shutdown();
	}
}
class Inventory
{	
	boolean flag ;
	int value = 0;
	synchronized public void consumer() throws InterruptedException
	{
		if(!flag)
		{
			try 
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("The consumer buyed the product ");
		flag = false;
		notify();
	}
	synchronized public void producer() throws InterruptedException 
	 {
		if(flag)
		{
			try 
			{
				wait();
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("The producer produced the product ");
		flag = true;
		notify();	
	}
}
