package Programs.integer;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		
		int num = 2;
		
		boolean flag = false;

		for (int i = 2; i < num; i++) 
		{
			if (num%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if (flag) 
		{
			System.out.println(num+" --> is not a prime number");
		}else {
			System.out.println(num+" --> is a prime number");
		}
	}
}
