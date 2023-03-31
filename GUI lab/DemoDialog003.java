import javax.swing.JOptionPane;

/*
We have created another message dialog
We also managed to change the default icon displayed on the dialog

*/

class DemoDialog003{

	public DemoDialog003(){

		JOptionPane.showMessageDialog(null, "Operation not allowed", "ERROR", JOptionPane.ERROR_MESSAGE);

	}
	
	public static void main(String[] args) {
		new DemoDialog003();		
	}
}