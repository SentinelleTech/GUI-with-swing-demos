import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

class Login_Manual extends JFrame{

	JLabel lblUser, lblPass;
	JTextField txtUser;
	JPasswordField txtPass;
	JButton btnSubmit, btnReset;
	Font f;

	public Login_Manual(){
		super("LOGIN");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		getContentPane().setBackground(Color.CYAN);
		setLayout(null);

		f = new Font("Consolas", Font.BOLD, 26);

		lblUser = new JLabel("Username");
		lblUser.setBounds(20, 20, 150, 50);
		lblUser.setFont(f);
		add(lblUser);

		txtUser = new JTextField();
		txtUser.setBounds(190, 20, 150, 50);
		txtUser.setFont(f);
		add(txtUser);


		setVisible(true);
	}

	public static void main(String[] args) {
		new Login_Manual();
	}
	
}