package org.example.easy;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine().trim();
        int number;

        String[] palavraArray = palavra.split("[^a-zA-Z]+");
        if (palavra.isEmpty() ){
            number = 0;
        }else number = palavraArray.length;

        System.out.println(number);

        for (String arrayExibir : palavraArray){
            System.out.println(arrayExibir);
        }

        sc.close();
    }
}
