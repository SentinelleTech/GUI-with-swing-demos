import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextDemo extends JFrame{

	JTextArea txt;

	public TextDemo(){
		super("JTextArea in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		txt = new JTextArea();
		add(txt);
		
		setVisible(true);
	}

	public static void main(String[] args) {
			TextDemo ld = new TextDemo();
		}	
}