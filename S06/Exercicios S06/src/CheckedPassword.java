import java.util.Scanner;

public class CheckedPassword {
    public static void main(String[] args) {
        int systemPassword = 2002;
        boolean continueSystem = true;
        Scanner sc = new Scanner(System.in);

        while (continueSystem) {
            System.out.println("Digite sua senha: ");
            int userPassword = sc.nextInt();
            if (systemPassword == userPassword) {
                System.out.println("Acesso permitido");
                continueSystem = false;
                break;
            } else {
                System.out.println("Senha Invalida");
                continueSystem = true;
            }
        }
    }
}