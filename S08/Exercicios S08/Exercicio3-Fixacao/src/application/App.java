package application;

import entities.CurrencyConverter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        currencyConverter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        currencyConverter.dollarBought = sc.nextInt();

        System.out.println(currencyConverter);
    }
}
