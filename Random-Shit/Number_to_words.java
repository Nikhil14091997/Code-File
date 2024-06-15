import java.util.*;

class Number_to_words
{
	public static void main(String args[])
	{
		String ones[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String teen[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String h="Hundred";
		String t="Thousand";

		int n,i,y,w,x,v,u,z,p,m;
		String d=null,c=null,b=null,a=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number- ");
		n=s.nextInt();

		if(n<10)
		{
			for(i=1;i<=n;i++)
			{
				a=ones[i];
			}
			System.out.println("In Words- "+a);
		}
		else if(n>=10 && n<20)
		{
			y=n%10;
			for(i=0;i<=y;i++)
			{
				a=teen[i];
			}
			System.out.println("In Words- "+a);
		}
		else if(n>=20 && n<100)
		{
			y=n%10;
			for(i=1;i<=y;i++)
			{
				a=ones[i];
			}
			z=n-y;
			w=z/10;
			for(i=2;i<=w;i++)
			{
				b=tens[i];
			}
			System.out.println("In Words- "+b+"-"+a);
		}
		else if(n>=100 && n<1000)
		{
			x=n%100;
			y=x%10;
			for(i=1;i<=y;i++)
			{
				a=ones[i];
			}
			z=x-y;
			w=z/10;
			for(i=0;i<=w;i++)
			{
				b=tens[i];
			}
			v=n/100;
			for(i=1;i<=v;i++)
			{
				c=ones[i];
			}
			System.out.println("In words- "+c+" "+h+" "+b+"-"+a);
		}




		else if(n>=1000 && n<10000)
		{
			p=n/1000;
			u=n%1000;
			x=u%100;
			y=x%10;

			if(u==0 && x==0 && y==0 && (n/1000)==p)
			{

							for(i=1;i<=p;i++)
							{
								d=ones[i];
							}
			System.out.println("In words- "+d+" "+t);
			}

			else if(x==0 && y==0 && (n/1000)==p)
			{

				m=u-x;
				v=m/100;
				for(i=1;i<=v;i++)
				{
					c=ones[i];
				}
				p=n/1000;
				for(i=1;i<=p;i++)
				{
					d=ones[i];
				}

			System.out.println("In Words- "+d+" "+t+" "+c+" "+h);
			}

			else if(x==0 && (n/1000)==p)
			{
				for(i=1;i<=y;i++)
				{
					a=ones[i];
				}
				p=n/1000;
				for(i=1;i<=p;i++)
				{
					d=ones[i];
				}

			System.out.println("In Words- "+d+" "+t+" "+a);
			}

			else
			{
				for(i=1;i<=y;i++)
				{
					a=ones[i];
				}
				z=x-y;
				w=z/10;
				for(i=0;i<=w;i++)
				{
					b=tens[i];
				}
				m=u-x;
				v=m/100;
				for(i=1;i<=v;i++)
					{
					c=ones[i];
					}
				p=n/1000;
				for(i=1;i<=p;i++)
				{
					d=ones[i];
				}

				System.out.println("In Words- "+d+" "+t+" "+c+" "+h+" "+b+"-"+a);
			}
		}
	}
}