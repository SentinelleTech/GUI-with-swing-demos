import java.awt.*;

import javax.swing.*;

class DemoBoxOne extends JFrame{

	Box b;
	JButton btn;
	JLabel lbl;
	JTextField txt;
	JPanel pan;
	Color c;

	/*JCheckBox chkMale, chkFemale;
	JComboBox cbo;*/

	public DemoBoxOne(){
		super("Box layout manager in action");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		b = Box.createVerticalBox();

		btn = new JButton("CLick Me!");
		btn.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btn);

		lbl = new JLabel("John Kinyanjui");
		lbl.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(lbl);

		txt = new JTextField();
		txt.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(txt);

		pan = new JPanel();

		c = new Color(20, 255, 200);

		pan.setBackground(c);


		add(pan, BorderLayout.CENTER);

		add(b, BorderLayout.WEST);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		DemoBoxOne dbo = new DemoBoxOne();
	}

}