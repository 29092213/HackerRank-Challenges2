package org.example.easy;


import java.util.Scanner;

public class subString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

            String S = in.next();
            String novaPalavra;
            int start = in.nextInt();
            int end = in.nextInt();



            //Solução...
            if (start >= 0 && end <= S.length() && start < end){
                novaPalavra = S.substring(start, end);
                System.out.println(novaPalavra);
            }


    }
}
