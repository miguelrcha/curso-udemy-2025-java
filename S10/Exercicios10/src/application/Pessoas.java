package application;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }

        double avgAltura;
        avgAltura = soma / n;

        System.out.println("Altura média :" + avgAltura);

    }
}
