package entities;

import java.util.Scanner;

public class ProgramWithOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle(); //Triangle a,b,c
        y = new Triangle();

        System.out.print("Enter X, values A, B and C : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("Enter Y, values A, B and C : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.AreaTriangle();
        double areaY = y.AreaTriangle();

        if (areaX > areaY) {
            System.out.printf("Area X maior %.2f%n: ", areaX);
        } else {
            System.out.printf("Area Y maior %.2f%n: ", areaY);
        }

        sc.close();

    }
}
