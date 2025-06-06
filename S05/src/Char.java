import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        String userName;
        String userYearsOld;
        String userCountry;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        userName = sc.nextLine();
        userYearsOld = sc.nextLine();
        userCountry = sc.nextLine();
        sc.close();

        System.out.println("Dados do Usuário: ");
        System.out.println("Nome: "+ userName);
        System.out.println("Idade: "+ userYearsOld + " anos");
        System.out.println("Nacionalidade: "+ userCountry);


    }
}
