import java.util.*;
class firstNonRepeating
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// ASCII of z = 122
		// ASCII of Z = 90
		int[] flag = new int[123];
		for(int i =0;i<123;i++)
		{
			flag[i] = 0;// initiallize all array to 0;
		}
		for(int i =0;i<str.length();i++)
		{
			flag[(int)str.charAt(i)]++;
		}
		for(int i = 0;i<str.length();i++)
		{
			if(flag[(int)str.charAt(i)] == 1)
			{
				System.out.print(str.charAt(i));
				break;
			}
		}
	}
}