import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the String");
		String str = sc.next();
		/*
			
			. =  Mathches any Single character except new Line 

		*/
		if(str.matches("(.*)(\\d+)(.*)") == true)
			System.out.println("YES");
		else
			System.out.println("No");
	}
}