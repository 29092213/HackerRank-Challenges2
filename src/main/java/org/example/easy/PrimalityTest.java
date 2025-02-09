package org.example.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        BigInteger name = new BigInteger(n);

        boolean nameDecifrar = name.isProbablePrime(100);

        if (nameDecifrar == true) System.out.println("prime");
        else System.out.println("not prime");

        sc.close();

    }
}