import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

class DemoItem_Event extends JFrame implements ItemListener{

	String [] colors = {"blue", "black", "green", "red", "gray"};

	JComboBox cbo;

	public DemoItem_Event(){
		super(" in action");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		cbo = new JComboBox(colors);
		cbo.addItemListener(this);
		add(cbo, BorderLayout.NORTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoItem_Event();
	}

	public void itemStateChanged(ItemEvent it){

		if(it.getStateChange() == ItemEvent.SELECTED){

			System.out.println(it.getItem());

		}

	}
	
}