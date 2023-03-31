import javax.swing.JFrame;
import javax.swing.JButton;

class ButtonDemo extends JFrame{

	JButton btnOne, btnTwo, btnThree;

	public ButtonDemo(){
		super("Buttons in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);

		btnOne = new JButton("BUTTON 1");
		btnOne.setBounds(10, 20, 380, 50);
		add(btnOne);

		btnTwo = new JButton("BUTTON 2");
		add(btnTwo);

		btnThree = new JButton("BUTTON 3");
		add(btnThree);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonDemo();
	}
	
}