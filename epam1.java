import java.io.*;
import java.util.*;
import java.math.*;
class epam1
{
	public static HashMap<String,Integer> sortByValue(HashMap<String,Integer> map)
	{
		// create a list from the entry set og HAshMap
		List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entryset());
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>()
		{
			public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i =0;i<n;i++)
		{
			str[i] = sc.next();
		}
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word : str)
		{
			Integer oldcount = map.get(word);
			if(oldcount == null)
			{
				oldcount =  0;
			}
			map.put( word , oldcount + 1);
		}
		for (Map.Entry<String,Integer> entry :map.entrySet())
		{
			System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());
		} 
		HashMap<String,Integer> map2 = sortByValue(map);
		System.out.println("\n Now Sorted:");
		for (Map.Entry<String,Integer> entry :map2.entrySet())
		{
			System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());
		} 
            
	}
}