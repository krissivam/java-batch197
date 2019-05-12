package Day6;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeConversion("07:05:45PM"));
		System.out.println(timeConversion("12:05:45AM"));
		System.out.println(timeConversion("12:05:45PM"));
		System.out.println(timeConversion("07:05:45AM"));

	}

	static String timeConversion(String s) {

		String hasil = "OKE";
//		String[] array = s.split("");
		String time = s.substring(8);
		int jam = Integer.parseInt(s.substring(0, 2));
		if (time.equals("PM")) {
			if (jam < 12)
				jam += 12;
			hasil = jam + s.substring(2, 8);
		} else {
			if (jam == 12) {
				hasil = "00" + s.substring(2, 8);
			} else {
				hasil = s.substring(0, 8);
			}
		}

		return hasil;

	}

}
