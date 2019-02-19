import java.io.*;
import java.util.*;
import java.lang.*;
public class iterative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the String:");
		String str = sc.next();
		char[] arr = str.toCharArray();
		int j = str.length()-1;
		int i =0;
		while(i<j)
		{
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		String string = new String(arr);
		System.out.println("Reversed:"+string);
	}
}