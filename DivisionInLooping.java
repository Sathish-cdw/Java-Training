package exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionInLooping
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter numerator");
			String numerator=scanner.next();
			try
			{
				if(numerator.equals("q"))
				{
					break;
				}
				else
				{
					System.out.println("Enter divisor");
					int divisor = scanner.nextInt();
					int x =  Integer.parseInt(numerator)/divisor;
					System.out.println("runned sucessfully " + x);
				}
			}
			catch(InputMismatchException ex)
			{
				System.out.println("enter a number");
				scanner.nextLine();
			}
			catch(Exception e)
			{
				System.out.println("enter a valid input");
			}
			
		}
	}

}
