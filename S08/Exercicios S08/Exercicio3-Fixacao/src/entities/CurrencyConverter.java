package entities;

public class CurrencyConverter {
    public double dollarPrice;
    public int dollarBought;
    public double IOF = 0.06;

    public double ConverterIOF(double dollarPrice, int dollarBought) {
        dollarPrice = dollarPrice * dollarBought;
        IOF = dollarPrice * IOF;
        dollarPrice = dollarPrice + IOF;
        return dollarPrice;
    }
    public String toString() {
        return "Amount to be paid in reais = " + ConverterIOF(dollarPrice, dollarBought);
    }
}
