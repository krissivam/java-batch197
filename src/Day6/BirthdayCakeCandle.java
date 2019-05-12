package Day6;

public class BirthdayCakeCandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int case1 = birthdayCakeCandles(new int[]{3,2,1,3});
		System.out.println(case1);
		int case2 = birthdayCakeCandles(new int[]{4,3,5,7,2,1,3,7,8,8,8});
		System.out.println(case2);
		int case3 = birthdayCakeCandles(new int[]{9,4,5,8,12,4,6,14,19,3,4,17,6,19});
		System.out.println(case3);

	}
	
	static int birthdayCakeCandles(int[] ar) {
        int hasil = 1;
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
        	if (ar[i] == max) {
				hasil++;
        	}
			if (ar[i] > max) {
				max = ar[i];
				hasil = 1;
			}
		}
        return hasil;
    }

}
