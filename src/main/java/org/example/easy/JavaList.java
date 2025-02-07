package org.example.easy;

//1️ Escolhe o tamanho do array
//2️ Insere os números iniciais na lista
//3️ Diz quantas operações quer fazer (ex.: 2, 3...)
//4️ Executa cada operação escolhendo "Insert" ou "Delete"

//Se for "Insert", informa o índice e o valor
//Se for "Delete", informa apenas o índice a remover

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number;
        int index;

        ArrayList <Integer> arrayList = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            number = sc.nextInt();
            arrayList.add(number);
        }

        int numeroEscolhas = sc.nextInt();

        for (int j = 0 ; j < numeroEscolhas ; j++){

            String opcaoEsclohida = sc.next();

            if (opcaoEsclohida.equalsIgnoreCase("Insert")){
                index = sc.nextInt();
                number = sc.nextInt();
                arrayList.add(index, number);

            } else if (opcaoEsclohida.equalsIgnoreCase("Delete")) {

                index = sc.nextInt();
                arrayList.remove(index);
            }
        }


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + (i < arrayList.size() - 1 ? " " : ""));
        }

        sc.close();
    }
}
