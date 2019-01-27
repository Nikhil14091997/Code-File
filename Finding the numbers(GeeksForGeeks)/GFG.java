import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    int n = sc.nextInt();
		    int count = 0;
		    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		    for(int i =0;i<(2*n)+2;i++)
		    {
		        int num = sc.nextInt();
		        if(!map.containsKey(num))
		        {
		            count = 1;
		            map.put(num,count);
		        }
		        else
		        {
		            if(map.containsKey(num))
		            {
		                int val = map.get(num);
		                val = val + 1;
		                map.put(num,val);
		            }
		        }
		    }
		    ArrayList<Integer> odds = new ArrayList<Integer>();
		    int firstOdd = -1;
		    for(int i =0;i<=n+1;i++)
		    {
		        firstOdd = firstOdd + 2;
		        odds.add(firstOdd);
		    }
		    ArrayList<Integer> list = new ArrayList<Integer>();
            for(Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if(odds.contains(entry.getValue()))
                {
                    list.add(entry.getKey());
                }
            }
            Collections.sort(list);
            Iterator itr = list.iterator();
            while(itr.hasNext())
            {
                System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
        
	}
}