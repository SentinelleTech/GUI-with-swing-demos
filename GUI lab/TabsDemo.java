import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

class TabsDemo extends JFrame{

	JTabbedPane pane;
	JPanel panRed, panGreen, panBlue;

	public TabsDemo(){
		super("Tabs in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		pane = new JTabbedPane();

		panRed = new JPanel();
		panRed.setBackground(Color.red);
		pane.addTab("Red tab", panRed);

		panGreen = new JPanel();
		panGreen.setBackground(Color.green);
		pane.addTab("Green tab", panGreen);

		panBlue = new JPanel();
		panBlue.setBackground(Color.blue);
		pane.addTab("Blue tab", panBlue);

		add(pane);

		setVisible(true);
	}

	public static void main(String[] args) {
		new TabsDemo();
	}
	
}