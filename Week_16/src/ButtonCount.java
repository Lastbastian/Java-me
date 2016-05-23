import javax.swing.*;

import java.awt.event.*;

public class ButtonCount extends JFrame
{
	private JButton button1;
	private JPanel panel;
	
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 70;
	
	 public ButtonCount()
	 {
		 setTitle("Count Button Demon!");
		 setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 button1 = new JButton("Magic Button");
		
		 button1.addActionListener(new ButtonListener());
		 
		 panel = new JPanel();
		 panel.add(button1);
		 
		 add(panel);
		 
		 setVisible(true);
	 }
	 
	 private class ButtonListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			 String actionCommand = e.getActionCommand();
			 int count = 0;
			 
			 if (actionCommand.equals("Button 1"))
			 {
				 count++;
				 JOptionPane.showMessageDialog(null, "You clicked the button! Count = ");
			 }
		 }
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 new ButtonCount();
	 }
}