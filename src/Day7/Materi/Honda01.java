package Day7.Materi;

public class Honda01 extends Bike01 {
	//run method (abstract class wajib bikin VOID)
	void run() {
		System.out.println("method run called");
	}
	
	public static void main(String[] args) {
		Bike01 b = new Honda01();
		b.run();
	}

}
