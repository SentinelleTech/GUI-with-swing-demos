import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

class DemoBoxTwo extends JFrame{
	JButton btnOne, btnTwo, btnThree, btnFour;
	Box b;
	JLabel lblAdm, lblFName, lblLName, lblCourse, lblPhone;
	JTextField txtAdm, txtFName, txtLName, txtCourse, txtPhone;
	JPanel pan;

	public DemoBoxTwo(){
		super("Box layout manager in action");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		pan = new JPanel();
		pan.setLayout(new GridLayout(5, 2, 10, 10));

		lblAdm = new JLabel("Admission Number");
		lblAdm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(lblAdm);

		txtAdm = new JTextField();
		txtAdm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(txtAdm);



		lblFName = new JLabel("First Name");
		lblFName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(lblFName);

		txtFName = new JTextField();
		txtFName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(txtFName);



		lblLName = new JLabel("LastName");
		lblLName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(lblLName);

		txtLName = new JTextField();
		txtLName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(txtLName);


		lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(lblCourse);

		txtCourse = new JTextField();
		txtCourse.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(txtCourse);


		lblPhone = new JLabel("Phone Number");
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(lblPhone);

		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pan.add(txtPhone);


		add(pan, BorderLayout.CENTER);






		b = Box.createHorizontalBox();	

		btnOne = new JButton("SAVE");
		btnOne.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnOne);		
		b.add(Box.createHorizontalGlue());
		//b.add(Box.createRigidArea(new Dimension(10, 0)));

		btnTwo = new JButton("SEARCH");
		btnTwo.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnTwo);		
		b.add(Box.createHorizontalGlue());
		//b.add(Box.createHorizontalStrut(30));

		btnThree = new JButton("UPDATE");
		btnThree.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnThree);
		b.add(Box.createHorizontalGlue());

		btnFour = new JButton("DELETE");
		btnFour.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnFour);

		add(b, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoBoxTwo();
	}
	
}