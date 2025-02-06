package org.example.easy;
import java.util.Scanner;
//Escreva um programa curto em Java que imprime os números de 1 a 100, um por linha.

//- Para múltiplos de `3`, imprima `"Fizz"` em vez do número.
//- Para múltiplos de `5`, imprima `"Buzz"` em vez do número.
//- Para números que são múltiplos de **ambos** (`3` e `5`), imprima `"FizzBuzz"`.

//Otimize sua solução para ter o menor número possível de caracteres no código.

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 até 100");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){

            if (i % 3 == 0 && i % 5 == 00) System.out.println("FizzBuzz");
            else if (i % 5 == 0 ) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);

        }

        sc.close();
    }
}
