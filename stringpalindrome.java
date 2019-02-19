import java.util.*;
import java.io.*;
public class stringpalindrome
{
    public static void main(String args[])
    {
            String str1,str2;
            Scanner sc = new Scanner(System.in);
            str1 = sc.next();
            int k=0;
            char[] ch = str1.toCharArray();
            int l = ch.length;     
            char[] rev = new char[ch.length];  //char[] rev;
            
            for(int i =l-1;i>=0;i--)           //for(int i=l;i>0;i--)
            {
                rev[k]=ch[i];
                k++;
            }
            int flag=0;
            for(int i=0;i<l;i++)
            {
                if(ch[i]!=rev[i])
                {
                    flag=1;
                    System.out.println("No");
                    break;
                }
            }
            if(flag==0)
                System.out.println("Yes");

    }
}