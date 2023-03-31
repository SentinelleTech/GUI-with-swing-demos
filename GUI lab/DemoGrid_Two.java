import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

class DemoGrid_Two extends JFrame{

	JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
	btnSeven, btnEight, btnNine;
	GridLayout gl;

	public DemoGrid_Two(){
		super("GridLayout in action");
		setSize(500, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		gl = new GridLayout();
		setLayout(gl);

		btnOne = new JButton("Button one");
		add(btnOne);

		btnTwo = new JButton("Button two");
		add(btnTwo);

		btnThree = new JButton("Button three");
		add(btnThree);

		btnFour = new JButton("Button four");
		add(btnFour);

		btnFive = new JButton("Button five");
		add(btnFive);

		btnSix = new JButton("Button six");
		add(btnSix);

		btnSeven = new JButton("Button seven");
		add(btnSeven);

		btnEight = new JButton("Button eight");
		add(btnEight);

		btnNine = new JButton("Button nine");
		add(btnNine);


		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoGrid_Two();
	}
	
}