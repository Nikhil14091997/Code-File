//strng manipulation
class string1
{
	public static void main(String args[])
	{
	String o1 = "Nikhil";
	String o2 = "Bhavya";
	String o3 = "parul";
	String o4 = "Nikhil";

	System.out.println("length of string 1 is ::"+o1.length());
	System.out.println("character at manipulation::"+o2.charAt(1));

	if(o1.equals(o2))
	{
		System.out.println("String nikhil is equal to string bhavya");

	}
	else
	{
			System.out.println("\n not equal");
	}
	System.out.println(o1+o3);
	System.out.println(o3.indexOf('l'));
}
}
