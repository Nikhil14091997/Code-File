class day
{
	int date;
	int month;
	int year;
	public static void main(String args[])
	{
		String m ;


	date = Integer.parseint(args[0]);
	month = Integer.parseint(args[1]);
	year = Integer.parseint(args[2]);
	if(month>12)
		System.out.println("\n Invalid month");
	if((year%4)==0)
		System.out.println("\n You are in a leap year");
	//if(month==1)

	{
		//m = (String)month;
		//m='january';
	}
		

	}
}