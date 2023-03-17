package exception.handling;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowAnException
{
	public static void main(String[] args)throws Exception
	{
		CustomException.customException();
	}
}

class CustomException
{
	public static void customException() throws Exception
	{
		FileInputStream file = new FileInputStream("dat.txt");
	}
}