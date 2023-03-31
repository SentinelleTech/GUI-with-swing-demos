import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class DemoButtonClick extends JFrame implements ActionListener{

	JButton btn;

	public DemoButtonClick(){
		super("Button click event");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		btn = new JButton("Click Me");
		btn.addActionListener(this);
		btn.setFont(new Font("Consolas", Font.BOLD, 30));

		add(btn, BorderLayout.SOUTH);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){

		if(e.getSource() == btn){

			JOptionPane.showMessageDialog(null, "You have clicked me");

		}

	}

	public static void main(String[] args) {
		new DemoButtonClick();
	}
	
}