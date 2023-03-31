import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

class DemoComp extends JFrame{

	JTextArea txtA;
	JScrollPane pane;

	public DemoComp(){
		super("Manual placement in action");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		txtA = new JTextArea();
		pane = new JScrollPane(txtA);

		add(pane);


		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoComp();
	}
	
}