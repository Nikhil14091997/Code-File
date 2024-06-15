import java.util.*;
class lcm
{
	public static int calculateLCM(int[] arr)
	{
		int lcm = 1;
		int result = 1;
		for(int i =1;i<arr.length;i++)
		{
			int number1 = arr[i];
			int number2 = arr[i-1];
			lcm = (number1>number2) ? number2:number1 ;
			while(true)
			{
				if(lcm%number1 == 0 && lcm%number2 == 0)
				{
					result = lcm;
					break;
				}
				++lcm;
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int result = calculateLCM(arr);
		System.out.println("LCM:"+result);
	}
}