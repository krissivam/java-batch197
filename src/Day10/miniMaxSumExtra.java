package Day10;

import java.util.Arrays;

public class miniMaxSumExtra {

	public static void main(String[] args) {
		// nilai Min dan Max Sum untuk 4 komponen array saja
		int[] arraryInput = new int[] {1,2,4,7,8,6,9};
		Arrays.sort(arraryInput);
		
		miniMaxSum(arraryInput);

	}
	
	static void miniMaxSum(int[] array) {
		
		long sumMin = 0;
		long sumMax = 0;
		
		int n = 4;
		for (int i = 0; i < n; i++) {
			sumMin += array[i];
			sumMax += array[array.length -1 -i];
		}
		System.out.println(sumMin + " " + sumMax);
	}

}
