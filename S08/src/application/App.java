package application;

import entities.Products;
import java.util.ArrayList;
import java.util.Scanner;

public class App { //toString
    public static void main(String[] args) {
        boolean continueSystem = true;
        Scanner sc = new Scanner(System.in);

        Products products = new Products();
        System.out.println("Enter product name: ");
        System.out.print("Name of product: ");
        products.name = sc.nextLine();
        System.out.print("Price of product: ");
        products.price = sc.nextDouble();
        System.out.print("Quantity of product: ");
        products.quantity = sc.nextInt();
        System.out.print("Data saved successfully!");

        System.out.println(products);

        System.out.println("Do you want to continue? [Y/N]");
        char continuar = sc.next().charAt(0);
        if (continuar == 'Y') {
            continueSystem = true;
            System.out.println("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();

            products.AddProducts(quantity);
            System.out.print("Data saved successfully! \n");
            System.out.println("Added >> " +products);

            products.RemoveProducts(quantity);
            System.out.println("Enter the number of products to be remove in stock: \n");
            quantity = sc.nextInt();
            System.out.println("Removed >> " + products);

            System.out.println("Do you want to continue? [Y/N]");
            continuar = sc.next().charAt(0);


        } else if (continuar == 'N') {
            continueSystem = false;
            System.out.print("Exit the program...");

        } else {
            System.out.print("Error! Please enter a valid character.");
        }





        sc.close();

    }
}
