
package truck;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Lorry {

	public static void main(String[] args) {
		int distance,speed;
		LocalDate Date;
		LocalTime Time;
		LocalDateTime dateTime;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Distance:");
			distance = scanner.nextInt();
			
			System.out.println("Speed:");
			speed=scanner.nextInt();
			
//			System.out.println("Starting Date of truck :");
//			Date=LocalDate.parse(sc.next());//2023-03-21
			Date = LocalDate.now();
			
//			System.out.println("Starting time of truck:");
//			Time=LocalTime.parse(sc.next());//11:04:44
			Time = LocalTime.now();
			
			dateTime = LocalDateTime.parse(Date+"T"+Time);
			Destination dest = new Destination(dateTime);
			dest.findArrivalTime(distance,speed);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Destination
{
	int actualTime,remainingTime,holidays,days,currentDayRemaining;
	
	LocalDateTime currentTime = LocalDateTime.now();
	DayOfWeek day = currentTime.getDayOfWeek();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public Destination(LocalDateTime d)
	{
		this.currentTime=currentTime;
	}
	boolean isHoliday(LocalDateTime dt)
	{
		if(dt.getDayOfWeek() == DayOfWeek.SUNDAY
				||(dt.getDayOfWeek() == DayOfWeek.SATURDAY) && (dt.getDayOfMonth() > 7 && dt.getDayOfMonth() <= 15)
				||(dt.getMonthValue() == 1 && dt.getDayOfMonth() == 26)
				||(dt.getMonthValue() == 8 && dt.getDayOfMonth() == 15)
				||(dt.getMonthValue() == 1 && dt.getDayOfMonth() == 1))
				{
					return true;
				}
		return false;
		

	}
	void findArrivalTime(int distance,int speed)
	{
		actualTime = distance / speed;
		remainingTime= actualTime % 8;
		currentDayRemaining = 24 - currentTime.getHour();

		if(remainingTime <= 8 && currentDayRemaining >= remainingTime)
		{
			System.out.println("Starting date : " + currentTime.format(format));
			remainingTime = 0;
		}
		else if(actualTime >= currentDayRemaining)
		{
			System.out.println("Starting date : " + currentTime.format(format));
//			System.out.println("Starting date"+dt.plusDays(1).format(format));
//			remainingTime = remainingTime - currentDayRemaining;
		}
		else
		{
			System.out.println("Starting date :" + currentTime.plusDays(1).format(format));
			currentTime=currentTime.plusDays(1);
		}
		while((actualTime / 8) > days)
		{
			currentTime = currentTime.plusDays(1);
			
			if(isHoliday(currentTime))
			{
				holidays++;
			}
			days++;
		}
		currentTime = currentTime.plusDays(holidays).plusHours(remainingTime);
		
		System.out.println("Arrival date:" + currentTime.format(format));
	}
}