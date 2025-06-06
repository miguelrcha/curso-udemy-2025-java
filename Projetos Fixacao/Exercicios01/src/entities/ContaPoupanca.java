package entities;

import util.ContaCliente;

public class ContaPoupanca {

    ContaCliente contaCliente = new ContaCliente();

    public double incomeTax = 0.05;

    public double newBalanceCalculated (double balanceAccountClient) {
        this.incomeTax = incomeTax;
        contaCliente.balanceAccountClient = balanceAccountClient;

        return contaCliente.balanceAccountClient;
    }
}
