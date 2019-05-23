package Day10;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		HashMap<Integer, Float> hm = new HashMap<Integer, Float>();
		for (int i = 0; i < s; i++) {
			hm.put((sc.nextInt()), sc.nextFloat());
		}
		System.out.println(display(hm));
		sc.close();
	}

	public static String display(HashMap<Integer, Float> hm) {
		float sum = 0;
		int count = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			int y = it.next();
			if (y % 2 == 0) {
				sum = (float) (sum + hm.get(y));
				count++;
			}
		}
		float d = sum / count;
		return df.format(d);
	}
}