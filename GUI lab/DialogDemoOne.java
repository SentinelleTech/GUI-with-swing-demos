import javax.swing.JDialog;
import javax.swing.JLabel;

class DialogDemoOne extends JDialog{

	JLabel lbl;

	public DialogDemoOne(){
		setTitle("Dialogs in action");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		lbl = new JLabel("My name is John");

		add(lbl);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogDemoOne();
	}
	
}