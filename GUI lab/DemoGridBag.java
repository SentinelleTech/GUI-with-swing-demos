import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DemoGridBag extends JFrame{

	Font f;
	JLabel lblFName, lblLName, lblAge;
	JTextField txtFName, txtLName, txtAge;
	JButton btnSave;
	GridBagConstraints c;
	GridBagLayout gbl;

	public DemoGridBag(){
		super("GridBagLayout in action");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c = new GridBagConstraints();
		gbl = new GridBagLayout();
		setLayout(gbl);

		lblFName = new JLabel("First Name");
		lblFName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 0);
		add(lblFName, c);

		txtFName = new JTextField();
		txtFName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1.0;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtFName, c);

		lblLName = new JLabel("Last Name");
		lblLName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 0);
		add(lblLName, c);

		txtLName = new JTextField();
		txtLName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtLName, c);

		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 0);
		add(lblAge, c);

		txtAge = new JTextField();
		txtAge.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtAge, c);

		btnSave = new JButton("Save");
		f = new Font("Lucida Calligraphy", Font.PLAIN, 30);
		btnSave.setFont(f);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(btnSave, c);




		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoGridBag();
	}
	
}