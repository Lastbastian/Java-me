import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorWindow extends JFrame
{
	private JLabel messageLabel;
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private JPanel panel;
	private final int WINDOW_WIDTH = 200;
	private final int WINDOW_HEIGHT = 125;
	
	public ColorWindow(){
		setTitle("Colors");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		messageLabel = new JLabel("Click a button to select a color.");
		
		// Create the three buttons
		redButton = new JButton("Red");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		
		// Register Event listeners
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		yellowButton.addActionListener(new YellowButtonListener());
		
		// Create a panel and add the components to it.
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(redButton);
		panel.add(blueButton);
		panel.add(yellowButton);
		
		// Add the panel to the content pane.
		add(panel);
		
		setVisible(true);
	}
	/**
	 * Private inner class that handles the events when the user click the buttons
	 */
	
	private class RedButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			panel.setBackground(Color.RED);
			messageLabel.setForeground(Color.GREEN);
		}
	}
	
	private class BlueButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			panel.setBackground(Color.BLUE);
			messageLabel.setForeground(Color.PINK);
		}
	}
	
	private class YellowButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			panel.setBackground(Color.YELLOW);
			messageLabel.setForeground(Color.BLACK);
		}
	}
	
	public static void main(String[] args){
		new ColorWindow();
	}
}