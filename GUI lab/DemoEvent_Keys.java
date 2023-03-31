import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

class DemoEvent_Keys extends JFrame implements KeyListener{

	JTextField txt;
	JTextArea txtA;
	String [] adm = {"9519-50", "9518-16", "9512-09"};

	public DemoEvent_Keys(){
		super("KeyListener in action");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		txt = new JTextField();
		txt.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		txt.addKeyListener(this);
		add(txt, BorderLayout.NORTH);

		txtA = new JTextArea();
		txtA.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		add(txtA, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoEvent_Keys();
	}

	public void keyPressed(KeyEvent ke){}

	public void keyReleased(KeyEvent ke){

		String data = txt.getText();

		if(data.length() == 7){

			if(data.charAt(4) == '-'){

				for(String str : adm){

					if(data.equals(str)){

						JOptionPane.showMessageDialog(null, "Welcome");

					}

				}

				
			}

		}
		

	}

	public void keyTyped(KeyEvent ke){}
	
}