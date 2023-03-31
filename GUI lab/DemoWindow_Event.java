import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

class DemoWindow_Event extends JFrame implements WindowListener{

	JButton btnOne, btnTwo, btnThree;
	Box b;

	public DemoWindow_Event(){
		super("WindowListener in action");
		setSize(600, 400);
		setLocationRelativeTo(null);
		
		addWindowListener(this);

		setVisible(true);
	}

	public void createUI(){

		b = Box.createVerticalBox();

		btnOne = new JButton("ONE");
		b.add(btnOne);

		btnTwo = new JButton("TWO");
		b.add(btnTwo);

		btnThree = new JButton("THREE");
		b.add(btnThree);

		add(b, BorderLayout.WEST);

	}


	public static void main(String[] args) {
		new DemoWindow_Event();
	}
	

	public void windowOpened(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
 	public void windowDeiconified(WindowEvent we) {}
 	public void windowDeactivated(WindowEvent we) {}

 	public void windowActivated(WindowEvent we) {
 		createUI();
 	}
 	

 	public void windowClosing(WindowEvent we) {

 		int opt = JOptionPane.showConfirmDialog(this, "Confirm you want to close the application");

 		if(opt == 0){
 			System.exit(1);
 		}
 	}
}