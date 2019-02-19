import javax.swing.*;
public clas ButtonExample
{
	public static void main(string args[])
	{
		Jframe f = new Jframe("Button Example");
		JButton b = new JButton("Click here");
		b.setBounds(50,100,200,200);
		f.add(b);
		f.setSize(400,400);
		f.setVisibility(true);
		f.setLayout(null);
	}
}