import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class DemoUI extends JFrame implements ActionListener{

	JTextField txt[] = new JTextField[3];
	GridLayout gl;
	JButton btnSave, btnClear;
	String []data = new String[3];

	public DemoUI(){
		super("Register");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		gl = new GridLayout(5, 1, 10, 10);
		setLayout(gl);

		for(int i = 0; i < txt.length; i++){

			txt[i] = new JTextField();
			txt[i].setFont(new Font("Times New Roman", Font.BOLD, 30));
			add(txt[i]);

		}

		btnSave = new JButton("Save");
		btnSave.addActionListener(this);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(btnSave);

		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(btnClear);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoUI();
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == btnSave){

			for(int j = 0; j < data.length; j++){

				data[j] = txt[j].getText();

			}

			JOptionPane.showMessageDialog(null, "Success!");

		}else{

			for(int k = 0; k < txt.length; k++){

				txt[k].setText("");

			}

		}
	}
	
}