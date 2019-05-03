package Day1;

public class SampleVariable {
	//instance variable
	int data = 50;
	//static variable
	static int m = 100;
	
	static void method() {
		//local variable
		int n = 90;
		System.out.println(m);
		System.out.println(n);
	}

	public static void main(String[] args) {
		method();
		// TODO Auto-generated method stub

	}

}
