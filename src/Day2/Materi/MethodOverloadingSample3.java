package Day2.Materi;

public class MethodOverloadingSample3 {

	public static void main(String[] args) {
		System.out.println("main with String[]");

	}
	
	public static void main(String args) {
		System.out.println("main with String");
	}
	
	public static void main() {
		System.out.println("main without args");
		
	}

}
