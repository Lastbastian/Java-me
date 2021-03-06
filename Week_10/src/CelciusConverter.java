import javax.swing.*;
import java.awt.event.*;

public class CelciusConverter extends JFrame {
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField celciusTextField;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 100;
	
	public CelciusConverter()
	{
		setTitle("Celcius Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}

	private void buildPanel()
	{
		messageLabel = new JLabel("Enter a temperature in celcius: ");
		celciusTextField = new JTextField(10);
		
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalcButtonListener());
		
		
		panel = new JPanel();
		
		panel.add(messageLabel);
		panel.add(celciusTextField);
		panel.add(calcButton);
	}	
	
	/**
	   CalcButtonListener is an action listener class for
	   the Calculate button.
	*/
	
	private class CalcButtonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			final double CONVERSION = 1.8;
			String input;
			double celcius;
			
			input = celciusTextField.getText();
			celcius = Double.parseDouble(input) * CONVERSION + 32;
			
			JOptionPane.showMessageDialog(null, input + " degrees celcius is " + celcius + " farenheit degrees.");
		}
		
	}
	
	public static void main(String[] args)
	{
		new CelciusConverter();	
	}
}
