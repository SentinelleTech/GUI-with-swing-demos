import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Box;

class Demo_Deck_Of_Cards extends JFrame implements ActionListener{

	JPanel panHand, panYellow, panRed, panBlue, panGreen, panBlack, panCyan;
	CardLayout cl;
	JButton btnOne, btnTwo, btnThree, btnFour;
	Box b;


	public Demo_Deck_Of_Cards(){
		super("Button click event");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);


		b = Box.createHorizontalBox();	

		btnOne = new JButton("FIRST");
		btnOne.addActionListener(this);
		btnOne.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnOne);		
		b.add(Box.createHorizontalGlue());
		//b.add(Box.createRigidArea(new Dimension(10, 0)));

		btnTwo = new JButton("PREVIOUS");
		btnTwo.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnTwo);		
		b.add(Box.createHorizontalGlue());
		//b.add(Box.createHorizontalStrut(30));

		btnThree = new JButton("NEXT");
		btnThree.setFont(new Font("Consolas", Font.PLAIN, 30));
		btnThree.addActionListener(this);
		b.add(btnThree);
		b.add(Box.createHorizontalGlue());

		btnFour = new JButton("LAST");
		btnFour.addActionListener(this);
		btnFour.setFont(new Font("Consolas", Font.PLAIN, 30));
		b.add(btnFour);

		add(b, BorderLayout.NORTH);








		panHand = new JPanel();
		cl = new CardLayout();

		panHand.setLayout(cl);

		panYellow = new JPanel();
		panYellow.setBackground(Color.yellow);
		panHand.add(panYellow);

		panRed = new JPanel();
		panRed.setBackground(Color.red);
		panHand.add(panRed);

		panBlue = new JPanel();
		panBlue.setBackground(Color.blue);
		panHand.add(panBlue);

		panGreen = new JPanel();
		panGreen.setBackground(Color.green);
		panHand.add(panGreen, "kijani");

		panBlack = new JPanel();
		panBlack.setBackground(Color.black);
		panHand.add(panBlack);

		panCyan = new JPanel();
		panCyan.setBackground(Color.cyan);
		panHand.add(panCyan);


		cl.show(panHand, "kijani");

		add(panHand, BorderLayout.CENTER);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == btnThree){
			cl.next(panHand);
		}else if(ae.getSource() == btnFour){
			cl.last(panHand);
		}

	}

	public static void main(String[] args) {
		new Demo_Deck_Of_Cards();
	}
	
}