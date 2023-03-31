import java.awt.*;

import javax.swing.*;

class PanelDemoOne extends JFrame{

	JPanel panRight, panLeft;
	JSplitPane pane;
	
	public PanelDemoOne(){
		super("Frames in action");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pane = new JSplitPane();

		panLeft = new JPanel();
		panLeft.setBackground(Color.BLUE);
		pane.setLeftComponent(panLeft);

		panRight = new JPanel();
		panRight.setBackground(Color.RED);
		pane.setRightComponent(panRight);

		add(pane);


		setVisible(true);

	}

	public static void main(String[] args) {
		new PanelDemoOne();
	}
}