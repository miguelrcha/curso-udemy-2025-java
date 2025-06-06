import java.util.Scanner;

public class ConditionalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStarter, numberEnd = 0;

        System.out.println("Informe o começo do ciclo: ");
        numberStarter = sc.nextInt();
        System.out.println("Informe o final do ciclo: ");
        numberEnd = sc.nextInt();

        System.out.println("Ordem Crescente");
        for (numberStarter = 0; numberStarter <= numberEnd; numberStarter++) {
            System.out.println(numberStarter + "\n");
        }
    }
}
