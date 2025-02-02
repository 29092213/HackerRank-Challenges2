package org.example.easy;

import java.util.Scanner;

class JavaEndFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);


        int count = 1;

        while(sc.hasNext()){

            String DigiteFrase = sc.nextLine();

            System.out.println( count + " " + DigiteFrase);
            count++;


        }


        sc.close();

    }
}
