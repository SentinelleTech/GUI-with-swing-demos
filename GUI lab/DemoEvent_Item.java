import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

class DemoEvent_Item extends JFrame implements ItemListener{
	
	JComboBox cbo;
	String [] fruits = {"Banana", "Orange", "Apple", "Guava"};

	public DemoEvent_Item(){
		super("Item Listener in action");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		cbo = new JComboBox(fruits);
		cbo.addItemListener(this);
		add(cbo, BorderLayout.NORTH);


		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoEvent_Item();
	}

	public void itemStateChanged(ItemEvent it){

		if(it.getStateChange() == ItemEvent.SELECTED){

			JOptionPane.showMessageDialog(null, cbo.getSelectedItem() + " selected");

		}

	}

}