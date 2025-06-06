package agentes;

import java.util.Scanner;

public class Alistamento_Dados {
    public String Name, Country;
    public int YearsOld;
    public long CPF;
    public char Gender;

    public static Alistamento_Dados alistamento_Dados() {
        Scanner sc = new Scanner(System.in);
        Alistamento_Dados user = new Alistamento_Dados();

        System.out.println("--- Salvar seus dados para alistamento ---");
        System.out.print("Insira seu nome completo: ");
        user.Name = sc.next();
        System.out.print("Insira seu CPF (apenas dígitos): ");
        user.CPF = sc.nextLong();
        System.out.print("Insira seu ano de nascimento: ");
        user.YearsOld = sc.nextInt();
        System.out.print("Insira seu sexo M/F: ");
        user.Gender = sc.next().charAt(0);
        System.out.print("Insira seu estado natal (Exemplo: 'SC'): ");
        user.Country = sc.next();
        System.out.println("Dados salvos com sucesso! \n");

        return user;
    }
}
