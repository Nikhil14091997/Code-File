import java.util.*;
import java.io.*;
import java.lang.*;
class bujyu1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] arr = new int[N];
		for(int i =0;i<N;i++){
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		//System.out.println("sum:"+sum);
		int q = sc.nextInt();
		for(int i = 0;i<q;i++)
		{
			int ans = 0;
			int quantity = sc.nextInt();
			if(sum<quantity)
			{
				ans = -1;
			}
			else if(sum == quantity)
			{
				ans = arr[N-1];
			}
			else
			{
				if(quantity == 0)
				{
					ans = 0;
				}
				else
				{
					for(int j =0;j<N;j++)
					{
						double dquantity = (double)quantity;
						double dN = (double)N;
						double di = (double)i;
						int temp = (int)Math.ceil(dquantity/(dN-di));
						//System.out.println("temp for quantity:"+quantity+" is = "+temp);
						if(temp == arr[i]){
							ans = temp;
							break;
						}
						else if(temp > arr[i])
						{
							quantity-=arr[i];
							ans = arr[i];
						}
						else
						{
							ans = temp;
							break;
						}
					}
				}
			}
			System.out.println(ans);
			
		}

	}
}