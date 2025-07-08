package entities;

public class Account {
    public int number_account;
    public String name;
    public double value;

    public int getNumber_account() {
        return number_account;
    }

    public void setNumber_account(int number_account) {
        this.number_account = number_account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

   public void depoistValue(double value){
        this.value += value;
   }

    public void withdrawValue(double value){
        this.value -= value;
    }

    // System.out.println("Account data: \n Account " + account.number_account + ", Holder: " + account.name + ", Balance: $" + account.value + "\n");

    public String toString() {
        return "Account data: \n Account "
                + number_account
                + ", Holder: " + name
                + ", Balance: $"
                + value
                + "\n";
    }
}
