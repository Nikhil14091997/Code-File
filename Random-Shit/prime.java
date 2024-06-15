import java.util.*;
class prime
{
	public static void printPrimes(int n)
	{
		if(n==2)
		{
			System.out.println("2");
		}
		else
		{
			for(int i = 3;i<n/2;i++)
			{
				if(isPrime(i)==true)
				{
					 
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrimes(n);
		sc.close();
	}
}