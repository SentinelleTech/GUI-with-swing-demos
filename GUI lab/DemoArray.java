import java.util.Scanner;

class DemoArray{

	Scanner s, s1;

	public DemoArray(){

		s = new Scanner(System.in);

		s1 = new Scanner(System.in);

		System.out.println("How many names do you want?");

		int size = s.nextInt();

		String [] names = new String[size];

		System.out.println("Type the " + size + " names");

		for(int i = 0; i < size; i++){

			names[i] = s.next();

		}

		System.out.println("\n\n\nYour names are as follows \n");

		printArray(names);

	}

	public void printArray(String [] arr){

		for(String str : arr){

			System.out.println(str);

		}

	}

	public static void main(String[] args) {
		new DemoArray();
	}
	
}