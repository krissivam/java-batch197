package Day10;

import java.util.Scanner;

public class ParkingTiket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double fee;
		double hours;

		System.out.print("Lama parkir (jam): ");
		hours = input.nextDouble();

		if (hours >= 0.0) {
			fee = calculateCharge(hours);
			System.out.printf("Total receipts: $%.2f\n", fee);
			input.close();
		}
	}// method main

	public static double calculateCharge(double hours) {
		
		//Tarif Parkir
		double minPark = 2.0;
		double maxPark = 10.0;
		double maxHours = 24.0;
		double minHours = 3.0;
		double hourEx = 0.5;
		
		double fee;

		fee = minPark;

		if (hours <= minHours)
			fee = minPark;
		
		if (hours > minHours && hours < maxHours)
			fee = hourEx * (Math.ceil(hours) - minHours) + minPark;
		
		if (hours == maxHours)
			fee = maxPark;

		return fee;
	} // method calculateCharge

}
