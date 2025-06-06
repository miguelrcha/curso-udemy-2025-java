package entities;

public class Empolyee {
    public String SystemUserName;
    public double GrossSalary;
    public double TaxSalary;
    public double percentageSalary;

    public double NetSalary(double GrossSalary) {
        return GrossSalary - TaxSalary;
    }

    public double IncreaseSalary(double percentageSalary) {
        percentageSalary = percentageSalary / 100;
        percentageSalary = GrossSalary * percentageSalary;
        return GrossSalary + percentageSalary;
    }

    public String toString() {
        return "Empolyee: " + SystemUserName + ", $" + NetSalary(GrossSalary)
                + "\nUpdated data {with percentageSalary} : " + SystemUserName + ", $" + IncreaseSalary(percentageSalary);
    }

}
