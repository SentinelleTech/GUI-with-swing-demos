import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
 
class Calculator extends JFrame implements ActionListener{

JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
static double a = 0, b = 0, result = 0;
static int operator = 0;
 
	Calculator(){
		super("Calculator");

		setLayout(null);
		setVisible(true);
		setSize(350,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		t=new JTextField();
		t.setFont(new Font("Times New Roman", Font.BOLD, 20));
		t.setBounds(30,20,280,60);
		add(t);

		b1=new JButton("1");
		b1.setBounds(40,240,50,40);
		b1.addActionListener(this);
		add(b1);

		b2=new JButton("2");
		b2.setBounds(110,240,50,40);
		b2.addActionListener(this);
		add(b2);

		b3=new JButton("3");
		b3.setBounds(180,240,50,40);
		b3.addActionListener(this);
		add(b3);

		b4=new JButton("4");
		b4.setBounds(40,170,50,40);
		b4.addActionListener(this);
		add(b4);

		b5=new JButton("5");
		b5.setBounds(110,170,50,40);
		b5.addActionListener(this);
		add(b5);

		b6=new JButton("6");
		b6.setBounds(180,170,50,40);
		b6.addActionListener(this);
		add(b6);

		b7=new JButton("7");
		b7.setBounds(40,100,50,40);
		b7.addActionListener(this);
		add(b7);

		b8=new JButton("8");
		b8.setBounds(110,100,50,40);
		b8.addActionListener(this);
		add(b8);

		b9=new JButton("9");
		b9.setBounds(180,100,50,40);
		b9.addActionListener(this);
		add(b9);

		b0=new JButton("0");
		b0.setBounds(110,310,50,40);
		b0.addActionListener(this);
		add(b0);

		bdiv=new JButton("/");
		bdiv.setBounds(250,100,50,40);
		bdiv.addActionListener(this);
		add(bdiv);

		bmul=new JButton("*");
		bmul.setBounds(250,170,50,40);
		bmul.addActionListener(this);
		add(bmul);

		bsub=new JButton("-");
		bsub.setBounds(250,240,50,40);
		bsub.addActionListener(this);
		add(bsub);

		badd=new JButton("+");
		badd.setBounds(250,310,50,40);
		badd.addActionListener(this);
		add(badd);

		bdec=new JButton(".");
		bdec.setBounds(40,310,50,40);
		bdec.addActionListener(this);
		add(bdec);

		beq=new JButton("=");
		beq.setBounds(180,310,50,40);
		beq.addActionListener(this);
		add(beq);

		bdel=new JButton("Delete");
		bdel.setBounds(60,380,100,40);
		bdel.addActionListener(this);
		add(bdel);

		bclr=new JButton("Clear");		
		bclr.setBounds(180,380,100,40);
		bclr.addActionListener(this);
		add(bclr);

		setResizable(false);

	}

	public void actionPerformed(ActionEvent ae){

		Object src = ae.getSource();

		if(src == b1){

			t.setText(t.getText().concat("1"));

		}else if(src == b2){

			t.setText(t.getText().concat("2"));

		}else if(src == b3){

			t.setText(t.getText().concat("3"));

		}else if(src == b4){

			t.setText(t.getText().concat("4"));

		}else if(src == b5){

			t.setText(t.getText().concat("5"));

		}else if(src == b6){

			t.setText(t.getText().concat("6"));

		}else if(src == b7){

			t.setText(t.getText().concat("7"));

		}else if(src == b8){

			t.setText(t.getText().concat("8"));

		}else if(src == b9){

			t.setText(t.getText().concat("9"));

		}else if(src == b0){

			t.setText(t.getText().concat("0"));

		}else if(src == bdiv){

			a = Double.parseDouble(t.getText());

			t.setText("/");

			operator = 1;

			t.setText("");

		}else if(src == bmul){

			a = Double.parseDouble(t.getText());

			t.setText("*");

			operator = 2;

			t.setText("");

		}else if(src == bsub){

			a = Double.parseDouble(t.getText());

			t.setText("-");

			operator = 3;

			t.setText("");

		}else if(src == badd){

			a = Double.parseDouble(t.getText());

			t.setText("+");

			operator = 4;

			t.setText("");

		}else if(src == beq){

			b = Double.parseDouble(t.getText());

			switch (operator) {

				case 1:

					result = a / b;

					t.setText("" + result);

					break;

				case 2:

					result = a * b;

					t.setText("" + result);

					break;

				case 3:

					result = a - b;

					t.setText("" + result);

					break;

				case 4:

					result = a + b;

					t.setText("" + result);

					break;
				
			}//end of switch block


		}else if(src == bclr){

			t.setText("");

		}


	}

	public static void main(String[] args){

		new Calculator();

	}

}