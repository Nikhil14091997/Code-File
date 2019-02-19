import java.util.*;
public class Normal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean found = false;
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c) == true){
				System.out.println("Yes");
				found = false;
				return;
			}
		}
		System.out.println("No");
		sc.close();
	}
}