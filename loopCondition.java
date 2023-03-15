package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class loopCondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter numerator");
			String numerator=sc.next();
			try
			{
				if(numerator.equals("q"))
				{
					break;
				}
				else
				{
					System.out.println("Enter divisor");
					int divisor=sc.nextInt();
					int x=Integer.parseInt(numerator)/divisor;
					System.out.println("runned sucessfully "+x);
				}
			}
			catch(InputMismatchException ex)
			{
				System.out.println("enter a number");
				sc.nextLine();
			}
			catch(Exception e)
			{
				System.out.println("enter a valid input");
			}
			finally
			{
				sc.close();
			}
			
		}
	}

}
