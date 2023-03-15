package exception;



import java.util.Scanner;

class RangeOutException extends Exception
{
	String a;
	RangeOutException(String a)
	{
		super(a);
		
	}
}
public class rangeNumber {
	 int a;
	 public rangeNumber(int a) {
		this.a=a;
		
	}

	public static void main(String[] args) throws Exception{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			int a = sc.nextInt();
			rangeNumber concat = new rangeNumber(a);
			concat.validate();
		
	}

	private void validate()throws Exception {
		try
		{
		if(  a<0 || a>100)
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
