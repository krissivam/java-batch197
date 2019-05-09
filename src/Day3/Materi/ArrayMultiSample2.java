package Day3.Materi;

public class ArrayMultiSample2 {

	public static void main(String[] args) {
		// Declaring a 2D array with odd columns
		int arr[][] = new int [3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		//Initializing a jagged array
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		
		// Printing the data of a jagged array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
