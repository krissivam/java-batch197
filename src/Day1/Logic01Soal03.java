package Day1;

import java.util.Scanner;

public class Logic01Soal03 {
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
		int number=1;
		//looping start from 0, and max number from input
		for (int i = 0; i < n; i++) {
			//show value variable i to console
			System.out.print(number +"\t");
			//next number will be current number + 3
			number=number+3;
		}
		

	}

}
