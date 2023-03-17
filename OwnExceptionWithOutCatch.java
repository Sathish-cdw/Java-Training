
package exception.handling;


class ValueException extends Exception
{
	String a;
	ValueException(String a)
	{
		super(a);
		
	}
}
public class OwnExceptionWithOutCatch 
{
	 int a;
	 public OwnExceptionWithOutCatch(int a)
	 {
		this.a=a;
	}

	public static void main(String[] args) throws Exception
	{
		int a=1;
		OwnExceptionWithOutCatch checkValue = new OwnExceptionWithOutCatch(a);
		checkValue.validate();
	}
	private void validate() throws Exception
	{
		try
		{
			if (a < 10)
			{
				throw new ValueException("the value is less than 10");
			}
		}
		finally
		{
			System.out.println("it's final");
		}	
	}
}
