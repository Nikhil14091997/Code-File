import java.util.*;
class frequency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		Set<Character> s = new HashSet<Character>();
		for(int i =0;i<ch.length;i++){
			s.add(ch[i]);
			list.add(ch[i]);
		}
		int size = s.size();
		Iterator<Character> itr = s.iterator();
		while(itr.hasNext()){
			char c = itr.next();
			System.out.print(c+""+Collections.frequency(list,c));
		}
	}
}