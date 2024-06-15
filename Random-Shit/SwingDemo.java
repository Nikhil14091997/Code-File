// a simple swing application programm
import javax.swing.*;
class SwingDemo
{
	SwingDemo()
	{


	JFrame jf = new JFrame("A simpple swing application");
	jf.setSize(275,100);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel jlb = new JLabel("SWINGS means powerful GUIs");
	jf.add(jlb);

	jf.setVisible(true);
	}

	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new SwingDemo();
			}
		});
	}
}