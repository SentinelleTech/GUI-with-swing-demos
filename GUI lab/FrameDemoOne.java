import javax.swing.JFrame;

class FrameDemoOne extends JFrame{

	public FrameDemoOne(){
		super("Frames in action");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		/*
	EXIT_ON_CLOSE
	DISPOSE_ON_CLOSE
	HIDE_ON_CLOSE
	DO_NOTHING_ON_CLOSE
		*/


		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameDemoOne();
	}
	
}