package MultiThread;

public class DigitalClock {
	public static void main(String[] args) {
		int second = 0;
		int minute = 0;
		int hour = 0;
		while(true)
		{
		System.out.println(hour+":"+minute+":"+second);
		 if(second == 60)
		 {
			 minute += 1;
			 second = 0;
		 }
		 if(minute == 59)
		 {
			 hour += 1;
			 minute = 0;
		 }
		 if(hour == 24)
		 {
			 second = 0;
			 minute = 0;
			 hour = 0;
		 }
		 second++;
		 try {Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
