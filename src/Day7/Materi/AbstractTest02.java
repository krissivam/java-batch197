package Day7.Materi;

public class AbstractTest02 {
	// Main Method
	public static void main(String[] args) {
		// Initial Object
		Bank01 b1;
		// Instance Object
		b1 = new SBI01();
		System.out.println("Rate Of Interest Is : " + b1.getRateOfInterest());
		b1 = new PNB01();
		System.out.println("Rate Of Interest Is : " + b1.getRateOfInterest());
	}

}
