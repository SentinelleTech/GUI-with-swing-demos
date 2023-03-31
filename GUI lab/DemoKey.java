import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class DemoKey extends JFrame implements KeyListener{

	JTextField txt;
	JPanel pan;

	public DemoKey(){
		super("Key Listener in action");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		txt = new JTextField();
		txt.addKeyListener(this);
		txt.setFont(new Font("Times New Roman", Font.PLAIN, 30));

		pan = new JPanel();

		add(pan, BorderLayout.CENTER);		
		add(txt, BorderLayout.NORTH);		

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoKey();
	}




	public void keyPressed(KeyEvent ke){}

	public void keyReleased(KeyEvent ke){

		String input = txt.getText();

		if(input.length() == 7 && input.charAt(4) == '-'){

			if(input.equals("9459-90")){

				JOptionPane.showMessageDialog(null, "Welcome John");

			}else if(input.equals("9459-91")){

				JOptionPane.showMessageDialog(null, "Welcome Jane");

			}else{

				JOptionPane.showMessageDialog(null, "No such ID exists");

			}

		}

	}

	public void keyTyped(KeyEvent ke){}


	

}