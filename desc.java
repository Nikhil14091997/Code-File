import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class desc
{
    public static void count(String str , char a)
    {
        long ret = 0;
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                ret++;
            }
        }
        System.out.print(ret);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1 = str;
        long n = sc.nextLong();
        //int len = str.length();
        long rem = n%(str.length());
        long rep = n/(str.length());
        //System.out.print(rem);
        char[] c = str.toCharArray();
        String s = new String();
        for(int i =0;i<rep-1;i++)
        {
            str = str.concat(s1);
        }
        //System.out.println(str);
        for(int i = 0;i<rem;i++)
        {
            s = s.concat(Character.toString(c[i])); 
        }
        //System.out.print(s);
        str = str.concat(s);
        //System.out.println("\n string: "+str);
        count(str,'a');
    }
}