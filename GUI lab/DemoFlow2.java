import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class DemoFlow2 extends JFrame{

	JLabel lblOne, lblTwo, lblThree, lblFour, lblFive;
	Font f;
	JPanel pan;

	public DemoFlow2(){
		super("LOGIN");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		pan = new JPanel();

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

		pan.add(lblOne);
		pan.add(lblTwo);
		pan.add(lblThree);
		pan.add(lblFour);
		pan.add(lblFive);

		add(pan);

		setVisible(true);

	}

	public static void main(String[] args) {
		new DemoFlow2();
	}
	
}