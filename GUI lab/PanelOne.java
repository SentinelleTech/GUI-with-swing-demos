import java.awt.Color;

import javax.swing.JFrame;

class PanelOne extends JFrame{

	public PanelOne(){
		super("Panels in action");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		OurPanel op = new OurPanel();

		add(op);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		PanelOne po = new PanelOne();
	}


}