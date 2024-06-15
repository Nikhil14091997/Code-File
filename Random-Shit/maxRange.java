import java.util.*;
public class maxRange {
	public static void doit(String[] str) {
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		if(sc.hasNext())
			t = sc.nextInt();
		for(int i =0;i<t;i++) {
			int n = sc.nextInt(); // number of operations
			int k = sc.nextInt(); // height of cake required
			String[] str = new String[n];
			for(int j =0;j<str.length;j++) {
				str[j] = sc.nextLine();
			}
			doit(str);
		}
	}
}