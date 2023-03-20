package exception.handling;

class BaseClass
{
	BaseClass()
	{
		int a = 10 / 0;
	}
}

class DerivedClass extends BaseClass
{
	DerivedClass() throws Exception
	{
		System.out.println("Arithmetic Exception");
	}
}

public class CatchExceptionByBase 
{
	public static void main(String[] args) throws Exception 
	{
		DerivedClass derivedClass= new DerivedClass();
	}
}
