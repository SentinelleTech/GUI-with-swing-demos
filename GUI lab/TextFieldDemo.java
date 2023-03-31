import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame{

	JTextField txt;

	public TextFieldDemo(){
		super("JTextField in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		txt = new JTextField();
		add(txt);
		
		setVisible(true);
	}

	public static void main(String[] args) {
			TextFieldDemo ld = new TextFieldDemo();
		}	
}