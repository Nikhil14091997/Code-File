class arguments
{
public static void main(String args[])
 {
 
 int sum=0;  
 int avg=sum/10;          
 
   System.out.println(args[0]);
   System.out.println(args[1]);
   System.out.println(args[2]);
   System.out.println(args[3]);
   System.out.println(args[4]);
   System.out.println(args[5]);
   System.out.println(args[6]);
   System.out.println(args[7]);
   System.out.println(args[8]);
   System.out.println(args[9]);
   System.out.println("the sum of above numbers:");
   for(int i=args.length; i<=10; i++)
     {
 
             sum+=i;
 
             System.out.println(sum);
             System.out.println("Average of 10 numbers:");
         System.out.println(avg);
 
 
     }
 
     }
          }