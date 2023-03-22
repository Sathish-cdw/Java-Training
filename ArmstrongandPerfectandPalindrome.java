package task1;

public class ArmstrongAndPerfectAndPalindrome 
{
	public static void main(String[] args) 
	{
		int number = 151;
		if(isArmstrong(number))
		{
			System.out.println("Armstrong");
		}
		else if(isPerfect(number))
		{
			System.out.println("perfect number");
		}
		 else if(isPalindrome(number))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("none of these");
		}
	}
	
	static boolean isArmstrong(int number)
	{
		int a = number;
		int sum = 0;
		while(number > 0)
		{
			int remainder = number % 10;
			sum += Math.pow(remainder,3);
			number /= 10;
		}
		if(sum == a)
		{
			return true;
		}
		return false;
	}
	
	static boolean isPerfect(int number)
	{
		int x = number;
		int sum = 0;
		for(int i=1;i<=number/2;i++)
		{
			if(number % i == 0)
			{
				sum += i;
			}
		}
		if(sum == x)
		{
			return true;
		}
		return false;
	}
	
	static boolean isPalindrome(int number)
	{
		int sum = 0,a = number;
		while(number > 0)
		{
			int rem = number % 10;
			sum = (sum * 10) + rem;
			number /= 10;
		}
		if(sum == a)
		{
			return true;
		}
		return false;
		
	}
}
