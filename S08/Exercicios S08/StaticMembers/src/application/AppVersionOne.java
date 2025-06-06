// Without Membros estáticos

package application;

import java.util.Scanner;

public class AppVersionOne {

    public static final double PI = 3.14159265358979323846;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("The circumference of the circumference is %.2f%n", + c);
        System.out.printf("The volume of the circumference is %.2f%n", + v);
        System.out.printf("The PI of the circumference is %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3;
    }
}
