import javax.swing.JWindow;

class WindowOne extends JWindow{

	public WindowOne(){
		setSize(700, 500);
		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {
		new WindowOne();
	}

}