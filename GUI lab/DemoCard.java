import java.awt.Color;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Box;

class DemoCard extends JFrame implements ActionListener{

	JPanel panHand, panBlue, panBlack, panRed, panYellow, panGreen, panMagenta, panPink;
	CardLayout cl;
	JButton btnOne, btnTwo, btnThree, btnFour;
	Box b;
	Font f;

	public DemoCard(){
		super("Box in action");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		f = new Font("Lucida Calligraphy", Font.PLAIN, 30);

		b = Box.createHorizontalBox();

		btnOne = new JButton("Button first");
		btnOne.addActionListener(this);
		btnOne.setFont(f);
		b.add(btnOne);
		b.add(Box.createHorizontalGlue());

		btnTwo = new JButton("Button next");
		btnTwo.addActionListener(this);
		btnTwo.setFont(f);
		b.add(btnTwo);
		b.add(Box.createHorizontalGlue());

		btnThree = new JButton("Button prev");
		btnThree.addActionListener(this);
		btnThree.setFont(f);
		b.add(btnThree);
		b.add(Box.createHorizontalGlue());

		btnFour = new JButton("Button last");
		btnFour.addActionListener(this);
		btnFour.setFont(f);
		b.add(btnFour);

		add(b, BorderLayout.NORTH);




		panHand = new JPanel();
		cl = new CardLayout();
		panHand.setLayout(cl);


		panBlue = new JPanel();
		panBlue.setBackground(Color.blue);
		panHand.add(panBlue, "samawati");

		panBlack = new JPanel();
		panBlack.setBackground(Color.black);
		panHand.add(panBlack, "nyeusi");

		panRed = new JPanel();
		panRed.setBackground(Color.red);
		panHand.add(panRed, "nyekundu");

		panYellow = new JPanel();
		panYellow.setBackground(Color.yellow);
		panHand.add(panYellow);

		panGreen = new JPanel();
		panGreen.setBackground(Color.green);
		panHand.add(panGreen);

		panMagenta = new JPanel();
		panMagenta.setBackground(Color.magenta);
		panHand.add(panMagenta, "purple");

		panPink = new JPanel();
		panPink.setBackground(Color.pink);
		panHand.add(panPink);

		cl.show(panHand, "purple");

		add(panHand, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoCard();
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == btnOne){

			cl.first(panHand);

		}else if(ae.getSource() == btnFour){

			cl.last(panHand);

		}else if(ae.getSource() == btnTwo){

			cl.next(panHand);

		}else{

			cl.previous(panHand);

		}

	}
	
}