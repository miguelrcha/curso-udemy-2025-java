package application;

import java.util.Scanner;
import java.util.Vector;

public class VetoresPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        String[] email = new String[n];
        int[] roomNum = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            name[i] = sc.next();
            System.out.println("Email: ");
            email[i] = sc.next();
            System.out.println("Room: ");
            roomNum[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(roomNum[i] < roomNum.length + 1);
            System.out.print(roomNum[i] + ":" + " Name:" + name[i] + " Email:" + email[i] + "\n");
        }

    }
}
