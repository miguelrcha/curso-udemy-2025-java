import java.util.Scanner;

public class Activity1E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numberUser = sc.nextInt();

            for (int i = 1; i <= numberUser; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + "\n");
                }
        }

    }
}
