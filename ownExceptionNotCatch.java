

package exception;


class ValueException extends Exception
{
	String a;
	ValueException(String a)
	{
		super(a);
		
	}
}
public class ownExceptionNotCatch {
	 int a;
	 public ownExceptionNotCatch(int a) {
		this.a=a;
		
	}

	public static void main(String[] args) throws Exception {
			int a=11;
			ownExceptionNotCatch concat = new ownExceptionNotCatch(a);
			concat.validate();
		
	}

	private void validate() throws Exception {
		try
		{
		if(a>10)
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
