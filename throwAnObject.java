package exception;


public class throwAnObject {
	public static void main(String[] args)throws Exception{
		IOException.exception();
	}
}

class IOException
{
	public static void exception() throws Exception
	{
		throw new Exception();
		
	}
}