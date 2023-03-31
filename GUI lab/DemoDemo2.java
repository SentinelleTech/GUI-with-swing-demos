import javax.swing.JFrame;

class DemoDemo2 extends JFrame{

	public DemoDemo2(){
		super("This is a frame");
		setSize(700, 300);
		setLocationRelativeTo(null);

		//setBounds(300, 100, 700, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DemoDemo2();
	}

}