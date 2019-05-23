package Day10;

import java.util.Scanner;

public class Sorting {
	
	public static Scanner input;

	public static void main(String[] args) {
		// MAIN - Sorting using Bubble Sort
		
		//CARA STATIS
		bubbleSort(new int[] {3,5,6,1,2,8,4});
		/*
		int[] array = {3,60,35,2,45,320,};
		System.out.println("Array Before Bubble Sort");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		bubbleSort(array);//sorting array using bubblesort
		
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		*/
	
		//Cara Dinamis
		/*
		input = new Scanner(System.in);
		System.out.printf("Masukkan Input: ");
		String n = input.nextLine();
		
		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];
		
		for (int i = 0; i < arrayString.length; i++) {
			
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
		
		bubbleSort(arrayInput);
		*/
		

	}
	
	static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if (array[j-1] > array[j]) {
					//swap element
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		/*
		for (int i = 0; i < n; i++) {	//loop iterasi
			for (int j = 0; j < n-1; j++) {		//loop pembanding
				if (array[j] > array[j+1]) {		//if arr[before] > arr[after] , TRUE maka lanjut
					temp = array[j];				//simpan arr[before] ke temp
					array[j] = array[j+1];			//berikan nilai sementara kepada arr[after]
					array[j+1] = temp;
				}
			}
		}
		*/
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
