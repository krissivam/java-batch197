package Day1.StudyCase;

import java.util.Scanner;

public class Logic01Soal06 {
	//create object input from java.util.Scanner
	protected static Scanner input;

	public static void main(String[] args) {
		//create instance object input using keyboard new
		input = new Scanner(System.in);
		//show text "Input your Text : " on console
		System.out.println("Input your Number : ");
		//and then grab all text from keyboard and convert to int using method parseInt
		int n = Integer.parseInt(input.nextLine());
		//create variable number, and set initial value
		int nextNumber, number=1;
		//looping start from 0, and max number from input
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print(number + "\t");
				nextNumber = number +4;
				number = nextNumber;
			} else if (i % 3 == 0) {
				System.out.print("*" +"\t");
				nextNumber = number +4;
				number = nextNumber;
				
			} else {
				System.out.print(number +"\t");
				//next number will be current number +4
				nextNumber = number +4;
				number = nextNumber;
			}
			
		}
		

	}

}
