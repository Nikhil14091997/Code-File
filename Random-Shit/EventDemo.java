//event handeling
// handle an event in a swng programs

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventDemo
{
	JLabel jlb;
	EventDemo()
	{
		JFrame jf = new JFrame("An event example");
		jf.setLayout(new FlowLayout());
		jf.setSize(1000,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// make two buttons 
		JButton b1 = new JButton("button_1");
		JButton b2 = new JButton("button_2");


		// add event handling for button 1 using action listner

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				jlb.setText("Button 1 was pressed");
							}
		
		});
				
		// action listner for button 2
				
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				jlb.setText("button 2 was pressed");
			}
		});

		jf.add(b1);
		jf.add(b2);

		jlb = new JLabel("Press a button ");
		jf.add(jlb);

		jf.setVisible(true);
	}

	public static void main(String args[])
	{
		// create the frame on event dispatching thread
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new EventDemo();
			}
		});
	}
}