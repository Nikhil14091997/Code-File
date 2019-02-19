package p2;

class otherpackage{
	otherpackage()
	{
		p1.protection p = new p1.protection();
System.out.println("different package non sub class constructor");
System.out.println("n_pub = "+p.n_pub);
	}
}