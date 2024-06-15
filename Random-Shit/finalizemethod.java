class finalizemethod
{
	int i=0;
	int j=0;
	void display()
	{
		System.out.println("i+j = "+(i+j));
	}
protected void finalize()
{
	System.out.println("Finalize method called");
}
public static void main(String args[])
{
	finalizemethod f = new finalizemethod();
	f.display();
	f=null;	
}
}