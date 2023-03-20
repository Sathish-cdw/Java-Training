package task1;

public class PrimeNumbers
{
	
	public static void prime()
	{
		int i;
		for(i=2;i<=100;i++)
		 {
			 int flag=0;
			 for(int j=2;j<i;j++)
			 {
				 if(i%j==0)
				 {
					 flag=1;
					 break;
				 }
			 }
			 if(flag==0){
				 System.out.print(i+" "); 
			 }
		 }
	}
	public static void main(String[] args)
	{
		 prime();
	}

}
