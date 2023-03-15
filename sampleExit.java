package exception;

public class sampleExit {
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			int x=10/0;
			System.exit(0);
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
	public static void main(String[] args) {
		sample s = new  sample();
		s.mth1();
	}
}
