class cmdfib
{
	public static long fib(int n)
	{
		int[] fib = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		for(int i =2;i<n;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n-1];
	}
	public static void sum(long result,int n)
	{
		System.out.println(result+n);
	}
	public static void main(String[] args)
	{
		long result = fib(Integer.parseInt(args[0]));
		System.out.println(result);
		sum(result,Integer.parseInt(args[1]));

	}
}