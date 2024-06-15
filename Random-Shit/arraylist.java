import java.util.*;
public class arraylist {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int d = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j =0;j<d;j++) {
				list.add(sc.nextInt());
			}
		}
		lists.add(list);
		int q = sc.nextInt();
		for(int i =0;i<q;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ArrayList<Integer> list = lists.get(x-1);
			if(y<=list.size())
				System.out.println(list.get(y-1));
			else
				System.out.println("ERROR!");
		}
		sc.close();
	}
}