import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class RegistrationForm extends JFrame implements ActionListener{

	JLabel lblAdm, lblFName, lblLName;
	JTextField txtAdm, txtFName, txtLName;
	GridBagLayout gbl;
	GridBagConstraints c;
	JButton btnSave;
	String []data = new String[3];

	public RegistrationForm(){
		super("Register");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		gbl = new GridBagLayout();
		setLayout(gbl);
		c = new GridBagConstraints();

		lblAdm = new JLabel("Admission Number");
		lblAdm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		//Insets(int top, int left, int bottom, int right)
		c.insets = new Insets(10, 10, 10, 10);
		add(lblAdm, c);

		txtAdm = new JTextField();
		txtAdm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1.0;
		c.gridwidth = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtAdm, c);

		btnSave = new JButton("Save");
		btnSave.addActionListener(this);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 5;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(btnSave, c);


		lblFName = new JLabel("First Name");
		lblFName.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		//Insets(int top, int left, int bottom, int right)
		c.insets = new Insets(10, 10, 10, 10);
		add(lblFName, c);

		txtFName = new JTextField();
		txtFName.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtFName, c);

		lblLName = new JLabel("Last Name");
		lblLName.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		//Insets(int top, int left, int bottom, int right)
		c.insets = new Insets(10, 10, 10, 10);
		add(lblLName, c);

		txtLName = new JTextField();
		txtLName.setFont(new Font("Times New Roman", Font.BOLD, 30));
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtLName, c);


		setVisible(true);
	}

	public static void main(String[] args) {
		new RegistrationForm();
	}

	public void actionPerformed(ActionEvent ae){

		String adm = txtAdm.getText();
		String fn = txtFName.getText();
		String ln = txtLName.getText();

		if(ae.getSource() == btnSave){

			data[0] = adm;
			data[1] = fn;
			data[2] = ln;

			for(String str : data){	

				JOptionPane.showMessageDialog(null, 
					str + "\n"
				);

			}

			

		}

	}
	
}