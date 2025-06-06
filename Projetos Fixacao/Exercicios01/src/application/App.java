package application;

import java.util.Scanner;

import entities.ContaBancaria;
import util.ContaCliente;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueSystem = true;
        ContaBancaria contaBancaria = new ContaBancaria();

        while (continueSystem) {
            System.out.println("--/ --- CONTA BANCARIA --- /--");
            System.out.println("[1] - Cadastrar Conta \n");
            System.out.println("[2] - Visualizar Conta \n");
            System.out.println("[3] - Retirar Saldo \n");
            System.out.println("[4] - Depositar Saldo \n");
            int choiceSelectSystem = sc.nextInt();

            switch (choiceSelectSystem) {
                case 1:
                    contaBancaria.accountCreate();
                    break;

                case 2:
                    System.out.println(contaBancaria);
                    break;

                case 3:
                    contaBancaria.withdrawMoney(200);
                    break;

                case 4:
                    contaBancaria.depositMoney(500);
                    break;
            }
        }

    }
}
