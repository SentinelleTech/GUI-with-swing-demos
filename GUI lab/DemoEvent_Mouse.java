import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class DemoEvent_Mouse extends JFrame implements MouseListener{

	JLabel lbl;
	JPanel pan;

	public DemoEvent_Mouse(){
		super("KeyListener in action");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		lbl = new JLabel();
		lbl.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		add(lbl, BorderLayout.NORTH);

		pan = new JPanel();
		pan.addMouseListener(this);
		add(pan, BorderLayout.CENTER);
		

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoEvent_Mouse();
	}

	public void mouseClicked(MouseEvent e){

		if(e.getButton() == MouseEvent.BUTTON1){

			lbl.setText("" + e.getClickCount());
			//lbl.setText("X : " + e.getX() + " Y : " + e.getY());

		}

	}

	public void mouseEntered(MouseEvent e){
		
		lbl.setText("Entered the panel");

	}

	public void mouseExited(MouseEvent e){
		
		lbl.setText("Left the panel");

	}

	public void mousePressed(MouseEvent e){
		
	}

	public void mouseReleased(MouseEvent e){
		
	}
	
}