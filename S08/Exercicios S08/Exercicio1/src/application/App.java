package application;

import entities.Rectangle;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();
    System.out.println("Enter the width of the rectangle: ");
    rectangle.width = sc.nextDouble();
    System.out.println("Enter the height of the rectangle: ");
    rectangle.height = sc.nextDouble();

    System.out.println(rectangle);


    }
}
