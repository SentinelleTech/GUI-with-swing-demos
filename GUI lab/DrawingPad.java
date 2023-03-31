import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

class DrawingPad extends JFrame implements MouseMotionListener{

	JPanel pan;
	JLabel lbl;

	public DrawingPad(){
		super("Drawing pad");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		pan = new JPanel();
		pan.setBackground(Color.black);
		pan.addMouseMotionListener(this);

		add(pan, BorderLayout.CENTER);

		lbl = new JLabel();
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		add(lbl, BorderLayout.NORTH);


		setVisible(true);
	}

	public static void main(String[] args) {
		new DrawingPad();
	}

	public void mouseMoved(MouseEvent me){

		lbl.setText("X : " + me.getX() + " Y : " + me.getY());

	}

	public void mouseDragged(MouseEvent me){

		Graphics g = getGraphics();
		g.setColor(Color.yellow);
		g.fillOval(me.getX(), me.getY(), 5, 5);

	}
	
}