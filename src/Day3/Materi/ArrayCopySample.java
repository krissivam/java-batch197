package Day3.Materi;

public class ArrayCopySample {

	public static void main(String[] args) {
		// Declaring a source array
		char[] copyfrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		// Declaring a destination array
		char[] copyTo = new char[7];
		// Copying array using System.arraycopy() method
		System.arraycopy(copyfrom, 2, copyTo, 0, 7 );
		// Printing the destination array
		System.out.println(String.valueOf(copyTo));

	}

}
