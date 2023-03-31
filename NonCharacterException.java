package MultiThread;

import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonCharacterException {
	static int count =0;
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(1);
		CharacterCheck characterCheck = new CharacterCheck();
		es.execute(()->{
			try {
				characterCheck.checkSource();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		});
		
	}
}

class CharacterCheck
{
	public void  checkSource() throws Exception
	{
		Scanner scanner =  new Scanner(System.in);
		while(true)
		{
			System.out.println("enter a char");
			char a = scanner.next().charAt(0);
			if(!Character.isAlphabetic(a))
			{
				throw new Exception("the count character entered is " + NonCharacterException.count);
			}
			else
			{
				NonCharacterException.count++;
			}
		}
		
	}

	
}