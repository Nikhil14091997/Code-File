// Time complexity O(n)
import java.util.*;
public class coolest {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
	}
}