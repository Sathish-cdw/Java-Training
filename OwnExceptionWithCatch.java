package exception.handling;

class LessValueException extends Exception
{
	String a;
	LessValueException(String a)
	{
		super(a);
	}
}
public class OwnExceptionWithCatch
{
	 int a;
	 public OwnExceptionWithCatch(int a) 
	 {
		this.a = a;
		
	}
	public static void main(String[] args) 
	{
		int a = 8;
		OwnExceptionWithCatch checkValue = new OwnExceptionWithCatch(a);
		checkValue.validate();
	}
	public void validate() 
	{
		try
		{
			if (a < 10)
			{
				throw new LessValueException("the value is less than 10");
			}
		}
		catch(LessValueException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("it's final");
		}
	}
}
