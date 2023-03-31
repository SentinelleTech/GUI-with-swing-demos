import javax.swing.JFrame;

class DemoFrame002 extends JFrame{

	public DemoFrame002(){
		super("My Title");

		//setBounds(x, y, width, height);
		//setBounds(100, 50, 400, 300);

		setSize(400, 200);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);


		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoFrame002();
	}

}