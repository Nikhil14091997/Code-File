import java.util.*;
class append
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		for(int i = 0;i<5;i++)
			str+=str2;
		System.out.print(str);
		String buffer = "abbbbb";
		System.out.println("\n BUffer::"+buffer);	
		if(buffer.equals(str))
			System.out.println("MAtch");
		else
			System.out.println(" nOT MAtch");
	}
}