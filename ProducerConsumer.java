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
		es.execute(()->
		{
			Inventory.consumer();
		});
		
		es.execute(()->{
			Inventory.producer();
		});
	}
}

class Inventory
{
	 synchronized public static void producer()
	 {
			System.out.println("The consumer buyed the prroduct");
		
	}
	 
	synchronized public static void consumer()
	{
		System.out.println("The producer produced the product");
	}
}