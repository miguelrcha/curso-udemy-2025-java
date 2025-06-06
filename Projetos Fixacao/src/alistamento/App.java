package alistamento;

import java.util.Scanner;
import agentes.Alistamento_Dados;

public class App {
    public static void main(String[] args) {
        Alistamento_Dados pessoa = new Alistamento_Dados();
        char YesOrNo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja acessar este aplicativo S/N: ");
        YesOrNo = sc.next().charAt(0);

        if (YesOrNo == 'S') {
            int escSystem = 0;
            boolean continueSystem = true;

            Alistamento_Dados user = Alistamento_Dados.alistamento_Dados();

            String userName = user.Name;
            String userCountry = user.Country;
            long userCPF = user.CPF;
            char userGender = user.Gender;
            int userYearsOld = user.YearsOld;
            int calculatorYearsOld = 0;


            while (continueSystem) {
                System.out.println("--/ BEM VINDO AO ALISTAMENTO /--\n");
                System.out.println("[1] - Sobre o programa de Alistamento");
                System.out.println("[2] - Editar seus dados para alistamento");
                System.out.println("[3] - Visualizar seus dados do alistamento");
                System.out.println("[4] - Excluir seus dados do alistamento");
                System.out.println("[5] - Sair do programa");
                escSystem = sc.nextInt();

                switch (escSystem) {
                    case 1:
                        System.out.println("--- Sobre o programa de Alistamento ---");
                        System.out.println("O alistamento militar é obrigatório para todos os jovens do sexo masculino que completam 18 anos \n entre 1º de janeiro e 30 de junho. Pode ser feito online ou presencialmente.\n");
                        break;

                    case 2:
                        System.out.println("--- Editar seus dados para alistamento ---");
                        System.out.println("Insira seu nome completo: ");
                        userName = sc.next();
                        System.out.println("Insira seu CPF (apenas dígitos): ");
                        userCPF = sc.nextLong();
                        System.out.println("Insira seu ano de nascimento: ");
                        userYearsOld = sc.nextInt();
                        System.out.println("Insira seu sexo M/F: ");
                        userGender = sc.next().charAt(0);
                        System.out.println("Insira seu estado natal (Exemplo: 'SC'): ");
                        userCountry = sc.next();

                        calculatorYearsOld = 2025 - userYearsOld;

                        System.out.println("Dados editados com sucesso! \n");
                        break;

                    case 3:
                        boolean validateYears = true;

                        System.out.println("--- Visualizar seus dados do alistamento ---");
                        System.out.print("Dados do usuário:\n");
                        System.out.println("Nome do usuário: " + userName);
                        System.out.println("CPF do usuário: " + userCPF);
                        System.out.println("Ano de Nascimento: " + userYearsOld);
                        System.out.println("Sexo: " + userGender);
                        System.out.println("Estado Natal: " + userCountry + "\n");

                        if (calculatorYearsOld < 18) {
                            validateYears = false;
                            System.out.println("Status para se alistar: " + validateYears);
                            break;
                        } else {
                            validateYears = true;
                            System.out.println("Status para se alistar: " + validateYears);
                        }
                        break;

                    case 4:
                        userName = "";
                        userCountry = "";
                        userCPF = 0;
                        userGender = 0;
                        userYearsOld = 0;

                        System.out.println("--- Excluir seus dados do alistamento ---");
                        System.out.print("Dados do usuário:\n");
                        System.out.println("Nome do usuário: " + userName);
                        System.out.println("CPF do usuário: " + userCPF);
                        System.out.println("Ano de Nascimento: " + userYearsOld);
                        System.out.println("Sexo: " + userGender);
                        System.out.println("Estado Natal: " + userCountry + "\n");

                        System.out.println("Dados excluidos com sucesso!");
                        break;

                    case 5:
                        System.out.println("--- Sair do programa ---");
                        continueSystem = false;
                        break;
                }

            }

        } else {
            System.out.println("Fechado o aplicativo...");
        }
    }
}
