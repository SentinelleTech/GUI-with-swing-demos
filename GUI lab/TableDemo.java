import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

class TableDemo extends JFrame{

	String [] colHeaders = {"Admission", "First Name", "Last Name", "Course"};
	String [][] rowData = {
		{"5678-01", "John", "Kinyanjui", "Computer Engineering"},
		{"3456-00", "Brian", "Kamau", "Catering"},
		{"7776-12", "Dennis", "Matieka", "Software Engineering"},
		{"2234-00", "Bill", "Sudih", "Mechanical Engineering"}
	};

	String [][] rowData = new String[1][7];

	JTable tbl;
	JScrollPane scroll;

	public TableDemo(){
		super("Table in action");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);

		tbl = new JTable(rowData, colHeaders);

		scroll = new JScrollPane(tbl);

		add(scroll);

		setVisible(true);
	}

	public static void main(String[] args) {
		new TableDemo();
	}
	
}