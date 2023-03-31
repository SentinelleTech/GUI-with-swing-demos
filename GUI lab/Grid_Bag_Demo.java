import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;

class Grid_Bag_Demo extends JFrame{

	JLabel lbl;
	JTextField txtF;
	JTextArea txtA;
	GridBagLayout gbl;
	GridBagConstraints c;
	Border b;
	JButton btn;

	public Grid_Bag_Demo(){
		super("Button click event");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		gbl = new GridBagLayout();
		setLayout(gbl);
		c = new GridBagConstraints();

		b = BorderFactory.createLineBorder(Color.blue);

		lbl = new JLabel("This is a label");
		lbl.setBorder(b);
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.gridx = 0;
		c.gridy = 0;
		add(lbl, c);

		txtF = new JTextField();
		txtF.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1.0;
		add(txtF, c);

		btn = new JButton("Click me");
		btn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.gridx = 2;
		c.gridy = 0;
		add(btn, c);

		txtA = new JTextArea();
		txtA.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;  
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 3;
		//Insets(int top, int left, int bottom, int right)
		c.insets = new Insets(0, 10, 5, 0);
		add(txtA, c);


		setVisible(true);
	}

	public static void main(String[] args) {
		new Grid_Bag_Demo();
	}
	
}