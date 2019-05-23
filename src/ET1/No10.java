package ET1;

import java.util.Scanner;

public class No10 {

	static void pangram(String s) {
        String result[] = new String[2];
        s = s.replace(" ", "");
        s = s.toLowerCase();
        char input[] = s.toCharArray();
        int alphabet[] = new int[26];
        // mengisi setiap indeks array alphabet
        for (int i = 0; i < input.length; i++) {
            // int index = input[i] - 97 -->
            // simpan nilai input karakter ke i - 97
            // ( 97 = bilangan ascii untuk a )
            //
            int index = input[i] - 97;
            alphabet[index] = 1;
        }
        int j = 0;
        // mengecek apakah input = pangrams atau bukan
        while (j != 26) {
            // jika terpenuhi bahwa alphabet[j] == 1 secara menyeluruh maka kalimat adalah pangram
            if (alphabet[j] == 1) {
                j++;
            } else {
                System.out.println("It's Not a Pangram");
                System.exit(0);
            }
        }
        System.out.println("It's a Pangram");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //pangram("Quick Brown Fox Jumps Over The Lazy Dog");
        pangram("Sphinx of black quartz judge my vow");
       // pangram("Brawny gods just flocked up to quiz and vex him");
       // pangram("Check back tomorrow I will see if the book has arrived");
    }

}
