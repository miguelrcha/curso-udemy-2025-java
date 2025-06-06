package entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public Products(String name, double price, int quantity) { // Construtor, executado no momento da execução do projeto
        this.name = name; // this pegar o principal e colocar na nova váriavel criada
        this.price = price;
        this.quantity = quantity;
    }

    public double TotalValueInStock() {
        return quantity * price;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity; //this.QUANTITY -- Auto referência
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { // Importante
        return "Name: " + name +
                ", Price: $ " + String.format("%.2f", price ) +
                ", Total: in stock: " + quantity;
    }
}
