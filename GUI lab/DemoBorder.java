import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DemoBorder extends JFrame{

	JPanel panBlue, panBlack, panRed, panGreen, panYellow;
	//BorderLayout bl;

	public DemoBorder(){
		super("LOGIN");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		//bl = new BorderLayout(50, 50);
		//setLayout(bl);

		panYellow = new JPanel();
		panYellow.setBackground(Color.YELLOW);

		panGreen = new JPanel();
		panGreen.setBackground(Color.GREEN);

		panRed = new JPanel();
		panRed.setBackground(Color.RED);

		panBlack = new JPanel();
		panBlack.setBackground(Color.BLACK);

		panBlue = new JPanel();
		panBlue.setBackground(Color.BLUE);

		add(panYellow, BorderLayout.NORTH);
		add(panGreen, BorderLayout.CENTER);
		add(panRed, BorderLayout.SOUTH);
		add(panBlue, BorderLayout.WEST);
		add(panBlack, BorderLayout.EAST);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoBorder();
	}
	
}