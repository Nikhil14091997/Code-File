import java.util.*;
import java.io.*;
import java.lang.*;
class art1 {
    public static void doit(Integer[] map,int count,int len) {
        if((len%2)!=0) {
            System.out.println(len-map[count-1]);
            return;
        }
        else
        {
            int perElement = 0;
           for(int j =count;j>0;j--)
           {
                if(len%j==0)
                {
                    perElement = len/j;
                    break;
                }
           }
            int  stack = 0;
            for (int k =0;k<map.length;k++)
            {
                if (map[k] == perElement) 
                {
                    continue;
                } 
                else if (map[k] > perElement) 
                {
                    if (stack - (map[k]-perElement) == 0) 
                        continue;
                    else if (stack - (map[k]-perElement) < 0) 
                    {
                        stack += Math.abs(stack - (map[k]-perElement));
                    } 
                    else 
                    {
                        stack += map[k]-perElement;
                    }
                } 
                else if (map[k] < perElement) 
                {
                    if (stack - (perElement - map[k]) == 0) 
                        continue;
                    else if (stack - (perElement - map[k]) < 0) 
                    {
                        stack += Math.abs(stack - (perElement - map[k]));
                    } 
                    else 
                    {
                        stack += perElement - map[k];
                    }
                }
            }
            System.out.println(stack);   
        }
       
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNext()) {
            t = sc.nextInt();
        }
        for(int j=0;j<t;j++) {
            String str = sc.next();
            int len = str.length(); // Represents the total number of charcters
            int count = 0;          // Represents the distinct characters
            // HashMap contains key value pair of character and their occurences
            Map<Character,Integer> hash = new HashMap<Character,Integer>();
            for(int i =0;i<len;i++) {
                if(!hash.containsKey(str.charAt(i))) {
                    hash.put(str.charAt(i),1);
                    count++;
                }
                else {
                    int val = hash.get(str.charAt(i));
                    hash.put(str.charAt(i),val+1);
                }
            }
            /*
            for(Map.Entry<Character,Integer> entry : hash.entrySet()) {
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }
            */
            Collection<Integer> values = hash.values();
            // Target Array with length of distinct character and hence length can never go beyond count
            Integer[] targetArray = values.toArray(new Integer[values.size()]);
            Arrays.sort(targetArray);
            /*
            for(int tar =0;tar<targetArray.length;tar++) {
                System.out.println(targetArray[tar]);
            }
            */
            doit(targetArray,count,len);
        }
    }
}
