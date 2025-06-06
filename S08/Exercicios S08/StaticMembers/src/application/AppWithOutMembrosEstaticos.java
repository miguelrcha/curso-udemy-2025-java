// Without Membros estáticos

package application;

import util.Calculator;
import java.util.Scanner;

public class AppWithOutMembrosEstaticos {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator.circumference(radius);

        double v = calculator.volume(radius);

        System.out.printf("The circumference of the circumference is %.2f%n", + c);
        System.out.printf("The volume of the circumference is %.2f%n", + v);
        System.out.printf("The PI of the circumference is %.2f%n", calculator.PI);

        sc.close();
    }
}
