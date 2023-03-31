import javax.swing.JOptionPane;

class DemoInput{

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null, "Please enter first number");

		String input2 = JOptionPane.showInputDialog(null, "Please enter second number");
		//int (type wrapper)

		int num1 = Integer.parseInt(input);

		int num2 = Integer.parseInt(input2);

		int sum = num1 + num2;

		JOptionPane.showMessageDialog(null, "The total is: " + sum);

	}
	
}