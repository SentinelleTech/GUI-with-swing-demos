import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class DemoTabs extends JFrame{

	JPanel panOne, panTwo, panThree, panFour;
	ImageIcon icon;
	JLabel lbl;
	JTabbedPane tabbedPane;

	public DemoTabs(){
		super("TabbedPane in action");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		tabbedPane = new JTabbedPane();

		panOne = new JPanel();
		panOne.setBackground(Color.black);
		tabbedPane.addTab("black panel", panOne);

		panTwo = new JPanel();
		panTwo.setBackground(Color.green);
		tabbedPane.addTab("green panel", panTwo);

		panThree = new JPanel();
		panThree.setBackground(Color.yellow);
		tabbedPane.addTab("yellow panel", panThree);

		panFour = new JPanel();
		icon = new ImageIcon("C:\\Users\\KISE\\Pictures\\male.jpg");
		lbl = new JLabel(icon);
		panFour.add(lbl);
		tabbedPane.addTab("image panel", panFour);


		add(tabbedPane);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoTabs();
	}
	
}