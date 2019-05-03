package Day1;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		System.out.println(simpleArraySum(new int[] {1,2,3,4,5,8,14,18}));
		System.out.println(simpleArraySum(new int[] {1,2,3,4,19,25,45,33,55,66}));
		System.out.println(simpleArraySum(new int[] {1,2,3,4,}));
		int jumlah=simpleArraySum(new int[] {3333,6421,7895});
		System.out.println(jumlah);
	}
	
	static int simpleArraySum(int[] ar) {
		int hasil = 0;
		for (int i = 0; i < ar.length; i++) {
			hasil+=ar[i];
		}
		return hasil;
	}

}
