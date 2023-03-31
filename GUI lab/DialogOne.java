import javax.swing.JDialog;

class DialogOne extends JDialog{
	
	public DialogOne(){
		setTitle("Dialogs in action");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setVisible(true);
}

	public static void main(String[] args) {
		DialogOne dialog = new DialogOne();
	}

}