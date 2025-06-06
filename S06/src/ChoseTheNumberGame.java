import java.util.Scanner;
import java.util.Random; // Randi Librarie

public class ChoseTheNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueSystem = true;
        Random random = new Random();

        while (continueSystem) {
            int numberSystem = random.nextInt(10); // Randi Librarie
            int numberUser = 0;

            System.out.println("Acerte um numero de 0 até 10: ");
            numberUser = sc.nextInt();

            if (numberSystem > numberUser) {
                System.out.println("O número do sistema é maior que " + numberUser + ".");
                continueSystem = true;
            } else if (numberSystem < numberUser) {
                System.out.println("O número do sistema é menor que " + numberUser + ".");
                continueSystem = true;
            } else if (numberSystem == numberUser) {
                System.out.println("Sucesso! Voçê acertou o número do sistema!!");
                continueSystem = false;
                break;
            }
        }
    }
}
