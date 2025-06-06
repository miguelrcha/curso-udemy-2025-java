// Não funciona

import java.util.Scanner;

public class ConditionalVetorStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namesSystem = sc.nextLine();

        for (int i = 0; i < 2; i++) {
            System.out.print("Insira o nome de pessoas: ");
            namesSystem = sc.nextLine();
            String[] vect = namesSystem.split(" ");
            String names = vect[i];

            for(i = 0; i < 2; i++){
                System.out.print(names + "\n" + i);
            }
        }
    }
}
