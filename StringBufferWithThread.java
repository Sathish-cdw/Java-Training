package MultiThread;

public class StringBufferWithThread extends Thread {
	StringBuffer obj;
	public StringBufferWithThread(StringBuffer obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		synchronized(obj) {
			for(int i=0;i<100;i++)
				System.out.print(obj);
			
			System.out.println();
			obj.setCharAt(0,(char)(obj.charAt(0)+1));
		}
	}
	public static void main(String[] args) {
		
		StringBuffer SB = new StringBuffer("A");
		
		StringBufferWithThread object1 = new StringBufferWithThread(SB);
		StringBufferWithThread object2 = new StringBufferWithThread(SB);
		StringBufferWithThread object3 = new StringBufferWithThread(SB);
		
		object1.start();
		object2.start();
		object3.start();
	}
}
