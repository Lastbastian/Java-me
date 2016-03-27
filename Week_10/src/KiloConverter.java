import javax.swing.*;

public class KiloConverter {
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	private final int WINDOW_WIDTH;
	private final int WINDOW_LENGTH;
	
	public KiloConverter()
	{
		setTitle("Kilometer Converter");
		setSize(WINDOW_WIDTH, WINDOW_LENGTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisable(true);
	}
	
	private void buildPanel()
	{
		messageLabel = new JLabel("Enter a distance in kilometers: ");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		panel = new JPanel();
		
	}
	
	public static void main(String[] args)
	{
		new KiloConverter();	
	}
}
