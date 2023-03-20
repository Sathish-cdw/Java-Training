package exception.handling;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowAnException
{
	public static void main(String[] args)throws FileNotFoundException
	{
		FileInputStream fileRead = new FileInputStream("dat.txt");
	}
}

