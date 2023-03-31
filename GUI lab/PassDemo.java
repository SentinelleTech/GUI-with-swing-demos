import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PassDemo extends JFrame{

	JPasswordField txt;

	public PassDemo(){
		super("JTextArea in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		txt = new JPasswordField();
		add(txt);
		
		setVisible(true);
	}

	public static void main(String[] args) {
			PassDemo ld = new PassDemo();
		}	
}