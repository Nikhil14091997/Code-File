abstract class A
{
	abstract void callme();

	void callmetoo()
	{
		System.out.println("this is concrete method ");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("this is B's imlplementation of callme");
	}

}
class AbstratctDemo
{
	public static void main(String args[])
	{
		B b = new B();
		b.callme();
		b.callmetoo();
	}
}