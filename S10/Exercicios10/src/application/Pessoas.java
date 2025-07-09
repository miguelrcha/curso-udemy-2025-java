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
            System.out.println("dados - " + i);
            name[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        // Média da altura
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }
        double avgAltura;
        avgAltura = soma / n;
        System.out.println("Altura média : " + avgAltura);

        // % de quem tem menos de 16 anos
        int cont = 0;
        for(int i=0; i<n; i++) {
            if(idade[i] < 16) {
                cont++;
            }
        }

        double percent = cont * 100.0 / n;

        System.out.println("Pessoas que tem menos de 16 anos : %.1f%%%n" + percent);

        // Nomes de quem tem menos de 16 anos

        for(int i=0; i<n; i++) {
            if(idade[i] < 16) {
                System.out.println(name[i]);
            }
        }

    }
}
