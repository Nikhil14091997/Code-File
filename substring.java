import java.util.*;
class substring{
	public static int flagBit(String string,String str){
		int flag = -1;
		String buffer = new String();
		outerLoop:
		for(int i =0;i<str.length();i++){
			buffer += string;
			if(buffer.length() == str.length() && buffer.equals(str)){
				flag = 1;
				break outerLoop;
			}
			else{
				flag = 0;
			}
		}
		return flag;
	}
	public static void check(String str){
		int count = 0;
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 1;i<str.length();i++){
			count = count + 1;
			list.add(str.substring(0,i));
		}
		Iterator itr = list.iterator();
		int[] arr = new int[count];
		int i = 0;
		int sum = 0;
		while(itr.hasNext()){
			String string = (String)itr.next();
			arr[i] = flagBit(string,str);
			sum+=arr[i];
		}
		if(sum>0)
			System.out.print("true");
		else
			System.out.print("false");

	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		check(str);
		sc.close();
	}
}