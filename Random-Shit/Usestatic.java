// static instance
class Usestatic
{
	static int a = 5;
	static int b;

	static void meth(int x)
	{
		System.out.println("x="+x);
			System.out.println("a="+a);
				System.out.println("b="+b);
					System.out.println("\n");

	}
	static
	{
		System.out.println("\n Static block initialised");
		b=a+2;
	}
	public static void main(String args[])
	{
		meth(55);

	}
}