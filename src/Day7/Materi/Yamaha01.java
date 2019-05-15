package Day7.Materi;

public class Yamaha01 extends Bike01 {
	
	void run() {
		System.out.println("method run called");
	}
	
	public static void main(String[] args) {
		Bike01 b = new Yamaha01();
		b.run();
	}

}
