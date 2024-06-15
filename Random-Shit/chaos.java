import java.util.*;
class chaos
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i =0;i<testcases;i++)
		{
			int count = 0;
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] arr2 = new int[n];
			int[] arr3 = new int[n];
			for(int j =0;j<n;j++)
			{
				arr[j] = sc.nextInt();
				arr2[j] = j+1;
				arr3[j] = arr[j] - arr2[j];
			}
			for(int j = 0;j<n;j++)
			{
				if(arr3[j]>0 && arr3[j]<3)
				{
					//System.out.println("arr3["+j+"]="+arr3[j]);
					count = count + arr3[j];
				}
				else if(arr3[j]<=0)
				{
					count = count + 0;
				}
				else {
					System.out.println("Too chaotic");
					count = -1;
					break;
				}
			}
			if(count>=0)
				System.out.println(count);
		}
	}
}