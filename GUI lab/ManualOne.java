import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JList;

class ManualOne extends JFrame{

	JLabel lblOne, lblTwo, lblThree;
	JPasswordField pass;
	JTextField txtF;	
	JList list;
	String[] data = {"John", "Julius", "Kenneth", "Grace"};

	public ManualOne(){
		super("Manual placement in action");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);

		lblOne = new JLabel("ONE");
		lblOne.setBounds(100, 50, 300, 80);
		add(lblOne);

		lblTwo = new JLabel("TWO");
		lblTwo.setBounds(100, 180, 300, 80);
		add(lblTwo);

		pass = new JPasswordField();
		pass.setBounds(100, 310, 300, 80);
		add(pass);

		txtF = new JTextField();
		txtF.setBounds(100, 440, 300, 80);
		add(txtF);

		lblThree = new JLabel("THREE");
		lblThree.setBounds(400, 180, 300, 80);
		add(lblThree);

		list = new JList(data);
		list.setBounds(450, 50, 100, 150);
		add(list);


		setVisible(true);
	}

	public static void main(String[] args) {
		new ManualOne();
	}
	
}