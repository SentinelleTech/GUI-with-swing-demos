import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame{

	JLabel lbl;

	public LabelDemo(){
		super("JLabel in action");
		//setSize(400, 400);
		setLocationRelativeTo(null);
		/*
			public static final int DO_NOTHING_ON_CLOSE = 0;
            public static final int HIDE_ON_CLOSE = 1;
            public static final int DISPOSE_ON_CLOSE = 2;
           	public static final int EXIT_ON_CLOSE = 3;

		*/
		setDefaultCloseOperation(3);

		lbl = new JLabel("This is a label");

		add(lbl);

		pack();

		setVisible(true);
	}

	public static void main(String[] args) {
			LabelDemo ld = new LabelDemo();
		}	
}