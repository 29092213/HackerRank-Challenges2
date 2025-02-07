package org.example.easy;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        StringBuilder newString = new StringBuilder(name).reverse();

        if (name.equalsIgnoreCase(newString.toString())) System.out.println("yes");
        else { System.out.println("No");}

        sc.close();
    }
}
