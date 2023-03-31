import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class DemoFlow extends JFrame{

	JLabel lblOne, lblTwo, lblThree, lblFour, lblFive;
	Font f;
	FlowLayout fl;

	public DemoFlow(){
		super("LOGIN");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		fl = new FlowLayout(FlowLayout.RIGHT, 30, 20);

		setLayout(fl);

		f = new Font("Consolas", Font.BOLD, 30);

		lblOne = new JLabel("First Label");
		lblOne.setFont(f);
		lblOne.setForeground(Color.BLUE);

		lblTwo = new JLabel("Second Label");
		lblTwo.setFont(f);
		lblTwo.setForeground(Color.RED);

		lblThree = new JLabel("Third Label");
		lblThree.setFont(f);
		lblThree.setForeground(Color.GREEN);

		lblFour = new JLabel("Fourth Label");
		lblFour.setFont(f);
		lblFour.setForeground(Color.CYAN);

		lblFive = new JLabel("Fifth Label");
		lblFive.setFont(f);
		lblFive.setForeground(Color.MAGENTA);

		add(lblOne);
		add(lblTwo);
		add(lblThree);
		add(lblFour);
		add(lblFive);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoFlow();
	}
	
}