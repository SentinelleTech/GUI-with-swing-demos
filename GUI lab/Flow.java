import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;

class Flow extends JPanel{

	JButton btnOne, btnTwo, btnThree;

	public Flow(){

		setBackground(Color.yellow);

		btnOne = new JButton("Button one");
		add(btnOne);

		btnTwo = new JButton("Button two");
		add(btnTwo);

		btnThree = new JButton("Button three");
		add(btnThree);

	}
	
}