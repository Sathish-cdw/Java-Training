package exception.handling;

public class ArithmeticExceptionWithReturn
{
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			int x = 10 / 0;
			return;
		}
		catch(Exception e)
		{
			System.out.println("catch-mth2");
		}
		finally
		{
			System.out.println("finally-mth2");
		}
	}
	public static void main(String[] args)
	{
		ArithmeticExceptionWithReturn  arithmeticExceptionWithReturn = new  ArithmeticExceptionWithReturn();
		arithmeticExceptionWithReturn.mth1();
	}
}
