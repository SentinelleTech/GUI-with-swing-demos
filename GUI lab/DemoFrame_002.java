import java.awt.Color;

import javax.swing.JFrame;

class DemoFrame_002 extends JFrame {

	Color c;

	public DemoFrame_002(){
		super("Our Title is HERE");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c = new Color(255, 0, 0);

		getContentPane().setBackground(c);

		setVisible(true);
	}

	public static void main(String[] args) {
		DemoFrame_002 df2 = new DemoFrame_002();
	}
	
}