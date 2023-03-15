package exception;


class base
{
	base(){
		int a=10/0;
	}
}

class derived extends base
{
	derived() throws Exception
	{
		System.out.println("Arithmetic Exception");
	}
}

public class derivedBase {
	public static void main(String[] args) throws Exception {
		derived obj= new derived();
		
	}
}
