import javax.swing.JWindow;
import javax.swing.JButton;

class WindowDemoOne extends JWindow{

	//instance variables
	JButton btn;

	public WindowDemoOne(){
		setSize(500, 500);
		setLocationRelativeTo(null);

		btn = new JButton("Click me Please!");

		add(btn);

		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowDemoOne();
	}
	
}