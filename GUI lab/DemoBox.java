import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JOptionPane;

class DemoBox extends JFrame implements ActionListener{

	JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;
	Box b;
	//interfaces -- abstract classes

	public DemoBox(){
		super("Box in action");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		b = Box.createHorizontalBox();


		btnOne = new JButton("Button one");
		btnOne.addActionListener(this);
		b.add(btnOne);
		//b.add(Box.createRigidArea(new Dimension(0, 20)));
		b.add(Box.createHorizontalGlue());

		btnTwo = new JButton("Button two");
		b.add(btnTwo);
		//b.add(Box.createRigidArea(new Dimension(0, 20)));
		b.add(Box.createHorizontalGlue());

		btnThree = new JButton("Button three");
		b.add(btnThree);
		//b.add(Box.createHorizontalGlue());
		b.add(Box.createHorizontalGlue());

		btnFour = new JButton("Button four");
		b.add(btnFour);
		b.add(Box.createHorizontalGlue());

		btnFive = new JButton("Button five");
		b.add(btnFive);
		b.add(Box.createHorizontalGlue());

		btnSix = new JButton("Button six");
		b.add(btnSix);

		add(b, BorderLayout.NORTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoBox();
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == btnOne){

			JOptionPane.showMessageDialog(null, "You clicked me!");

		}

	}
	
}