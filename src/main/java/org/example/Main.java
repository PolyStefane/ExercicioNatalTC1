package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de presentes:");
        int x = scanner.nextInt();
        int[] pesos = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Informe o peso numero " + (i+1) + ":");
            pesos[i] = scanner.nextInt();
        }

        System.out.println(Balanca.Equilibrou(pesos));
    }

}
