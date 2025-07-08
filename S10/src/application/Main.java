package application;

import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] v = new Product[n];

        for (int i = 0; i < v.length; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            v[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < v.length; i++) {
            sum = sum + v[i].getPrice();
        }

        double avg = sum / v.length;

        System.out.println("AVERAGE HIGH: " + avg);
    }
}
