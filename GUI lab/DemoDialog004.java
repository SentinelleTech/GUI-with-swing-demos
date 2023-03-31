import javax.swing.JOptionPane;

/*
We have created a confirm dialog
We also managed to change the default buttons displayed

*/

class DemoDialog004{

	public DemoDialog004(){

		JOptionPane.showConfirmDialog(null, "Confirm you want to close", "CONFIRMATION", JOptionPane.YES_NO_OPTION);

	}
	
	public static void main(String[] args) {
		new DemoDialog004();		
	}
}