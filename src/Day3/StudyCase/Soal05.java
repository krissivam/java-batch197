package Day3.StudyCase;

public class Soal05 {

	public static void main(String[] args) {
		int[][] array2 = new int[][] {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
		int a = 0;
		int b = 0;
		int hasil = 0;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "\t");
				if (i==j) {
					a = a + array2[i][j];
				}
				
				if (i+j == array2.length -1) {
					b = b + array2[i][j];
				}
			}
			System.out.println("\n");
		}
		
		if (a>b) {
			hasil = a-b;
		} else {
			hasil = b-a;
			System.out.println(hasil + " adalah hasilnya");
		}
	}

}
