import java.util.Scanner;

public class ConditionalMultipliFunctions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numberFirst = sc.nextInt();
        int numberSecond = sc.nextInt();

        int higher = max(numberFirst, numberSecond); // variaveis para a nova fucnao

        sc.close();
    }
    public static int max(int a, int b) {
        return a > b ? a : b;

    }
}
