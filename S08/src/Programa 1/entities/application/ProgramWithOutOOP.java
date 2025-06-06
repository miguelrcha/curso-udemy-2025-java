package application;

import java.util.Scanner;

public class ProgramWithOutOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC = 0;
        double yA, yB, yC = 0;

        System.out.println("Valor do lado X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Valor do lado Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yB) * (p - yC));

        if (areaX > areaY) {
            System.out.printf("Area X maior %.4f%n: ", areaX);
        } else {
            System.out.printf("Area Y maior %.4f%n: ", areaY);
        }

        sc.close();

    }
}
