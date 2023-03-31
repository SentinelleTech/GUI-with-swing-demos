import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DemoGrid2 extends JFrame{

	GridLayout gl;
	JButton btnOne, btnTwo, btnThree, btnFour;

	public DemoGrid2(){
		super("Grid layout in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);

		gl = new GridLayout(2, 2, 30, 30);
		setLayout(gl);

		add(new JTextField());

		btnOne = new JButton("ONE");
		add(btnOne);

		//btnTwo = new JButton("TWO");
		//add(btnTwo);

		btnThree = new JButton("THREE");
		add(btnThree);

		//btnFour = new JButton("FOUR");		
		//add(btnFour);

		add(new JLabel("This is a label"));



		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoGrid2();
	}
	
}