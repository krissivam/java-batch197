package Day2.StudyCase;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "AkuSayangKamuTapiKamu";
		int a = text.length();
		int b = 0;
		for (int i = 0; i<a; i++) {
			if(Character.isUpperCase(text.charAt(i))) {
				b++;
			}
		}
		System.out.println(text);
		System.out.println("Jumlah huruf besar : " + b);

	}

}
