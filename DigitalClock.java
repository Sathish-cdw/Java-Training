package MultiThread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
	public static void main(String[] args) {
		
		DateTimeFormatter datetTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime localTimenow = LocalDateTime.now();  
		String dateFormat=datetTimeFormat.format(localTimenow);
		String[] dateFormatSplit = dateFormat.split(":");
		int hour = Integer.parseInt(dateFormatSplit[0].strip());
		int minute = Integer.parseInt(dateFormatSplit[1].strip());
		int second = Integer.parseInt(dateFormatSplit[2].strip());
		
		while(true)
		{
		System.out.println(hour + ":" + minute+":" + second);
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
		 try 
		 {
		 	Thread.sleep(1000);
		 }
		 catch(Exception e)
		 {
		 	e.printstackTrace();
		 }
		 
		}
	}
}
