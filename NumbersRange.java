package exception.handling;

import java.util.Scanner;

class RangeOutException extends Exception
{
	String a;
	RangeOutException(String a)
	{
		super(a);
		
	}
}
public class NumbersRange 
{
	 int a;
	 public NumbersRange(int a)
	 {
		this.a = a;
	}
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int a = scanner.nextInt();
		NumbersRange numbersRange = new NumbersRange(a);
		numbersRange.validate();
	}
	private void validate()throws Exception
	{
		try
		{
			if (a < 0 || a > 100)
			{
				throw new RangeOutException("The range is out of index");
			}
			else
			{
				System.out.println("the input is correct range");
			}
		}
		catch(RangeOutException ex)
		{
			System.out.println(ex.getMessage());
		}	
	}
}
