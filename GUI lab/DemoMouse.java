import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class DemoMouse extends JFrame implements MouseListener, MouseMotionListener{

	JLabel lbl;
	JPanel pan;

	public DemoMouse(){
		super("Key Listener in action");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		lbl = new JLabel();
		lbl.setFont(new Font("Times New Roman", Font.PLAIN, 30));

		pan = new JPanel();
		pan.addMouseListener(this);
		pan.addMouseMotionListener(this);
		pan.setBackground(Color.GRAY);

		add(pan, BorderLayout.CENTER);		
		add(lbl, BorderLayout.NORTH);	

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoMouse();
	}


	public void mouseClicked(MouseEvent e) {

		if(e.getButton() == MouseEvent.BUTTON1){

			lbl.setText("You have clicked " + e.getClickCount() + " times");

		}else if(e.getButton() == MouseEvent.BUTTON2){

			

		}

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {

		lbl.setText("Mouse has entered the panel");

	}

	public void mouseExited(MouseEvent e) {

		lbl.setText("Mouse has left the panel");

	}

	public void mouseMoved(MouseEvent e) {

		lbl.setText("X : " + e.getX() + "	Y : " + e.getY());

	}

	public void mouseDragged(MouseEvent e) {

		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(), e.getY(), 10, 10);

	}

	
}