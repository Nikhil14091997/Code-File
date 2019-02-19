import java.util.*;
class patternFinal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = (2 +(n-1)*2)-1;
		int mid = m/2;
		outerloop:
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				if(j>=mid-i && j<=mid+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}