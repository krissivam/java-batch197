package Day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Statistic {
	
	public static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		modus(new int[] {2,3,4,5,4,5,5,7,5});
		modus(new int[] {3,11,6,15,3,15,15,17,6,3,2,3,17,15});
		modus(new int[] {12,13,14,15,24,35,25,27,25});
		modus(new int[] {222,13,14,25,24,25,25,27,25});
		modus(new int[] {56,65,42,43,64,65,74,65,65,67,65});
		
		mean(new int[] {2,3,4,5,4,5,5,7,5});
		mean(new int[] {3,11,6,15,3,15,15,17,6,3,2,3,17,15});
		mean(new int[] {12,13,14,15,24,35,25,27,25});
		mean(new int[] {222,13,14,25,24,25,25,27,25});
		mean(new int[] {56,65,42,43,64,65,74,65,65,67,65});
		
		median(new int[] {2,3,4,5,4,5,5,7,5});
		median(new int[] {3,11,6,15,3,15,15,17,6,3,2,3,17,15});
		median(new int[] {12,13,14,15,24,35,25,27,25});
		median(new int[] {222,13,14,25,24,25,25,27,25});
		median(new int[] {56,65,42,43,64,65,74,65,65,67,65});
		*/
		
		
		input = new Scanner(System.in);
		System.out.printf("Masukkan Input: ");
		String n = input.nextLine();
		
		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];
		
		for (int i = 0; i < arrayString.length; i++) {
			
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
		
		modus(arrayInput);
		median(arrayInput);
		mean(arrayInput);

	}
	
	public static void modus(int[] array) {
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			if (data.containsKey(array[i])) {
				int value = data.get(array[i]);
				value++;
				data.put(array[i], value);
			}else {
				data.put(array[i], 1);
			}
		}
		int key = Collections.max(data.entrySet(), Map.Entry.comparingByValue()).getKey();
		int value = Collections.max(data.values());
		System.out.println("Modus: " + key + "\t" + "Value: " + value);
	}
	
	
	public static void mean(int[] array) {
		
		double sum = 0;
		double mean = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
			
		}
		mean = (double) (sum / array.length);
		System.out.println("Mean: " + mean);
	
	}
	
	public static void median(int[] array) {
		Arrays.sort(array);
		float median = 0;
		
		if (array.length % 2 == 0) {
			median = (float) (array[array.length / 2] + array[array.length / 2] - 1);
			median /= 2;
		}else {
			median = (float) (array[array.length / 2]);
		}
		System.out.println("Median: " + median);
	}

}
