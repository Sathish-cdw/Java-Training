package exception.handling;

import java.util.Scanner;

public class FindingAverageInLoop 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int sum=0,count=0;
		while(true)
		{
			try
			{	
				System.out.println("enter the mark");
				int x = scanner.nextInt();
				sum+=x;
				count++;
				if(count==10)
				{
					System.out.println("the avg mark is "+sum/count);
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("enter a number");	
				scanner.nextLine();
			}
	
		}
	}
}

