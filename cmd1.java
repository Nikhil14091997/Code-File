class cmd1
{
	public static void main(String args[])
	{
	int nummax=-1;
	int i;
	for(i=0;i<args.length;i++)
	{
		if(nummax<Integer.parseInt(args[i]));
		{
			nummax=args[i];
		}	
	}
System.out.println(nummax);
}
}