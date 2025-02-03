package org.example.easy;

import java.util.Scanner;

public class ManipularString {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        String primeiraPalavra = sc.nextLine();
        String segundaPalavra = sc.nextLine();

        int somaString = primeiraPalavra.length() + segundaPalavra.length();

            System.out.println(somaString);

        int palavraTamanho = 0;

        if (primeiraPalavra.length() >= segundaPalavra.length()){
            palavraTamanho = segundaPalavra.length();
        } else if (primeiraPalavra.length() < segundaPalavra.length()) {
            palavraTamanho = primeiraPalavra.length();
        }

        int comparacao = primeiraPalavra.compareTo(segundaPalavra);

        if (comparacao > 0 ) System.out.println("Yes");
        if (comparacao < 0 ) System.out.println("No");
        if (comparacao == 0 ) System.out.println("No");

        StringBuilder palavraFormatada = new StringBuilder(primeiraPalavra);
        StringBuilder palavraFormatada1 = new StringBuilder(segundaPalavra);

        char letraFormatada = primeiraPalavra.charAt(0);
        char letraMaiscula = Character.toUpperCase(letraFormatada);

        char letraFormatada1 = segundaPalavra.charAt(0);
        char letraMaiscula1 = Character.toUpperCase(letraFormatada1);

        palavraFormatada.setCharAt(0 , letraMaiscula);
        palavraFormatada1.setCharAt(0 , letraMaiscula1);

        palavraFormatada.append(" ");
        palavraFormatada.append(palavraFormatada1);

        System.out.println(palavraFormatada);

        sc.close();

    }
}
