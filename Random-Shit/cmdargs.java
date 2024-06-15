class cmdargs
{
	public static void sum(String a, String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		
			
			System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
			sum(args[0],args[1]);
	}
}