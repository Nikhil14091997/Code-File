// time complexity O(n) 
import java.io.*;
import java.util.*;
import java.lang.*;
public class recursive {
	public static void doit(String str) {
		if(str == null || str.length() <= 1)
		{
			System.out.print(str);
			return;
		}
		System.out.print(str.charAt(str.length()-1));
		doit(str.substring(0,str.length()-1));
	
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the String:");
		String str = sc.next();
		doit(str);
	}
}