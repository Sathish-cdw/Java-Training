package exception;

import java.util.Scanner;

public class numberFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,count=0;
		while(true)
		{
			try
			{
				
			System.out.println("enter the mark");
			int x = sc.nextInt();
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
			sc.nextLine();
			}
			finally
			{
				sc.close();
			}
			
				
		}
	}
}
