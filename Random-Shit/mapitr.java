import java.util.*;
class mapitr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter data::");
		int str1 = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1,10);
		map.put(2,20);
		map.put(3,30);
		map.put(4,40);
		for(Integer i : map.keySet())
		{
			//System.out.println("For index = "+i+" value is = "+map.get(i));
			Integer str = map.get(i);
			//System.out.println(str);
			if(str==(str1))
			{
				System.out.println(i);
				break;
			}	 
		}
	}
}