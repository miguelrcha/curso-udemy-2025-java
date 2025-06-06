package entities;

import util.ContaCliente;

import java.util.Scanner;

public class ContaBancaria {

    ContaCliente contaCliente = new ContaCliente();

    public void accountCreate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do conta: ");
        contaCliente.nameAccountClient = sc.nextLine();

        System.out.println("digite o saldo atual da conta: ");
        contaCliente.balanceAccountClient = sc.nextDouble();

        for (int i = 1; i < contaCliente.numAccountClient; i++) {}
        int i = contaCliente.numAccountClient;

        System.out.println("\n--/ --dados criados com sucesso!-- /--\n");
    }

    public void setNameClient(String nameAccountClient) {
        contaCliente.nameAccountClient = nameAccountClient;
    }

    public void setNumClient(int numAccountClient) {
        contaCliente.numAccountClient = numAccountClient;
    }

    public void setBalanceClient(double balanceAccountClient) {
        contaCliente.balanceAccountClient = balanceAccountClient;
    }

    @Override
    public String toString() {
        String s = "ContaBancaria";
        s += " \nnomeCliente: " + contaCliente.nameAccountClient;
        s += "; \nnumConta: [ID] " + contaCliente.numAccountClient;
        s += "; \nsaldo: R$" + contaCliente.balanceAccountClient;
        s += "\n";
        return s;
    }

    public double withdrawMoney(double amount) { // sacar(o saldo não pode ficar negativo)
        if (amount > contaCliente.balanceAccountClient) {
            System.out.println("\nsaldo insuficiente.\n");
            return contaCliente.balanceAccountClient;
        }
        contaCliente.balanceAccountClient -= amount;
        System.out.println("\n--/ --saldo atualizado com sucesso!-- /--\n");
        return contaCliente.balanceAccountClient;
    }

    public double depositMoney(double amount) {
        System.out.println("\n--/ --saldo atualizado com sucesso!-- /--\n");
        return contaCliente.balanceAccountClient += amount;

    }

}
