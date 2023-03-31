import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

class SplitDemo extends JFrame{

	JPanel panRed, panGreen;
	JSplitPane split;

	public SplitDemo(){
		super("Splitter in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		panRed = new JPanel();
		panRed.setBackground(Color.red);

		panGreen = new JPanel();
		panGreen.setBackground(Color.green);


		split = new JSplitPane();

		split.setLeftComponent(panRed);

		split.setRightComponent(panGreen);

		add(split);

		setVisible(true);
	}

	public static void main(String[] args) {
		new SplitDemo();
	}
	
}