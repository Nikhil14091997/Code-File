import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TBday{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long testcases = sc.nextLong();
		for(long i = 0;i<testcases;i++){
			long b =  sc.nextLong();
			long w =sc.nextLong();
			long x = sc.nextLong();
			long y = sc.nextLong();
			long z =sc.nextLong();
			System.out.println((long)Math.min(y+z, x)*b +(long)Math.min(x+z,y)*w);
		}
	}
}