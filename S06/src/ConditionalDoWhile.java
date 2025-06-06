import java.util.Scanner;

public class ConditionalDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char whileSystem = 'S'; // Forçando o Sistema a repetir o processo

        do {
            System.out.println("Digite o valor da temperatura em Celsius: ");
            double tempCelsius = sc.nextDouble();
            double tempFahrenheit = tempCelsius * 1.8 + 32;

            System.out.println(tempCelsius + "C | " + tempFahrenheit + "F");

            System.out.println("Deseja repetir o processo S/N? ");
            whileSystem = sc.next().charAt(0); // Decisão de escolha
        } while (whileSystem != 'N');

        sc.close();
    }
}
