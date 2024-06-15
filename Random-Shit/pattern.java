import java.util.*;
class pattern
{
	public static void main(String args[])
    {
     	Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	int mid = n/2;
     	int count = 0;
     	outerloop:
     	for(int i = 0;i<n;i++)
     	{
     		for(int j = 0;j<n;j++)
     		{

     			if(j>=mid-i && j<=mid+i){
					System.out.print("*");
					++count;

     			}
				else
					System.out.print(" ");
				if(count==n)
     				break outerloop;
     		}
     		count = 0;
     		System.out.print("\n");
     	}
    }
}