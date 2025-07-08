package application;

import entities.Account;

import java.util.Scanner;


public class AccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter the account number:");
        account.number_account = sc.nextInt();

        System.out.println("Enter the account name:");
        account.name = sc.next();

        System.out.println("Is there a intial deposit value (y/n)?");
        char input = sc.next().charAt(0);

        System.out.println("Enter the account value:");
        account.value = sc.nextDouble();

        System.out.println(account);

        System.out.println("Enter a deposit value:");
        double value = sc.nextDouble();
        account.depoistValue(value);

        System.out.println(account);

        System.out.println("Enter a withdraw value:");
        value = sc.nextDouble();
        account.withdrawValue(value);

        System.out.println(account);

    }
}