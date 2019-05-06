package Day2.Materi;

public class ArraySample {
	
	public static void main() {
		
		int [][] array2 = new int [][] {{11,2,4}, {4,5,6}, {10,8,-12}};
		int a = 0;
		int b = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]+ "\t");
				if (i==j) {
					a = a + array2[i][j];
				}
				
				if (i+j==array2.length-1) {
					b = b + array2[i][j];
				}
			}
			System.out.println("\n");
		}
		
	}
	
	static int diagonalDifference(int[][] array2) {
		int hasil = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				if (i==j) {
					a = a + array2[i][j];
				}
			}
		}
		
		if (a>b) {
			hasil = a-b;
		} else {
			hasil = b-a;
		}
		
		return hasil;
	}

	public static void main(String[] args) {
		int [] array = new int[] {1,2,3,4,5};
		System.out.println(array[1]);
		System.out.println(array[4]);
		System.out.println(array[3]);
		int hasil = 0;
		for (int a = 0; a < array.length; a++) {
			System.out.print(array[a]);
			hasil=hasil+array[a];
		}
		
		

	}
	

}
