package exception;

class LessValueException extends Exception
{
	String a;
	LessValueException(String a)
	{
		super(a);
		
	}
}
public class ownException {
	 int a;
	 public ownException(int a) {
		this.a=a;
		
	}

	public static void main(String[] args) {
			int a=11;
			ownException concat = new ownException(a);
			concat.validate();
		
	}

	private void validate() {
		// TODO Auto-generated method stub
		try
		{
		if(a>10)
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
