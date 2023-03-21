package MultiThread;

public class ThreadStart implements Runnable {
 
	public static void main(String[] args) {
		ThreadStart threadStart = new ThreadStart();
		Thread thread = new Thread(threadStart);
		thread.start();
		System.out.println("Thread was started");
		thread.start();
		System.out.println("Thread was started once again");
		
	}
	
	public void run() {
		
	}

}
