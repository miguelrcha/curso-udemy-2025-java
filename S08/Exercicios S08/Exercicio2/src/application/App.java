package application;

import java.util.Scanner;
import entities.Empolyee;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empolyee empolyee = new Empolyee();
        System.out.println("Enter the name, Gross Salary and Tax of the empolyee: ");
        empolyee.SystemUserName = sc.nextLine();
        empolyee.GrossSalary = sc.nextDouble();
        empolyee.TaxSalary = sc.nextDouble();

        System.out.println("Enter percentage % gross salary of the empolyee: ");
        empolyee.percentageSalary = sc.nextDouble();

        System.out.println(empolyee);



    }
}
