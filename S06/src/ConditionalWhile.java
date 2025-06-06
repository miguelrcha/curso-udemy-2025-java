
// boolean continueSystem = true;

import java.util.Scanner;

public class ConditionalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueSystem = true;

        while (continueSystem) {
            String userName = sc.nextLine();
            System.out.print("Enter your name: ");

            if (userName.equals("Miguel")) {
                System.out.println("Sucesso");
            } else {
                System.out.println("Negado acerte o nome darh");
                continueSystem = false;
                break;
            }
        }
    }
}