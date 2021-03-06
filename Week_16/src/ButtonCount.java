import javax.swing.*;

import java.awt.event.*;

public class ButtonCount extends JFrame
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel;
	
	private int magicCount = 0;
	private int superCount = 0;
	private int wackyCount = 0;
	
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 70;
	
	 public ButtonCount()
	 {
		 setTitle("Count Button Demon!");
		 setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 button1 = new JButton("Magic Button");
		 button2 = new JButton("Super Button");
		 button3 = new JButton("Wacky Button");
		
		 button1.addActionListener(new ButtonListener());
		 button2.addActionListener(new ButtonListener());
		 button3.addActionListener(new ButtonListener());
		 
		 panel = new JPanel();
		 panel.add(button1);
		 panel.add(button2);
		 panel.add(button3);
		 
		 add(panel);
		 
		 setVisible(true);
	 }
	 
	 private class ButtonListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			 String actionCommand = e.getActionCommand();
	 
			 if (actionCommand.equals("Magic Button"))
			 {
				 magicCount++;
				 JOptionPane.showMessageDialog(null, "You clicked the Magic Button " + magicCount + " time(s)!");
			 }
			 if (actionCommand.equals("Super Button"))
			 {
				 superCount++;
				 JOptionPane.showMessageDialog(null, "You clicked the Super Button " + superCount + " time(s)!");
			 }
			 if (actionCommand.equals("Wacky Button"))
			 {
				 wackyCount++;
				 JOptionPane.showMessageDialog(null, "You clicked the Wacky Button " + wackyCount + " time(s)!");
			 }
		 }
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 new ButtonCount();
	 }
}
