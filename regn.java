import java.util.*;
import java.io.*;
class regn
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] string = sc.nextLine().split(" ");
		String str = "RA1511003030029";
		for(int i =0; i<string.length;i++)
		{
			if(string[i] == str)
			{
				System.out.println("FOUND");

			}
			else
			{
				System.out.println("NOT FOUND");
			}
		}
	}
}