package p1;

 class samepackage {
	//int n = 1;
	//private int n_pri = 2;
	//protected int n_pro = 3;
	//public int n_pub = 4;

	samepackage(){

protection p = new protection();
	System.out.println("same package constructor constructor");
	System.out.println("n="+p.n);
	//System.out.println("n_pri="+p.n_pri);
	System.out.println("n_pro="+p.n_pro);
	System.out.println("n_pub="+p.n_pub);
}
}
