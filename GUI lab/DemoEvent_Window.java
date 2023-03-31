import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

class DemoEvent_Window extends JFrame implements WindowListener{

	JLabel lbl;

	public DemoEvent_Window(){
		super("Window Listener in action");	

		createAndShowGUI();

		addWindowListener(this);
	}

	public static void main(String[] args) {
		new DemoEvent_Window();
	}

	 private void createAndShowGUI() {
        setSize(700, 500);
		setLocationRelativeTo(null);

		createUIComponents();

        setVisible(true);
    }

    private void createUIComponents(){

    	ImageIcon icon = new ImageIcon("C:\\Users\\KISE\\Pictures\\Windows-10.png");

    	lbl = new JLabel(icon);

    	add(lbl);

    }

	 public void windowOpened(WindowEvent e){

	 	System.out.println("frame has been opened");

	 	//createAndShowGUI();

	 }
	  public void windowClosing(WindowEvent e){

	  	int option = JOptionPane.showConfirmDialog(null, "Confirm you want to close the app", "Confirm", JOptionPane.YES_NO_OPTION);

	  	if(option == JOptionPane.YES_OPTION){

	  		dispose();

	  	}else if(option == JOptionPane.NO_OPTION){

	  		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

	  	}

	  }

	  public void windowClosed(WindowEvent e){

	  }

	  public void windowIconified(WindowEvent e){

	  }

	  public void windowDeiconified(WindowEvent e){

	  }

	  public void windowActivated(WindowEvent e){

	  	System.out.println("frame is now active");

	  	

	  }

	  public void windowDeactivated(WindowEvent e){

	  	System.out.println("frame is no longer the active window");

	  }
	
}