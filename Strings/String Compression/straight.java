import java.io.*;
import java.util.*;
import java.lang.*;
public class straight {
	public static void compressBad(String str){
		String compressed = "";
		int countConsecutive = 0;
		for(int i =0;i<str.length();i++) {
			countConsecutive++;
			if(i+1 >= str.length() || str.charAt(i)!=str.charAt(i+1))
			{
				compressed = compressed + str.charAt(i) + countConsecutive;
				countConsecutive = 0;
			}
		}
		System.out.println("Compressed String :"+compressed);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		compressBad(string);
	}
}