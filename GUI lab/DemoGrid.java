import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

class DemoGrid extends JFrame{

	public DemoGrid(){
		super("Grid layout in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		setLayout(new GridLayout(3, 2));

		add(new JButton("ONE"));
		add(new JButton("TWO"));
		add(new JButton("THREE"));
		add(new JButton("FOUR"));
		add(new JButton("FIVE"));
		add(new JButton("SIX"));

		setVisible(true);
	}

	public static void main(String[] args) {
		DemoGrid dg = new DemoGrid();
	}
	
}